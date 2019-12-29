grammar ExprGrammarAction;
@header { package gen.grammarGrammarAction; }
@parser::members {
    Map<String, Integer> memory = new HashMap<String, Integer>();

    int eval(int left, int op, int right) {
        switch ( op ) {
            case POW : return (int) Math.pow(left, right);
            case MUL : return left * right;
            case DIV : return left / right;
            case ADD : return left + right;
            case SUB : return left - right;
            case EQUAL : return left == right ? 1 : 0;
            case SMALLER : return left < right ? 1 : 0;
            case TALLER : return left > right ? 1 : 0;
        }
        return 0;
    }
}

prog    returns [int value]
        : stat+                                     {$value = $stat.value;}
        ;

stat    returns [int value]
        : expr (NEWLINE| ' ')                       {$value = $expr.value;}
        | ID '=' expr NEWLINE                       {memory.put($ID.text, $expr.value);}
        | 'clear' NEWLINE                           {memory.clear();}
        | 'if (' expr ') ' a=stat 'else ' b=stat    {$value = $expr.value == 1 ? $a.value : $b.value;}
        | NEWLINE
        ;

expr     returns [int value]
        : INT                                       {$value = $INT.int;}
        | ID
        {
            String id = $ID.text;
            $value = memory.containsKey(id) ? memory.get(id) : 0;
        }
        | <assoc=right> a=expr op='^' b=expr        {$value = eval($a.value, $op.type, $b.value);}
        | a=expr op=('*'|'/') b=expr                {$value = eval($a.value, $op.type, $b.value);}
        | a=expr op=('+'|'-') b=expr                {$value = eval($a.value, $op.type, $b.value);}
        | a=expr op=('=='|'<'|'>') b=expr           {$value = eval($a.value, $op.type, $b.value);}
        | a=expr '?' b=expr ':' c=expr              {$value = $a.value == 1 ? $b.value : $c.value;}
        | '(' expr ')'                              {$value = $expr.value;}
        ;

POW     : '^';
MUL     : '*';
DIV     : '/';
ADD     : '+';
SUB     : '-';
EQUAL   : '==';
SMALLER : '<';
TALLER  : '>';

ID      : [a-zA-Z]+;
INT     : [0-9]+;
NEWLINE : '\n';

OTHER   : ([ \r\t])+ -> skip;
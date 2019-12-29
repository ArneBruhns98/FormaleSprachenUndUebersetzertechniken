grammar ExprVisitorListener;
@header { package gen.grammarVisitorListener; }

prog    : stat+
        ;

stat    : expr NEWLINE                  #getResult
        | ID '=' expr NEWLINE           #assignment
        | 'clear' NEWLINE               #clear
        | NEWLINE                       #blank
        ;

expr    : INT                           #int
        | ID                            #id
        | <assoc=right> expr '^' expr   #potency
        | expr op=('*'|'/') expr        #MUlDiv
        | expr op=('+'|'-') expr        #AddSub
        | expr op=('=='|'<'|'>') expr   #comparison
        | expr '?' expr ':' expr        #conditionalExpression
        | '(' expr ')'                  #bracket
        ;

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
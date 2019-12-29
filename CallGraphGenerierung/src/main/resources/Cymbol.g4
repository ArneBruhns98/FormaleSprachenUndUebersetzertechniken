grammar Cymbol;
@header { package gen.grammar.cymbol; }

file:   (functionDecl | varDecl)+ ;

varDecl
    :   type ID ('=' expr)? ';'
    ;
type:   'float' | 'int' | 'void' ;              // user-defined types

functionDecl
    :   type ID '(' formalParameters? ')' block // "void f(int x) {...}"
    ;
formalParameters
    :   formalParameter (',' formalParameter)*
    ;
formalParameter
    :   type ID
    ;

block:  '{' stat* '}' ;                         // possibly empty statement block
stat:   block                                   #blockExpression
    |   varDecl                                 #varDeclExpression
    |   'if' expr 'then' stat ('else' stat)?    #ifelse
    |   'return' expr? ';'                      #return
    |   expr '=' expr ';'                       #assignment
    |   expr ';'                                #funcCall
    ;

expr:   ID '(' exprList? ')'                        #callFunction
    |   ID '[' expr ']'                             #arrayIndex
    |   '-' expr                                    #unaryMinus
    |   '!' expr                                    #booleanNot
    |   expr ('*'|'/') expr                         #muldiv
    |   expr ('+'|'-') expr                         #addsub
    |   expr ('!='| '<'|'>'|'>='|'<='|'==') expr    #comparison
    |   ID                                          #variableReference
    |   INT                                         #int
    |   '(' expr ')'                                #bracket
    ;
exprList : expr (',' expr)*                     #listExpr
    ;

ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INT :   [0-9]+ ;

WS  :   [ \t\n\r]+ -> skip ;
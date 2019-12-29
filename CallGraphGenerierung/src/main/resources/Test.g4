grammar Test;

file:  include? (functionDecl | varDecl)+ ;

include: '#include' '<stdio.h>';

functionDecl
    :   type ID '(' formalParameters? ')' block
    ;

formalParameters
    :   formalParameter (',' formalParameter)*
    ;
formalParameter
    :   type ID
    ;

stat:   block
    |   varDecl
    |   ifStat
    |   forStat
    |   whileStat
    |   returnStat ';'
    |   assignStat  ';'
    |   printStat  ';'
    |   expr ';'
    ;

block:  '{' stat* '}' ;

assignStat: ID '=' expr ;

ifStat: 'if' '('bexpr ')' stat ('else' stat)? ;

forStat: 'for' '(' assignStat ';' bexpr ';' assignStat ')' stat ;

whileStat: 'while' '('bexpr')' stat ;

returnStat: 'return' expr ;

args : (expr (',' expr)*)? ;

printStat: 'printf' '(' FORMAT ',' expr ')';

varDecl:   type ID ';' ;

type:   'float' | 'int'  ;

expr:   op = '-' expr
    |   expr op=('*'|'/') expr
    |   expr op=('+'|'-') expr
    |   ID
    |   INT
    |   '(' expr ')'
    |   ID '(' args ')'
    ;

bexpr:   '!' bexpr
    |   expr op=('=='|'!='|'<'|'>') expr
    |   'true'
    |   'false'
    |   '(' bexpr ')'
    ;

ID      : LETTER (LETTER | [0-9])* ;
INT     : [0-9]+ ;
FORMAT  : '\"%d\n\"';

fragment LETTER : [a-zA-Z] ;

WS  :   [ \t\n\r]+ -> skip ;
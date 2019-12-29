grammar Cymbol;

@header { package grammar.cymbol; }

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

stat:   block               #stat_block
    |   varDecl             #stat_varDecl
    |   ifStat              #stat_ifStat
    |   forStat             #stat_forStat
    |   whileStat           #stat_whileStat
    |   returnStat ';'      #stat_returnStat
    |   assignStat  ';'     #stat_assignStat
    |   printStat  ';'      #stat_printStat
    |   expr ';'            #stat_expr
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

expr:   op = '-' expr                   #negative
    |   expr op=('*'|'/') expr          #muldiv
    |   expr op=('+'|'-') expr          #addsub
    |   ID                              #id
    |   INT                             #int
    |   '(' expr ')'                    #bracket
    |   ID '(' args ')'                 #call
    ;

bexpr:   '!' bexpr                          #not
    |   expr op=('=='|'!='|'<'|'>') expr    #comparison
    |   'true'                              #true_expr
    |   'false'                             #false_expr
    |   '(' bexpr ')'                       #brackt_bexpr
    ;

ID      : LETTER (LETTER | [0-9])* ;
INT     : [0-9]+ ;
FORMAT  :  '"''%''d' ('\\''n')? '"' ;
COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
WS  :   [ \t\r\n]+ -> skip ;


fragment LETTER : [a-zA-Z] ;
grammar TaskThree;

prog    : stat+;
stat    : expr NEWLINE | NEWLINE;
expr    : NUMBER | '(' expr ')' | <assoc=left> expr '*' expr| <assoc=left> expr '/' expr | <assoc=left> expr '+' expr | <assoc=left> expr '-' expr;

NUMBER  : [0-9]+;
NEWLINE : '\n';

OTHER   : ([ \r\t])+ -> skip;
grammar TaskTwo;

prog    : stat+;
stat    : expr NEWLINE | NEWLINE;
expr    : term | term ('+' term | '-' term)+;
term    : fact | fact ('*' fact | '/' fact)+;
fact    : NUMBER | '+' fact | '-' fact | '(' expr ')';

NUMBER  : [0-9]+;
NEWLINE : '\n';

OTHER   : ([ \r\t])+ -> skip;
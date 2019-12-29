grammar TaskOne;

prog    : stat | prog stat;
stat    : expr NEWLINE | NEWLINE;
expr    : term | expr ('+' | '-') term;
term    : fact | term ('*' | '/') fact;
fact    : NUMBER | '(' expr ')';

NUMBER  : [0-9]+;
NEWLINE : '\n';

OTHER   : ([ \r\t])+ -> skip;
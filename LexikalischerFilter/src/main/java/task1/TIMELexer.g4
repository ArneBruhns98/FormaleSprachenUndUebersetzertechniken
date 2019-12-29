lexer grammar TIMELexer;

TIME    : HOUR ':' MINSEC (':' MINSEC)?;

fragment HOUR    : ([2] [0-3] | [0-1] [0-9]);
fragment MINSEC  : FIRSTDIGIT SECONDDIGIT;

fragment FIRSTDIGIT     : [0-5];
fragment SECONDDIGIT    : [0-9];

OTHER : . -> skip;
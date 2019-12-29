lexer grammar IPLexer;

IPADRESS : PART '.' PART '.' PART '.' PART;
fragment PART: ([1-9]?[0-9]| [1][0-9][0-9] | [2][0-4][0-9] | [2][5][0-5]);

OTHER : . -> skip;
lexer grammar HalsteadLexer;

IGNORE      : '\\'|')'|'}'|']'|'do'|'#include <' COMMENT '.h>'|'/*' COMMENT '*/';
OPERATOR    : SCSPEC | TYPE_QUAL | RESERVED | OPERATORS;
OPERAND     : IDENTIFER | TYPESPEC | CONSTANT;

fragment IDENTIFER  :  LETTER (LETTER | DIGIT)*;

fragment TYPESPEC   : 'bool'|'char'|'double'|'float'|'int'|'long'|'short'|'signed'|'unsigned'|'void';

fragment CONSTANT   : STRING | NUMBER;

fragment SCSPEC     : 'auto'|'extern'|'inline'|'register'|'static'|'typedef'|'virtual'|'mtuable';

fragment TYPE_QUAL  : 'const'|'friend'|'volatile';

fragment RESERVED   : 'asm'|'case'|'class'|'continue'|'default'|'delete'|'while ('| 'else'|'enum'|'for ('
                    |'goto'|'if ('|'new'|'operator'|'private'|'protected'|'public'|'return'|'sizeof'|'struct'|'switch ('
                    |'this'|'union'|'namespace'|'using'|'try'|'catch'|'throw'|'const_cast'|'static_cast'|'dynamic_cast'
                    |'reinterpret_cast'|'typeid'|'template'|'explicit'|'true'|'false'|'typename';

fragment OPERATORS  : '!'|'!='|'%'|'%='|'&'|'&&'|'&='|'('|'*'|'*='|'+'|'++'|'+='|','|'-'|'--'|'-='|'->'|'...'|'/'|'/='
                    |'::'|'<'|'<<'|'<<='|'<='|'=='|'>'|'>='|'>>'|'>>='|'?'|'['|'^'|'^='|'{'|'||'|'='|'~'|';'|'\''|':';

fragment STRING     : '"' (LETTER | DIGIT | OPERATORS | ' ')+ '"';

fragment COMMENT    : (LETTER | DIGIT | OPERATORS | ' ')*;

fragment NUMBER     : DIGIT+;

fragment LETTER     : [a-zA-Z];

fragment DIGIT      : [0-9];

OTHER       : ([ \r\n\t])+ -> skip;
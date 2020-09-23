grammar dior;

file
: code
| EOF
;

code
: statement ';' code
| statement ';'
;

statement
: declaration
| assignment
| print
;

declaration
: 'var' ID
;

assignment
: ID '=' expression
;

expression
: ID
| INT
| addExpression
;

addExpression
: unaryExpression '+' expression
;

unaryExpression
: ID
| INT
;

print
: 'print' ID
;

ID: ('a'..'z')+;
INT: ('0'..'9')+;
WS: [ \n\t\r]+ -> skip;
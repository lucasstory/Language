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
| ifStatement
| whileStatement
| forStatement
| print
;

declaration
: 'var' ID
;

assignment
: ID '=' expression
;

ifStatement
: 'if' '(' statement ')' code
| 'if' '(' statement ')'
;

whileStatement
: 'while' '('statement')'
;


forStatement : 'for' ('(')? forConditions (')')? statement ;

forConditions : iterator=unaryExpression  'from' startExpr=expression range='to' endExpr=expression ;

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
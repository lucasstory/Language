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
| loop
| assignment
| printOut
| expression
| conditionalStatements
;

declaration
: 'var' ID
;

loop
: headloop statement+ endloop
;

headloop
: 'loop' conditionalStatements 'continue'
;

endloop
: 'end loop'
;

assignment
: ID EQUALS expression
;

expression
: unaryExpression
| addExpression
;

addExpression
: unaryExpression '+' expression
;

conditionalStatements
: unaryExpression '<' unaryExpression
| unaryExpression '>' unaryExpression
| unaryExpression '=' unaryExpression
| unaryExpression '=>' unaryExpression
| unaryExpression '<=' unaryExpression
;

unaryExpression
: ID
| INT
;

printOut
: 'print' ID
;

ID : [a-zA-Z0-9]+ ;

INT: ('0'..'9')+ ;

WS:	[ \n\t\r]+ -> skip ;

EQUALS
: '='
;
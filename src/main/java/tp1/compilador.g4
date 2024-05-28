grammar compilador;
@header {
package tp1;
}


fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

WS : [ \t\n\r] -> skip ;

//separadores
PA : '(' ;
PC : ')' ;
LLA : '{' ;
LLC : '}' ;
PYC : ';' ;
IGUAL : '=' ;
COMA : ',';

//comparaciones
EQUAL : '==' ;
MAY : '>';
MAYEQUAL : '>=' ; 
MEN : '<';
MENEQUAL : '<=' ;
NOTEQUAL : '!=' ;

//logicas
Y : '&&';
O : '||';

//operaciones
SUMA : '+' ;
RESTA : '-' ;
MULT : '*' ;
DIV : '/' ;
MOD : '%' ;

//tipo de variables
INT : 'int' ;
FLOAT : 'float' ;
BOOLE : 'bool' ;

//booleanos
TRUE : 'true' ;
FALSE : 'false' ;

//estrucutras
IWHILE : 'while' ;
IIF : 'if' ;
IELSE : 'else' ;
IFOR : 'for' ;
IRETURN : 'return'; 

NUMERO : DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;


programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : declaracion
            | asignacion
            | condicional
            ;

porcion : LLA instrucciones LLC PYC;

declaracion : tipoVariable ID PYC 
            | tipoVariable ID IGUAL exp PYC
            ;


tipoVariable  : INT 
              | FLOAT
              | BOOLE
              ;

asignacion : ID IGUAL exp PYC ;

expresiones : exp PYC expresiones
            | EOF
            ;


exp : term t ;

term : factor f ;

t : SUMA  term t
  | RESTA term t
  |
  ;

factor : NUMERO
       | ID
       | operadorBool
       | PA exp PC
       ;

f : MULT factor f
  | DIV  factor f
  | MOD  factor f
  |
  ;

condicional : IIF PA expbool PC porcion;

expbool : exp comparadores exp
        | expbool operadorLogico expbool
        | operadorBool operadorLogico operadorBool
        | operadorBool
        ;
        
comparadores: EQUAL
            | MAY 
            | MAYEQUAL  
            | MEN 
            | MENEQUAL    
            | NOTEQUAL 
            ;

operadorLogico: O
              | Y
              ;

operadorBool: TRUE
            | FALSE
            ;
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
PUNTO: '.';

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
VOID : 'void';

//booleanos
TRUE : 'true' ;
FALSE : 'false' ;

//estrucutras
IWHILE : 'while' ;
IIF : 'if' ;
IELSE : 'else' ;
IFOR : 'for' ;
IRETURN : 'return'; 

NUMERO : RESTA DIGITO+ | DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

FLOTANTE : DIGITO+ PUNTO DIGITO+;



programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : declaracion PYC
            | asignacion
            | bucleWhile
            | bucleFor
            | condicional
            | prototipoFuncion
            | declaracionFuncion
            | llamadoFuncion
            | retorno
            | condicion
            | incremento
            ;

bloque : LLA instrucciones LLC (PYC|);

declaracion : tipoVariable ID
            | tipoVariable ID IGUAL exp
            ;


tipoVariable  : INT 
              | FLOAT
              | BOOLE
              | VOID
              ;

asignacion  : ID IGUAL exp PYC 
            | ID IGUAL condicion PYC
            ;

retorno: IRETURN factor PYC;


expresiones : exp PYC expresiones
            | EOF
            ;


exp : term t ;

term : factor f ;

t : SUMA  term t
  | RESTA term t
  |
  ;

factor: NUMERO
      | ID
      | FLOTANTE
      | operadorBool
      | PA exp PC
      ;

f : MULT factor f
  | DIV  factor f
  | MOD  factor f
  |
  ;

condicional : IIF PA condicion PC bloque (condicionalElse|);

condicionalElse : IELSE bloque
                | IELSE condicional
                ;




bucleWhile: IWHILE PA condicion PC bloque;

bucleFor: IFOR PA (declaracion PYC condicion PYC incremento) PC bloque;

prototipoFuncion: tipoVariable ID PA argumentos PC PYC;

declaracionFuncion: declaracion PA argumentos PC bloque;

llamadoFuncion: ID PA datos PC PYC;

datos : ID datos
      | COMA datos 
      | 
      ;

argumentos: tipoVariable ID argumentos
          | COMA argumentos
          | 
          ;

condicion : exp comparadores exp
        | condicion operadorLogico condicion
        | operadorBool operadorLogico operadorBool
        | operadorBool
        | ID
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

incremento: ID SUMA SUMA
          | SUMA SUMA ID
          | ID RESTA RESTA (PYC|)
          | ID IGUAL exp
          ;
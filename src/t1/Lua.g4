/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
/*
 *
 *   a) Palavras reservadas (todas)
 *   b) Símbolos reservados (todos)
 *   c) Nomes
 *   d) Cadeias de caracteres (apenas as versões curtas, sem sequência de escape, quebras de
 *                                      linha não permitidas)
 *   e) Constantes numéricas (apenas decimais, sem sinal, com dígitos antes e depois do
 *                              ponto decimal opcionais)
 *   d) Espaços em branco e comentários curtos deverão ser IGNORADOS pelo analisador
 *         léxico. 
 *
 */

grammar Lua;

@members {
   public static String grupo="<<551732, >>";
}


//espaço em branco e comentarios
Whitespace : (' '|'\t'| '\r'| '\n') {skip();}; 

Comentario : '--'~('\n'|'\r')* '\r'? '\n'{skip();};   

//numero cadeia e nomes
Numero : ('0'..'9')+ ('.'('0'..'9')+)?;

//Cadeia : '"'(~('\\'|'"') )* '"'| '\''~( '\''| '\\')* '\'';
Cadeia : '"'(~('\\'|'"') )* '"';

Nome : ('a'..'z'| 'A'..'Z') ('a'..'z'| 'A'..'Z'| '0'..'1')*;

programa : trecho;

trecho : (comando (';' )?)* (ultimocomando (';')?)?;

bloco : trecho;

ultimocomando : 'return' (listaexp)? | 'break';

listaexp : (exp ',')* exp;

prog: Numero | Cadeia;

//Palavras reservadas
comando : listavar '=' listaexp |
            chamadadefuncao |
            'do' bloco 'end' |
            'while' exp 'do' bloco 'end' |
            'repeat' bloco 'until' exp |
            'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end' |
            'for' Nome '='exp ',' exp (',' exp)? 'do' bloco 'end' |
            'for' listadenomes 'in' listaexp 'do' bloco 'end' |
            'function' nomedafuncao corpodafuncao |
            'local' 'function' Nome corpodafuncao |
            'local' listadenomes ('=' listaexp)?;

listavar : var (',' var)*;

expprefixo : var | chamadadefuncao | '('  exp ')';
/*exp : 'nil' | 'false' | 'true' | Numero | Cadeia | '...'| funcao |
        expprefixo | construtortabela | exp opbin exp | opunaria exp;*/

exp : 'nil' | 'false' | 'true' | Numero | Cadeia | '...'| funcao |
        expprefixo | construtortabela | exp2 opbin exp | opunaria exp;


//exp: exp2 opbin exp | funcao
exp2: 'nil' | 'false' | 'true' | Numero | Cadeia | '...'| funcao |
        expprefixo | construtortabela | opunaria exp;

/*exp: exp opbin exp | funcao
exp : funcao exp2;
exp2 : opbin exp exp2 | null;      */


separadordecampos : ','| ';';
campo : '[' exp ']' '=' exp | Nome '=' exp | exp;
listadecampos : campo (separadordecampos campo)* (separadordecampos)?;
construtortabela : '{' (listadecampos)? '}';
args : '(' (listaexp)?')' | construtortabela | Cadeia;
//chamadadefuncao : expprefixo args | expprefixo ':' Nome args;
chamadadefuncao : Nome args | Nome ':' Nome args;

nomedafuncao : Nome ('.' Nome)* (':'  Nome)?;        

var : Nome ('.' Nome)*;

//var : Nome | expprefixo '[' exp ']' | expprefixo '.' Nome;

funcao : 'function' corpodafuncao;

corpodafuncao : '(' (listapar)? ')'  bloco 'end';
listapar : listadenomes (',' '...')? | '...';
            
opbin : '+'| '-'| '*' | '/'| '^'| '%'| '..' |
        '<'| '<='| '>'| '>='| '==' | '~=' | 'and' | 'or' ;


opunaria : '-'| 'not' | '#';
            
listadenomes : Nome (','Nome)*;


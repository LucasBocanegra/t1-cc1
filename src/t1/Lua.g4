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
   public static String grupo="<<551732, 551961>>";
}


//espaço em branco e comentarios
Whitespace : (' '|'\t'| '\r'| '\n') {skip();};

Comentario : '--'~('\n'|'\r')* '\r'? '\n'{skip();};

//numero, cadeia e nomes
Numero : ('0'..'9')+ ('.'('0'..'9')+)?;

Cadeia : '"'(~('\\'|'"') )* '"' | '\''~( '\''| '\\')* '\'';

Nome : ('a'..'z'| 'A'..'Z') ('a'..'z'| 'A'..'Z'| '0'..'1')*;

programa : trecho;

trecho : (comando (';')?)* (ultimocomando (';')?)?;

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
          // Para o for com variável para controle de loop, é adicionada a variável à tabela de símbolos
          'for' Nome { TabelaDeSimbolos.adicionarSimbolo($Nome.text,Tipo.VARIAVEL); } '=' exp ',' exp (',' exp)? 'do' bloco 'end' |
          'for' listadenomes 'in' listaexp 'do' bloco 'end' |
          // Ao definir uma função, adicionar o seu nome à tabela de símbolos (seja ela local ou não)
          'function' nomedafuncao { TabelaDeSimbolos.adicionarSimbolo($nomedafuncao.text,Tipo.FUNCAO); } corpodafuncao |
          'local' 'function' Nome { TabelaDeSimbolos.adicionarSimbolo($Nome.text,Tipo.FUNCAO); } corpodafuncao |
          'local' listadenomes ('=' listaexp)?;

// Lista de variáveis, adicionando cada uma delas à tabela de símbolos
listavar : var { TabelaDeSimbolos.adicionarSimbolo($var.text,Tipo.VARIAVEL); } (',' var { TabelaDeSimbolos.adicionarSimbolo($var.text,Tipo.VARIAVEL); } )*;

// Prefixo de expressão
expprefixo : var { TabelaDeSimbolos.adicionarSimbolo($var.text,Tipo.VARIAVEL); } | chamadadefuncao | '('  exp ')';

// Expressão: a recursividade foi removida utilizando a expressão exp2 abaixo
exp : 'nil' | 'false' | 'true' | Numero | Cadeia | '...'| funcao |
        expprefixo | construtortabela | exp2 opbin exp | opunaria exp;

// Criada para remover a recursividade à esquerda da exp, através da remoção da condição
// em que se criaria 'exp opbin exp'
exp2: 'nil' | 'false' | 'true' | Numero | Cadeia | '...'| funcao |
        expprefixo | construtortabela | opunaria exp;

// expressões relativas aos campos e tabela
separadordecampos : ','| ';';
campo : '[' exp ']' '=' exp | Nome '=' exp | exp;
listadecampos : campo (separadordecampos campo)* (separadordecampos)?;
construtortabela : '{' (listadecampos)? '}';
args : '(' (listaexp)?')' | construtortabela | Cadeia;

// expprefixo2 é utilizado em vez de expprefixo em chamadadefuncao para que não exista
// recursão mútua à esquerda, já que expprefixo2 é um subconjunto de expprefixo (não gera chamadadefuncao novamente)
expprefixo2:  Nome ('[' exp ']' | '.' Nome)*;
chamadadefuncao : expprefixo2 { TabelaDeSimbolos.adicionarSimbolo($expprefixo2.text,Tipo.FUNCAO); } (':' Nome)? args;

// Nome da função
nomedafuncao : Nome ('.' Nome)* (':'  Nome)?;

// definição de variável
var : Nome | expprefixo2 '[' exp ']' | expprefixo2 '.' Nome;

// Definição de função
funcao : 'function' corpodafuncao;
corpodafuncao : '(' (listapar)? ')'  bloco 'end';

// Lista de Pares
listapar : listadenomes (',' '...')? | '...';

// Operadores binários (aritméticos, comparativos e lógicos)
opbin : '+'| '-'| '*' | '/'| '^'| '%'| '..' |
        '<'| '<='| '>'| '>='| '==' | '~=' | 'and' | 'or' ;

// Operadores unários (sinal de número, negação e contagem)
opunaria : '-'| 'not' | '#';

// Lista de Nomes, adicionando cada nome à tabela de símbolos
listadenomes : Nome { TabelaDeSimbolos.adicionarSimbolo($Nome.text,Tipo.VARIAVEL); } (','Nome { TabelaDeSimbolos.adicionarSimbolo($Nome.text,Tipo.VARIAVEL); } )*;


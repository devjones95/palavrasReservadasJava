public class palavrasReservadas {
    
    //PALAVRAS RESERVADAS EM JAVA:
    
    // ---PARA CONTROLE DE PACOTES---
    
    // Import: importa pacotes ou classes para dentro do código.
    // Package: especifica a que pacote todas as classes de um arquivo pertencem.

    // ---MODIFICADORES DE ACESSO---
    
    // Public: acesso de qualquer classe.
    // Private: acesso apenas dentro da classe.
    // Protected: acesso por classes no mesmo pacote e subclasses.

    // ---PRIMITIVOS---
    
    // Boolean: um valor indicando verdadeiro ou falso.
    // Byte: um inteiro de 8 bits (signed).
    // Char: um character unicode (16-bit unsigned).
    // Double: um número de ponto flutuante de 64 bits (signed).
    // Float: um número de ponto flutuante de 32 bits (signed).
    // Int: um inteiro de 32 bits.
    // Long: um inteito de 64 bits.
    // Short: um inteiro de 32 bits.
    // Void: indica que o método não tem retorno de valor.

    
    // ---MODIFICADORES DE CLASSES---
    
    // Abstract: classe que não pode ser instanciada ou método que precisa ser implementado por uma subclase não abstrata.
    // Class: especifica uma classe.
    // Extends: indica a superclasse que a subclasse está pertencendo.
    // Final: impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada.
    // Implements: indica as inerfaces que uma classe irá implementar.
    // Interface: especifica uma interface.
    // Native: indica que um método está escrito em uma liguagem dependente da plataforma, como o C por exemplo.
    // New: instancia um novo objeto, chamando seu contrutor.
    // Static: faz um método ou variável pertencer à classe ao invés de às instâncias.
    // Strictfp: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto em todas as expressões.
    // Synchronized: indica que um método só pode ser acessado por uma thread de cada vez.
    // Transient: impede a serialização de campos.
    // Volatile: indica que uma variável pode ser alterada durante o uso de threads.
    
    // ---CONTROLE DE FLUXO DENTRO DE UM BLOCO DE CÓDIGO---
    
    // Break: sai do bloco de código em que ele está.
    // Case: executa um bloco de código dependendo do teste do switch.
    // Continue: pula a execução do código que viria após essa linha e vai para a próxima passagem do loop.
    // default: executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro;
    // do: executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente;
    // else: executa um bloco de código alternativo caso o teste "if" seja falso;
    // for: usado para realizar um loop condicional de um bloco de código;
    // if: usado para realizar um teste lógico de verdadeiro ou falso;
    // instanceof: determina se um objeto é uma instância de determinada classe, superclasse ou interface;
    // return: retorna um método sem executar qualquer código, que venha depois desta linha (também pode retornar uma variável);
    // switch: indica a variável a ser comparada nas expressões case;
    // while: executa um bloco de código repetidamente enquanto a condição for verdadeira.
    
    // ---TRATAMENTO DE ERROS---

    // assert: testa uma expressão condicional, para verificar uma suposição do programador;
    // catch: declara o bloco de código usado para tratar uma exceção;
    // finally: bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção;
    // throw: usado para passar uma exceção para o método que o chamou;
    // throws: indica que um método pode passar uma exceção para o método que o chamou;
    // try: bloco de código que tentará ser executado, mas que pode causar uma exceção.

    // ---VARIÁVEIS DE REFERÊNCIA---

    // super: refere-se a superclasse imediata;
    // this: refere-se a instância atual do objeto.

    // ---PALAVRAS RESERVADAS NÃO UTILIZADAS---

    // const: Não utilize para declarar constantes; use public static final;
    // goto: não implementada na linguagem Java, po

    // ---LITERAIS RESERVADOS---

    // De acordo com a Java Language Specification, null, true e false são tecnicamente chamados de valores literais, e não keywords. Se você tentar criar algum identificador com estes valores, você também terá um erro de compilação.


}

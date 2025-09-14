# ESTUDOS JAVA

## Padrão de nomenclatura

- `Arquivo.java`: Todo arquivo .java deve começar com letra MAIÚSCULA. 
  - Se a palavra for composta, a segunda letra deve também ser MAIÚSCULA:
    - `CalculadoraCientifica.java`
- `Nome da classe no arquivo`: A classe deve possuir o mesmo nome do arquivo.java.
- `Nome de variável`: toda variável deve ser escrita com letra minúscula.
  - Se a palavra for composta, a segunda letra deve ser MAIÚSCULA.
    - `anoFabricacao`
  - Essa prática é conhecida como `camelCase`
- `Nome de constante`: toda constante deve ser escrita inteiramente com letras MAIÚSCULAS:
  - `PI`
  - Se a palavra for composta, utilize o `_`:
    - `BR_PAIS`
  - Para definir uma constante em JAVA, use:
    - `final String BR_PAIS = "Brasil";`

## Palavras reservadas
**Modificadores de acesso**

| Palavra   | Descrição                                       | Classe | Variável | Método |
| --------- | ----------------------------------------------- | :----: | :------: | :----: |
| public    | Acesso de qualquer classe                       |   X    |    X     |   X    |
| private   | Acesso apenas dentro da classe                  |   X    |    X     |   X    |
| protected | Acesso por classes no mesmo pacote e subclasses |   X    |    X     |   X    |

**Tipos primitivos**

| Palavra | Descrição                                     | Classe | Variável |   Método   |
| ------- | --------------------------------------------- | :----: | :------: | :--------: |
| boolean | um valor indicando verdadeiro ou falso        |        |    X     | no retorno |
| byte    | um inteiro de 8 bits (signed)                 |        |    X     | no retorno |
| char    | um carácter Unicode (16bit unsigned) (signed) |        |    X     | no retorno |
| double  | um carácter Unicode (16bit unsigned) (signed) |        |    X     | no retorno |
| float   | um número de ponto flutuante de 32 bits       |        |    X     | no retorno |

**Modificadores de classes, variáveis ou métodos**

| Palavra      | Descrição                                                                                                                                          | Classe | Variável | Método |
| ------------ | -------------------------------------------------------------------------------------------------------------------------------------------------- | :----: | :------: | :----: |
| abstract     | classe que não pode ser instanciada ou método que precisa ser implementado, por uma subclasse não abstrata                                         |   X    |          |        |
| class        | especifica uma classe                                                                                                                              |   X    |          |        |
| extends      | indica a superclasse que a subclasse está estendendo                                                                                               |   X    |          |        |
| final        | impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada                                |   X    |    X     |   X    |
| implements   | indica as interfaces que uma classe irá implementar                                                                                                |   X    |          |        |
| interface    | especifica uma interface                                                                                                                           |   X    |          |        |
| native       | indica que um método está escrito em uma linguagem dependente de plataforma, como o C                                                              |        |          |   X    |
| new          | instancia um novo objeto, chamando seu construtor                                                                                                  |        |    X     |        |
| static       | faz um método ou variável pertencer à classe ao invés de às instâncias                                                                             |        |    X     |        |
| strictfp     | usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante, em todas as expressões |        |          |   X    |
| synchronized | indica que um método só pode ser acessado por uma thread de cada vez                                                                               |        |          |   X    |
| transient    | impede a serialização de campos                                                                                                                    |        |    X     |        |
| volatile     | indica que uma variável pode ser alterada durante o uso de threads                                                                                 |        |    X     |        |

**Controle de fluxo dentro de um bloco de código**

| Palavra    | Descrição                                                                                                                                      | Classe | Variável | Método |
| ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | :----: | :------: | :----: |
| break      | sai do bloco de código em que ele está                                                                                                         |        |          | fluxo  |
| case       | executa um bloco de código dependendo do teste do switch                                                                                       |        |          |   X    |
| continue   | pula a execução do código que viria, após essa linha e vai para a próxima passagem do loop                                                     |        |          | fluxo  |
| default    | executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro                                                              |        |          |   X    |
| do         | executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente |        |          |   X    |
| else       | executa um bloco de código alternativo caso o teste "if" seja falso                                                                            |        |          |   X    |
| for        | usado para realizar um loop condicional de um bloco de código                                                                                  |        |          |   X    |
| if         | usado para realizar um teste lógico de verdadeiro ou falso                                                                                     |        |          |   X    |
| instanceof | determina se um objeto é uma instância de determinada classe, superclasse ou interface                                                         |        |          |   X    |
| return     | retorna um método sem executar qualquer código, que venha depois desta linha (também pode retornar uma variável)                               |        |          |   X    |
| switch     | indica a variável a ser comparada nas expressões case                                                                                          |        |          |   X    |
| while      | executa um bloco de código repetidamente enquanto a condição for verdadeira                                                                    |        |          |   X    |

**Tratamento de erros**

| Palavra | Descrição                                                                                                                   | Classe | Variável |   Método   |
| ------- | --------------------------------------------------------------------------------------------------------------------------- | :----: | :------: | :--------: |
| assert  | testa uma expressão condicional, para verificar uma suposição do programador                                                |        |          |     X      |
| catch   | declara o bloco de código usado para tratar uma exceção                                                                     |        |          |     X      |
| finally | bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção |        |          |     X      |
| throw   | usado para passar uma exceção para o método que o chamou                                                                    |        |          |     X      |
| throws  | indica que um método pode passar uma exceção para o método que o chamou                                                     |        |          | assinatura |
| try     | bloco de código que tentará ser executado, mas que pode causar uma exceção                                                  |        |          |     X      |

**Controle de pacotes**

| Palavra | Descrição                                                          | Classe | Variável | Método |
| ------- | ------------------------------------------------------------------ | :----: | :------: | :----: |
| import  | importa pacotes ou classes para dentro do código                   |   X    |          |        |
| package | especifica a que pacote, todas as classes de um arquivo pertencem. |   X    |          |        |

**Variáveis de referência**

| Palavra | Descrição                             | Classe | Variável | Método |
| ------- | ------------------------------------- | :----: | :------: | :----: |
| super   | refere-se a superclasse imediata      |        |          |   X    |
| this    | refere-se a instância atual do objeto |        |          |   X    |

**Palavras reservadas não utilizadas**

| Palavra | Descrição                                                           | Classe | Variável | Método |
| ------- | ------------------------------------------------------------------- | :----: | :------: | :----: |
| const   | não utilize para declarar constantes                                |        |          |        |
| goto    | não implementada na linguagem Java, por ser considerada prejudicial |        |          |        |

## Tipos e Variáveis
### Tipos primitivos

> Os oito tipos primitivos em Java são:
> `int`, `byte`, `short`, `long`, `float`, `double`, `boolean` e `char` – esses tipos não são objetos e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória.

Tabela de Tipos Primitivos e seus valores:

| Tipo  | Memória | Valor Mínimo               | Valor Máximo              |
| ----- | ------- | -------------------------- | ------------------------- |
| byte  | 1 byte  | -128                       | 127                       |
| short | 2 byte  | -32.768                    | 32.767                    |
| int   | 4 bytes | -2.147.483.648             | 2.147.483.647             |
| long  | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |

Os tipos primitivos, que podem conter partes fracionárias:

| Tipo   | Memória | Valor Mínimo   | Valor Máximo  | Precisão      |
| ------ | ------- | -------------- | ------------- | ------------- |
| float  | 4 bytes | -3,4028E + 38  | 3,4028E + 38  | 6 – 7 dígitos |
| double | 8 bytes | -1,7976E + 308 | 1,7976E + 308 | 15 dígitos    |

Embora o tipo `float` ocupe menos espaço na memória do que o tipo `double`, ele é menos utilizado devido a uma limitação na precisão decimal entre 6 e 7 dígitos.

Com os avanços nos computadores, não há mais a necessidade de se preocupar com o uso dos tipos `short` e `byte`, pois a memória é abundante.

De maneira semelhante, o tipo `long` também é pouco utilizado, pois valores grandes são raros de se trabalhar.

Portanto, na maioria das situações, utilizamos o tipo `int` para representar números inteiros ou `double` para representar números fracionados.

> Devemos compreender que os tipos primitivos sempre terão um valor padrão mesmo NÃO havendo uma atribuição explícita, veja o código abaixo:
>
> ```java
> byte    b; // b=0
> short   s; // s=0
> int     i; // i=0
> long    l; // l=0
>
> float   f; // f=0.0
> double  d; // d=0.0
>
> char    c; // c='\u0000'
> boolean o; // b=false
> ```

### Tipos Wrappers

Os tipos primitivos não são objetos, mas às vezes é necessário trabalhar com eles como se fossem. Por exemplo, quando você precisa passar um valor primitivo como um parâmetro de um método, você precisa converter o valor primitivo em um objeto. Nesse caso, você pode usar os tipos wrappers.

Os **tipos wrappers** são classes que representam os tipos primitivos. Eles são imutáveis, o que significa que uma vez criado um objeto wrapper, seu valor não pode ser alterado para garantir a segurança.

Os seguintes tipos Wrappers estão disponíveis em Java:

```java
Integer     (int)
Long        (long)
Float       (float)
Double      (double)
Short       (short)
Byte        (byte)
Boolean     (boolean)
Character   (char)
```

#### Conversão de Tipos

A conversão de tipos é necessária quando você deseja armazenar um valor de um tipo de dado em uma variável de outro tipo. Por exemplo, você pode armazenar um valor `int` em uma variável de tipo `double` porque o tipo `double` pode armazenar valores inteiros e fracionários.

- **Conversão de Tipos Explícita:** 
  - Acontece quando você força a conversão de um tipo para outro, geralmente de um tipo maior para um tipo menor, o que pode causar perda de dados.
- **Conversão de Tipos Implícita:** 
  - Ocorre automaticamente quando o Java entende que não há risco de perda de dados, geralmente de um tipo menor para um tipo maior.

```java
// conversão de tipos explicita
double numeroDouble = 9.7;
int numeroInt = (int) numeroDouble; // Conversão explícita
System.out.println(numeroInt); // Saída: 9


// conversão de tipos implícita
int numeroInt = 42;
double numeroDouble = numeroInt; // Conversão implícita
System.out.println(numeroDouble); // Saída: 42.0
```

### Métodos Wrapper

Os tipos Wrappers em Java oferecem uma série de métodos úteis para a manipulação de tipos primitivos. Alguns desses métodos incluem:

- Métodos de parsing: Esses métodos permitem a conversão de strings em tipos primitivos equivalentes.
  ```java
  String num = "100";
  int i = Integer.parseInt(num);
  System.out.println(i); // 100
  ```

- Métodos de conversão: Esses métodos permitem a conversão de tipos primitivos para objetos e vice-versa.
  ```java
  String num = "100";
  Integer obj = Integer.valueOf(n);
  System.out.println(obj); // 100
  ```

- Métodos de comparação: Esses métodos permitem comparar objetos Wrappers para verificar se são iguais ou se um é maior ou menor que o outro.
  ```java
  Integer obj1 = new Integer(100);
  Integer obj2 = new Integer(100);
  System.out.println(obj1.equals(obj2)); // true
  System.out.println(obj1.compareTo(obj2)); // 0 se iguais, -1 se o obj1 é menor e 1 se o obj1 é maior
  ```

- Métodos de informação: Esses métodos fornecem informações sobre o tipo Wrapper, como o valor mínimo e máximo que pode ser representado.
  ```java
  System.out.println(Integer.MAX_VALUE); // 2147483647
  System.out.println(Integer.MIN_VALUE); // -2147483648
  ```

### Tipos customizados

Os tipos customizados são bibliotecas ou **pacotes externos** que não fazem parte por padrão no Java, mas são adicionados ao projeto para fornecer recursos adicionais que podem ser úteis na construção de aplicativos.

Alguns exemplos de tipos customizados incluem:

| Nome do Projeto | Pacote principal      | Finalidade                                                                                                                   |
| :-------------- | :-------------------- | :--------------------------------------------------------------------------------------------------------------------------- |
| Joda Time       | org.joda.time         | Fornece soluções mais avançada de datas e horas incluindo suporte a fusos horários e operações de data/hora mais avançadas.  |
| Gson            | com.google.gson       | Fornece suporte para converter objetos Java em sua representação JSON e vice-versa.                                          |
| Jackson         | com.fasterxml.jackson | Fornece suporte para processamento de JSON, incluindo conversão de objetos Java para e de JSON.                              |
| Apache Commons  | org.apache.commons    | Fornece uma série de utilitários que podem ser usados para tarefas comuns, como manipulação de strings, arquivos e coleções. |
| Apache POI      | org.apache.poi        | Fornece suporte para leitura e escrita de arquivos do Microsoft Office, incluindo arquivos do Excel.                         |
| Apache Log4j    | org.apache.log4j      | Fornece suporte para registro de eventos.                                                                                    |
| Hibernate       | org.hibernate         | Fornece suporte para mapeamento objeto-relacional (ORM).                                                                     |
| Junit           | org.junit             | Fornece suporte para testes unitários.                                                                                       |

### Javadoc

Javadoc é um gerador de documentação criado pela Sun Microsystems para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muitos simples inseridas nos comentários do programa.

Este sistema é o padrão de documentação de classes em Java, e muitas dos IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML.

### Tags

Os desenvolvedores usam certos estilos de comentários e tags Javadoc ao documentar códigos-fonte. Um bloco de comentário em Java iniciado com /** irá iniciar um bloco de comentário Javadoc, que será incluído no HTML gerado. Uma tag Javadoc começa com um "@" (arroba). Na tabela abaixo, algumas destas tags.

|tag|descrição|
|---|---------|
|@author| Nome do desenvolvedor|
|@deprecated| 	Marca o método como deprecated. Algumas IDEs exibirão um alerta de compilação se o método for chamado.|
|@exception|Documenta uma exceção lançada por um método — veja também @throws.|
|@param |Define um parâmetro do método. Requerido para cada parâmetro.|
|@return|Documenta o valor de retorno. Essa tag não deve ser usada para construtores ou métodos definidos com o tipo de retorno void.|
|@see|Documenta uma associação a outro método ou classe.|
|@since|Documenta quando o método foi adicionado a a classe.|
|@throws|Documenta uma exceção lançada por um método. É um sinônimo para a @exception introduzida no Javadoc 1.2.|
|@version| Exibe o número da versão de uma classe ou um método.|

Vamos explorar como documentar um classe simples que realizar a divisão entre dois números inteiros.

```java
/**
 * Calculadora Simples
 * @author Gleyson Sampaio
 */
public class Calculadora {
  /**
   * Realiza a divisão entre dois números inteiros
   *
   * @param dividendo     Número que será dividido
   * @param divisor       Número que irá dividir o dividendo
   * @return              O resultado da divisão entre o dividendo e o divisor
   * @author              Gleyson Sampaio
   * @exception 	        java.lang.ArithmeticException em caso de passar o divisor igual a zero 0.
   */
  static Integer dividir(Integer dividendo, Integer divisor){
    return dividendo / divisor;
  }
}
```
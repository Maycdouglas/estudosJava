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


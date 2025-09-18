# EXPRESSÕES EM JAVA

## Tipos e especificadores
Cada tipo de dado é representado para um caractere especificador prefixado pelo símbolo % que representa o início de cada especificador.

| Especificador | Tipos de Dados               |
|---------------|------------------------------|
| %s            | Uma string de caracteres     |
| %d            | Dígitos inteiros             |
| %f            | Dígitos fracionados          |
| %t            | Representação de data e hora |

## Estrutura de formatação
O parâmetro que representa a formatação possui a flexibilidade de receber em sua sintexe os argumentos abaixo:

| Nome       | Valores        |                                   Descrição                                    |
|------------|----------------|:------------------------------------------------------------------------------:|
| index      | 1\$, 2\$ e etc |              representa ao indíce dos argumentos que começa com 1              |
| flags      | 0, -           | Utilizado para determinado zeros ou alinhamento à esquerda, dependente do tipo |
| width      | 5, 10, e etc   |                         Comprimento do texto formatado                         |
| .precision | 2, 3 e etc     |                   Define a quantidade de caracteres decimais                   |
| typechar   | s, d, f e etc  |                        tipo de dado que será formatado                         |

## Formatação básica

| String de Formatação                               | Argumentos     |                                         Resultado                                          |
|----------------------------------------------------|----------------|:------------------------------------------------------------------------------------------:|
| "O nome do candidato é %s"                         | Maycon Douglas |                            O nome do candidato é Maycon Douglas                            |
| "O nome do candidato é %40s"                       | Maycon Douglas | O nome do candidato é Maycon Douglas - comprimento de 40 caracteres justificado a direita  |
| "O nome do candidato é %-40s"                      | Maycon Douglas | O nome do candidato é Maycon Douglas - comprimento de 40 caracteres justificado a esquerda |
| "O salário pretendido do candidato foi de R$%,.2f" | 1234.56        |                    O salário pretendido do candidato foi de R$ 5.357,45                    |
| "A matrícula do candidato é %05d"                  | 32            |                              A matrícula do candidato é 00032                              |

## Formatação avançada

| String de Formatação                                                      | Argumentos                              |                                                   Resultado                                                   |
|---------------------------------------------------------------------------|-----------------------------------------|:-------------------------------------------------------------------------------------------------------------:|
| "O candidato será entrevistado na data %td/%tm/t%ty"                      | data, data, data                        | O candidato será entrevistado na data 18/06/23                           O nome do candidato é Maycon Douglas |
| "O candidato será entrevistado na data %tD"                               | data                                    |                     O candidato será entrevistado na data 06/28/23 (Locale US ou Default)                     |
| "O candidato será entrevistado na data %1\$td/%1\$tm/%1\$ty"              | data                                    |    O candidato será entrevistado na data 18/06/23 - o símbolo < representa considerar o argumento anterior    |
| "Os diferentes nomes %10.10s e %10.10s agora possuem o mesmo comprimento" | Maycon Douglas, Maycon Douglas Henrique |                 Os diferentes nomes GLEYSON SA E IZABELLY S agora possuem o mesmo comprimento                 |
| "A terceira e segunda habilidades do candidato são %3\$s e %2\$s"         | "Java", "Spring", "Postgres", "Vue"      |                      A terceira e segunda habilidades do candidato são Postgres e Spring                      |
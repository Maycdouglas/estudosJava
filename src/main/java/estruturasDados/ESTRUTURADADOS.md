# Estrutura de Dados em JAVA

| Classe        | Lista | Conjunto | Mapa | Fila | Ordenado                               | Classificado                                              |
| ------------- | ----- | -------- | ---- | ---- | -------------------------------------- | --------------------------------------------------------- |
| ArrayList     | X     |          |      |      | Por índice                             | Não                                                       |
| Vector        | X     |          |      |      | Por índice                             | Não                                                       |
| LinkedList    | X     |          |      |      | Por índice                             | Não                                                       |
| HashSet       |       | X        |      |      | Não                                    | Não                                                       |
| LinkedHashSet |       | X        |      |      | Por ordem de inserção                  | Não                                                       |
| TreeSet       |       | X        |      |      | Sim (classificada)                     | Por _ordem natural_ ou regras de comparação personalizada |
| HashMap       |       |          | X    |      | Não                                    | Não                                                       |
| Hashtable     |       |          | X    |      | Não                                    | Não                                                       |
| TreeMap       |       |          | X    |      | Sim (classificada)                     | Por _ordem natural_ ou regras de comparação personalizada |
| LinkedHashMap |       |          | X    |      | Por ordem de inserção ou último acesso | Não                                                       |
| PriorityQueue |       |          |      | X    | Sim (classificada)                     | Pela ordem de "coisas a fazer"                            |

## LISTAS
Coleção que pode conter elementos duplicados.

| Nome                                                                              | Descrição                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------- |
| [Vector](https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html)         | Um array redimensionável com sincronização segura               |
| [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)   | Um array redimensionável e indexado mais performático           |
| [LinkedList](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | Uma lista encandeada com mais recursos de inserção de elementos |

## CONJUNTOS
Coleção que não pode conter elementos duplicados.

| Nome                                                                                    | Descrição                                                                       |
| --------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| [HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)             | Uma coleção exclusiva e com alto desempenho                                     |
| [LinkedHashSet](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html) | Uma coleção exclusiva e ordenada pela inserção                                  |
| [TreeSet](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html)             | Uma coleção exclusiva, ordenada e classificada pela ordem natural dos elementos |

## MAPAS
| Nome                                                                                    | Descrição                                                                       |
| --------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| [HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)             | Uma coleção exclusiva e com alto desempenho                                     |
| [LinkedHashSet](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html) | Uma coleção exclusiva e ordenada pela inserção                                  |
| [TreeSet](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html)             | Uma coleção exclusiva, ordenada e classificada pela ordem natural dos elementos |

## ALGORITHM COLLECTIONS
| Método  | Localização                   | Descrição                                                                |
| ------- | ----------------------------- | ------------------------------------------------------------------------ |
| sort    | java.util.Collections.sort    | Classifica uma coleção pela ordem natural ou por um classificador        |
| reverse | java.util.Collections.reverse | Inverte a ordem da lista com base na inserção ou classificação           |
| shuffle | java.util.Collections.shuffle | Embaralha os elementos podendo receber ordens alteradas em cada execução |
| addAll  | java.util.Collections.addAll  | Adiciona uma sequência de novos elementos em uma coleção                 |
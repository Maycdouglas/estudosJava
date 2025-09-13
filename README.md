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
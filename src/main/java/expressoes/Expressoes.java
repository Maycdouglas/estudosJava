package expressoes;

public class Expressoes {
    public static void main(String[] args) {
        String nome = "Maycon";
        Integer matricula = 123;
        Double salario = 2345.67;

        String dadosFuncionario = String.format("Mat: %d - Nome: %s - Sal: %.2f", matricula, nome, salario); //.2 define o numero de casas decimais exibidas
        System.out.println(dadosFuncionario);
    }
}

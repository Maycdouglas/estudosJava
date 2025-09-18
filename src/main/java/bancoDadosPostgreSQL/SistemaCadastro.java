package bancoDadosPostgreSQL;

import java.util.List;

public class SistemaCadastro {
    public static void main(String[] args) {
        FabricaConexao.conectar();
        CadastroRepository repository = new CadastroRepository();
//        Cadastro cadastro = new Cadastro();
//        cadastro.setNome("Maria Julia");
//        cadastro.setIdade(19);
//
//        repository.incluir(cadastro);
//        repository.alterar(cadastro);

        System.out.println("Teste do listar()");

        // busca todos os cadastros do banco de dados
        List<Cadastro> cadastros = repository.listar();
        for (Cadastro cadastro : cadastros) {
            System.out.println(cadastro.getId() + " " + cadastro.getNome() + " " + cadastro.getIdade());
        }
        System.out.println("Teste do buscar()");
        // busca cadastro unico no banco de dados
        Cadastro cadastro2 = repository.buscar(2);
        if(cadastro2 != null) {
            System.out.println(cadastro2.getId() + " " + cadastro2.getNome() + " " + cadastro2.getIdade());
        } else {
            System.out.println("Não foi possível localizar o cadastro pelo ID.");
        }
    }
}

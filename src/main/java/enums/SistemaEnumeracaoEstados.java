package enums;

public class SistemaEnumeracaoEstados {
    public static void main(String[] args) {
        EstadoBrasileiro estado = EstadoBrasileiro.PIAUI;
        System.out.println(estado.name()); // exibe o nome do ENUM
        System.out.println(estado.getNome()); // exibe o atributo nome
        System.out.println(estado.getSigla()); // exibe o atributo sigla

        EstadoBrasileiro estado2 = EstadoBrasileiro.valueOf("MINAS_GERAIS"); // Localiza o item no ENUM a partir do NAME. Se não encontrar, joga exceção
        System.out.println(estado2.name()); // exibe o nome do ENUM
        System.out.println(estado2.getNome()); // exibe o atributo nome
        System.out.println(estado2.getSigla()); // exibe o atributo sigla

        // percorre todos os itens do ENUM
        for(EstadoBrasileiro estado3 : EstadoBrasileiro.values()) {
            System.out.println("Estado localizado: " + estado3.getNome());
        }

    }
}

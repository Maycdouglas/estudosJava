package enums;

// Exemplo de ENUM

public enum EstadoBrasileiro {
    PIAUI ("Piauí", "PI"),
    MARANHAO ("Maranhão", "MA"),
    SAO_PAULO ("São Paulo","SP"),
    RIO_JANEIRO ("Rio de Janeiro", "RJ"),
    MINAS_GERAIS ("Minas Gerais", "MG");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}

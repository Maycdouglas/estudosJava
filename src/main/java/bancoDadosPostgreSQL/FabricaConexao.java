package bancoDadosPostgreSQL;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class FabricaConexao {

    private static Connection conexao;
    public static void conectar() {
        Dotenv dotenv = Dotenv.load();
        String password = dotenv.get("DB_PASSWORD");
        try {
            if (conexao == null) {
                String url = "jdbc:postgresql://localhost:5432/rocket";
                Properties props = new Properties();
                props.setProperty("user", "postgres");
                props.setProperty("password", password);
                conexao = DriverManager.getConnection(url, props);
                System.out.println("Conectado com sucesso!");
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConexao() {
        return conexao;
    }


}

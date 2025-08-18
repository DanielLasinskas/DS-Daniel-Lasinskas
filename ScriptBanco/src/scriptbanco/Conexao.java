/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scriptbanco;

/**
 *
 * @author CAMARGO
 */
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/fat";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    // Método que retorna a conexão com o banco de dados
    public static Connection obterConexao() {
        try {
            // 1. Carregar driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Retornar a conexão
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return null;
    }
}



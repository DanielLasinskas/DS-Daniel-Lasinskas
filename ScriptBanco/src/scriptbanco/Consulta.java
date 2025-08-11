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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consulta {

    public static void Consultar_Dados() {
        String sql = "SELECT * FROM alunos";

        try (Connection conn = Conexao.obterConexao();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet resultado = stmt.executeQuery()) {

            System.out.println("📋 Lista de alunos:");
            while (resultado.next()) {
                String codigo = resultado.getString("codigo_aluno");
                String nome = resultado.getString("nome_aluno");
                System.out.println("Código: " + codigo + " | Nome: " + nome);
            }

        } catch (SQLException e) {
            System.out.println("❌ Erro ao consultar alunos: " + e.getMessage());
        }
    }
}

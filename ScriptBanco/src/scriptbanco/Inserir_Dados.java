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
import java.sql.SQLException;

public class Inserir_Dados {

    public static void InserirExemplos() {
        String sql = "INSERT INTO alunos (codigo_aluno, nome_aluno) VALUES (?, ?)";

        try (Connection conn = ConectaBanco.obterConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Inserindo alunos de exemplo
            stmt.setString(1, "A001");
            stmt.setString(2, "João Silva");
            stmt.executeUpdate();

            stmt.setString(1, "A002");
            stmt.setString(2, "Maria Oliveira");
            stmt.executeUpdate();

            System.out.println("✅ Alunos inseridos com sucesso!");

        } catch (SQLException e) {
            System.out.println("❌ Erro ao inserir dados: " + e.getMessage());
        }
    }
}

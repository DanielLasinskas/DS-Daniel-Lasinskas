/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scriptbanco;

/**
 *
 * @author CAMARGO
 */
public class ConectaBanco {
    public static void main(String[] args) {

        // Testando conexão
        if (Conexao.obterConexao() != null) {
            System.out.println("✅ Conexão estabelecida com sucesso!");
        }

        // Inserindo múltiplos alunos
        Inserir_Dados.InserirExemplos();

        // Consultando dados
        Consulta.Consultar_Dados();
    }
}

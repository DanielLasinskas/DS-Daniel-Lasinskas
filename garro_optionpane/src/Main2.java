/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */

import javax.swing.JOptionPane;



public class Main2 {
    public static void main(String[] args) {
        // Pedindo os dados do jogador base
        String nome = JOptionPane.showInputDialog("Digite o nome do jogador:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do jogador:"));
        String nacionalidade = JOptionPane.showInputDialog("Digite a nacionalidade do jogador:");

        Jogador jogador = new Jogador(nome, idade, nacionalidade);
        jogador.exibirDados();
        jogador.entrarEmCampo();
        jogador.sairDoJogo();

        JOptionPane.showMessageDialog(null, "-----------------------");

        nome = JOptionPane.showInputDialog("Digite o nome do atacante:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do atacante:"));
        nacionalidade = JOptionPane.showInputDialog("Digite a nacionalidade do atacante:");
        int golsMarcados = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de gols marcados:"));

        Atacante atacante = new Atacante(nome, idade, nacionalidade, golsMarcados);
        atacante.exibirDados();
        atacante.baterPenalti();

        JOptionPane.showMessageDialog(null, "-----------------------");

        nome = JOptionPane.showInputDialog("Digite o nome do jogador do meio-campo:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do jogador do meio-campo:"));
        nacionalidade = JOptionPane.showInputDialog("Digite a nacionalidade do jogador do meio-campo:");
        golsMarcados = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de gols marcados:"));
        int assistencias = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de assistências:"));

        MeioCampo meioCampo = new MeioCampo(nome, idade, nacionalidade, golsMarcados, assistencias);
        meioCampo.exibirDados();
        meioCampo.entrarEmCampo();
        meioCampo.cobrarFalta();
        meioCampo.sairDoJogo();
    }
}

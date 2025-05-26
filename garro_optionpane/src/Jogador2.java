/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */

import javax.swing.JOptionPane;

public class Jogador2 {
    protected String nome;
    protected int idade;
    protected String nacionalidade;

    public Jogador2(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    public void exibirDados() {
        String dados = "Nome: " + nome + "\n" +
                       "Idade: " + idade + "\n" +
                       "Nacionalidade: " + nacionalidade;
        JOptionPane.showMessageDialog(null, dados);
    }

    public void entrarEmCampo() {
        JOptionPane.showMessageDialog(null, nome + " entrou em campo.");
    }

    public void sairDoJogo() {
        JOptionPane.showMessageDialog(null, nome + " saiu do jogo.");
    }
}

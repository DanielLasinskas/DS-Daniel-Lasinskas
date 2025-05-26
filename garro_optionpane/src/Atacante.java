/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */


import javax.swing.JOptionPane;

public class Atacante extends Jogador {
    protected int golsMarcados;

    public Atacante(String nome, int idade, String nacionalidade, int golsMarcados) {
        super(nome, idade, nacionalidade);
        this.golsMarcados = golsMarcados;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        JOptionPane.showMessageDialog(null, "Gols marcados: " + golsMarcados);
    }

    public void armarJogada() {
        JOptionPane.showMessageDialog(null, nome + " bateu o pênalti no ângulo!");
    }
}

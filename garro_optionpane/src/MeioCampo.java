/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */


import javax.swing.JOptionPane;

public class MeioCampo extends Atacante {
    private int assistencias;

    public MeioCampo(String nome, int idade, String nacionalidade, int golsMarcados, int assistencias) {
        super(nome, idade, nacionalidade, golsMarcados);
        this.assistencias = assistencias;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        JOptionPane.showMessageDialog(null, "Assistências: " + assistencias);
    }

    public void cobrarFalta() {
        JOptionPane.showMessageDialog(null, nome + " cobrou a falta com precisão!");
    }
}

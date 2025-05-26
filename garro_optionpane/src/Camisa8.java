/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */


import javax.swing.JOptionPane;

public class Camisa8 extends MeioCampista {
    private int assistencias;

    public Camisa8(String nome, int idade, String nacionalidade, int passesCertos, int assistencias) {
        super(nome, idade, nacionalidade, passesCertos);
        this.assistencias = assistencias;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        JOptionPane.showMessageDialog(null, "Assistências na temporada: " + assistencias);
    }

    public void cobrarFalta() {
        JOptionPane.showMessageDialog(null, nome + " cobrou a falta com precisão!");
    }
}

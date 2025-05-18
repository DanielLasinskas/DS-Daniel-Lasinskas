/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garro_heranca;

/**
 *
 * @author USER
 */

public class Camisa8 extends MeioCampista {
    private int assistencias;

    public Camisa8(String nome, int idade, String nacionalidade, int passesCertos, int assistencias) {
        super(nome, idade, nacionalidade, passesCertos);
        this.assistencias = assistencias;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Assistências na temporada: " + assistencias);
    }

    public void cobrarFalta() {
        System.out.println(nome + " cobrou a falta com precisão!");
    }
}

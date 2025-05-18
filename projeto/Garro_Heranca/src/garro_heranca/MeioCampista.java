/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garro_heranca;

/**
 *
 * @author USER
 */

public class MeioCampista extends Jogador {
    protected int passesCertos;

    public MeioCampista(String nome, int idade, String nacionalidade, int passesCertos) {
        super(nome, idade, nacionalidade);
        this.passesCertos = passesCertos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Passes certos por jogo: " + passesCertos);
    }

    public void armarJogada() {
        System.out.println(nome + " está armando a jogada.");
    }
}

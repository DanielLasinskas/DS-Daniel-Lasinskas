/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garro_heranca;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        // Criando um jogador base
        Jogador jogador = new Jogador("Yuri Alberto", 25, "Brasil");
        jogador.exibirDados();
        jogador.entrarEmCampo();
        jogador.sairDoJogo();

        System.out.println("-----------------------");

        // Criando um meio-campista
        MeioCampista meio = new MeioCampista("Carlitos", 21, "Argentina", 85);
        meio.exibirDados();
        meio.armarJogada();

        System.out.println("-----------------------");

        // Criando o Camisa 10 Rodrigo Garro
        Camisa8 garro = new Camisa8("Rodrigo Garro", 26, "Argentina", 90, 12);
        garro.exibirDados();
        garro.entrarEmCampo();
        garro.armarJogada();
        garro.cobrarFalta();
        garro.sairDoJogo();
    }
}


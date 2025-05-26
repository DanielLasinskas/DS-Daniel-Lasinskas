/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */


import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        Jogador jogador = new Jogador("Yuri Alberto", 25, "Brasil");
        jogador.exibirDados();
        jogador.entrarEmCampo();
        jogador.sairDoJogo();

        JOptionPane.showMessageDialog(null, "-----------------------");

        MeioCampista meio = new MeioCampista("Carlitos", 21, "Argentina", 85);
        meio.exibirDados();
        meio.armarJogada();

        JOptionPane.showMessageDialog(null, "-----------------------");

        Camisa8 garro = new Camisa8("Rodrigo Garro", 26, "Argentina", 90, 12);
        garro.exibirDados();
        garro.entrarEmCampo();
        garro.armarJogada();
        garro.cobrarFalta();
        garro.sairDoJogo();
    }
}

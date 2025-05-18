/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garro_heranca;

/**
 *
 * @author USER
 */

public class Jogador {
    protected String nome;
    protected int idade;
    protected String nacionalidade;

    public Jogador(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nacionalidade: " + nacionalidade);
    }

    public void entrarEmCampo() {
        System.out.println(nome + " entrou em campo.");
    }

    public void sairDoJogo() {
        System.out.println(nome + " saiu do jogo.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author CAMARGO
 */
// Classe base representando qualquer tipo de veículo
public class Veiculo {
    // Atributos protegidos (acessíveis nas subclasses)
    protected String marca;
    protected String modelo;
    protected int ano;

    // Construtor da classe Veiculo que recebe os atributos básicos
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método que exibe os dados do veículo
    public void exibirDados() {
        System.out.println("Veículo: " + marca + " " + modelo + " (" + ano + ")");
    }

    // Método que simula ligar o veículo
    public void ligar() {
        System.out.println(modelo + " está ligado.");
    }

    // Método que simula desligar o veículo
    public void desligar() {
        System.out.println(modelo + " está desligado.");
    }
}

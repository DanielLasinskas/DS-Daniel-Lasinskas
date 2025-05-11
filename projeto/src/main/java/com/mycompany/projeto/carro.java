/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author USER
 */


public class carro {
    // Classe principal que contém o método main
public static void main(String[] args) {

        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

        // Acelerando o carro
        meuCarro.acelerar(50);

        // Exibindo o estado atual do carro
        meuCarro.exibirInfo();

        // Freando o carro
        meuCarro.frear(20);

        // Exibindo novamente o estado atual do carro
        meuCarro.exibirInfo();
    }
}

// Classe Carro representa um objeto com características e comportamentos
class Carro {
    // Atributos (ou propriedades) do carro
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    // Construtor: método chamado quando um objeto é criado
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0; // o carro começa parado
    }

    // Método para acelerar o carro
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("Carro acelerou " + incremento + " km/h.");
        } else {
            System.out.println("Valor de aceleração inválido.");
        }
    }

    // Método para frear o carro
    public void frear(int decremento) {
        if (decremento > 0 && velocidadeAtual - decremento >= 0) {
            velocidadeAtual -= decremento;
            System.out.println("Carro reduziu " + decremento + " km/h.");
        } else {
            System.out.println("Valor de frenagem inválido.");
        }
    }

    // Método para exibir informações do carro
    public void exibirInfo() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ")");
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h\n");
    }

    // Getters e setters podem ser adicionados para acessar/modificar os atributos
}


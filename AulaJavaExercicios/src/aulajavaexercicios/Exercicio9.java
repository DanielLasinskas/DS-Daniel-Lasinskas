/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajavaexercicios;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a distância da viagem (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o consumo do carro (em km/l): ");
        double consumo = scanner.nextDouble();

        System.out.print("Digite o preço do combustível (em R$/litro): ");
        double precoCombustivel = scanner.nextDouble();

        double litrosNecessarios = distancia / consumo;

        System.out.printf("Serão necessários %.2f litros de combustível.%n", litrosNecessarios);
        System.out.printf("O custo estimado com combustível é: R$ %.2f%n", litrosNecessarios * precoCombustivel);

        scanner.close();
    }
}

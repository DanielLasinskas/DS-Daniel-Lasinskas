/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacoseerepeticoes;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class e3 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o primeiro valor
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        // Ler o segundo valor (não pode ser zero)
        double valor2;
        do {
            System.out.print("Digite o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();
            if (valor2 == 0) {
                System.out.println("VALOR INVÁLIDO! O segundo valor não pode ser zero.");
            }
        } while (valor2 == 0);

        // Calcular e imprimir o resultado da divisão
        double resultado = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + resultado);

        scanner.close();
    }
}

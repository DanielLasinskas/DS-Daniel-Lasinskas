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
public class e13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            // Ler o valor inteiro
            System.out.print("Digite um valor inteiro entre 1 e 10: ");
            numero = scanner.nextInt();

            // Verificar se o valor está dentro do intervalo válido
            if (numero < 1 || numero > 10) {
                System.out.println("Valor inválido! O número deve estar entre 1 e 10.");
            }
        } while (numero < 1 || numero > 10); // Repetir enquanto o valor for inválido

        System.out.println("Tabuada do " + numero + ":");

        // Laço for para calcular e imprimir a tabuada
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

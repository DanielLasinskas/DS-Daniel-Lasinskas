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
public class e17 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o número fornecido pelo usuário
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Verificar se o número é negativo
        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            // Calcular o fatorial
            long fatorial = 1; // Usamos long para evitar overflow com números grandes
            System.out.print(numero + "! = ");

            for (int i = numero; i >= 1; i--) {
                fatorial *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(".");
                }
            }

            // Exibir o resultado
            System.out.println(" = " + fatorial);
        }

        scanner.close();
    }
}

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
public class e10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor de N
        System.out.print("Digite um valor para N (maior que zero): ");
        int N = scanner.nextInt();

        // Verificar se N é maior que zero
        if (N > 0) {
            // Laço for para imprimir os valores de 1 a N
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Valor inválido! N deve ser maior que zero.");
        }

        scanner.close();
    }
}

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
public class Exercicios11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        int antecessor = valor - 1;

        System.out.println("O antecessor de " + valor + " é: " + antecessor);

        scanner.close();
    }
}


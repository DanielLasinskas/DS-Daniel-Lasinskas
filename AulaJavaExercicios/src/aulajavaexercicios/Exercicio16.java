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
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário mensal atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste (%): ");
        double percentualReajuste = scanner.nextDouble();

        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

        System.out.printf("O novo salário após o reajuste é: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}


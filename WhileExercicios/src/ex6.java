/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class ex6 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1;
        double maior = Double.NEGATIVE_INFINITY;
        double segundoMaior = Double.NEGATIVE_INFINITY;
        
        System.out.println("Digite 10 números:");

        while (contador <= 10) {
            System.out.print("Número " + contador + ": ");
            double numero = scanner.nextDouble();
            
            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior) {
                segundoMaior = numero;
            }
            
            contador++;
        }
        
        System.out.println("\nOs dois maiores números digitados foram:");
        System.out.println("1º maior: " + maior);
        System.out.println("2º maior: " + segundoMaior);
        
        scanner.close();
    }

}

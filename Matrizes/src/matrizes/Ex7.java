/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizes;

/**
 *
 * @author CAMARGO
 */
public class Ex7 {
    public static void main(String[] args) {
     int[] numeros = {4, 7, 2, 9, 1, 5, 3, 8, 6, 10};
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        double media = soma / (double)numeros.length;
        System.out.println("Média: " + media);
    }
}


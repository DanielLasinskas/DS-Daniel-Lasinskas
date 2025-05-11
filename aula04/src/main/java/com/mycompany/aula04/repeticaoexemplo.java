/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula04;

/**
 *
 * @author CAMARGO
 */
 import java.util.Scanner;
public class repeticaoexemplo {

         
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um Número: ");
        int numero = entrada.nextInt();
        
        for (int i = 0; i <= numero; i++)
        {
            System.out.println("O seu número é: "+ i);
        }
    }
}

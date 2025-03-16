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
public class e12 {
     public static void main(String[] args) {
        int numero = 8; // Número para o qual a tabuada será calculada

        System.out.println("Tabuada do " + numero + ":");

        // Laço for para calcular e imprimir a tabuada
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

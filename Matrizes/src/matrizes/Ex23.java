/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizes;

/**
 *
 * @author CAMARGO
 */
public class Ex23 {
        public static void main(String[] args) {
         int[] numeros = {23, 56, 12, 8, 34, 65, 89, 14, 44, 78, 33, 22, 11, 19, 90, 67, 54, 21, 39, 82, 17, 4, 26, 51, 60, 73, 88, 49, 30, 27};
        int temp = numeros[numeros.length - 1];
        
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        
        numeros[0] = temp;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        }
}

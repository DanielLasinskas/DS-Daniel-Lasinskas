/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizes;

/**
 *
 * @author CAMARGO
 */
        import java.util.HashSet;
import java.util.Set;

public class Ex19 {
        public static void main(String[] args) {
  
        int[] numeros = {23, 56, 12, 8, 34, 65, 89, 14, 44, 78, 33, 22, 11, 19, 90, 67, 54, 21, 39, 82};
        
        Set<Integer> numerosUnicos = new HashSet<>();
        
        for (int i = 0; i < numeros.length; i++) {
            numerosUnicos.add(numeros[i]);
        }
        
        System.out.println("Vetor sem duplicatas:");
        for (int num : numerosUnicos) {
            System.out.println(num);
        }
        }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajavaexercicios;

/**
 *
 * @author CAMARGO
 */
public class Exercicio3 {
    public static void main (String[] args){
        String nome = "João";
        int salariofixo = 1500;
        int vendas = 300;
        float salariofinal;
        float porcentagem = 0.15f;
        float comissoes;
        comissoes = vendas * porcentagem;
        salariofinal = comissoes + salariofixo;
                
        salariofinal = comissoes + salariofixo;
        
        System.out.println("O salário fixo de " + nome +" é de "+ salariofixo +" no final do mês, por conta das comissões, ele ganhou "+ salariofinal);
    }
    
}

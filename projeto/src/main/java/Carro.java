/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
// Definição da classe Carro
public class Carro {

    // Atributos privados
    private String modelo;
    private int ano;
    private String cor; // Novo atributo cor

    // Construtor da classe Carro com modelo, ano e cor
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo; // Inicializa o modelo
        this.ano = ano;       // Inicializa o ano
        this.cor = cor;       // Inicializa a cor
    }

    // Método público para obter o modelo
    public String getModelo() {
        return modelo;
    }

    // Método público para obter o ano
    public int getAno() {
        return ano;
    }

    // Método público para definir o ano
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método público para obter a cor
    public String getCor() {
        return cor;
    }

    // Método público para definir a cor
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método principal: ponto de entrada do programa
    public static void main(String[] args) {
        // Cria um novo objeto Carro com modelo "Fusca", ano 1980 e cor "Azul"
        Carro carro = new Carro("Fusca", 1980, "Azul");

        // Exibe informações do carro
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());

        // Atualiza o ano e a cor do carro
        carro.setAno(1985);
        carro.setCor("Vermelho");

        // Exibe as informações atualizadas
        System.out.println("Novo ano: " + carro.getAno());
        System.out.println("Nova cor: " + carro.getCor());
    }
}

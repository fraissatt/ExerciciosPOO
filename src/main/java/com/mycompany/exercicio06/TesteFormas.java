/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio06;

/**
 *
 * @author jvale
 */
// Interface Forma.java
interface Forma {
    // Método que calcula a área da forma geométrica.
    double calcularArea();
    
    // Método que exibe a área calculada.
    void exibirArea();
}

// Classe de teste: TesteFormas.java
public class TesteFormas {
    public static void main(String[] args) {
        // Criando objetos de formas geométricas utilizando a interface Forma.
        Forma retangulo = new Retangul(5, 3);   // Retângulo com base = 5 e altura = 3
        Forma triangulo = new Triangul(4, 6);     // Triângulo com base = 4 e altura = 6
        Forma circulo = new Circul(2.5);          // Círculo com raio = 2.5

        // Demonstração de polimorfismo: mesmo método exibirArea() chamado para diferentes formas.
        retangulo.exibirArea();
        triangulo.exibirArea();
        circulo.exibirArea();
    }
}

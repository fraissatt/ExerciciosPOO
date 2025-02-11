/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio06;

/**
 *
 * @author jvale
 */
class Triangul implements Forma {
    private double base;
    private double altur;

    // Construtor que inicializa os atributos base e altura.
    public Triangul(double base, double altur) {
        this.base = base;
        this.altur = altur;
    }

    // Implementação do método para calcular a área do triângulo.
    @Override
    public double calcularArea() {
        return (base * altur) / 2.0;
    }

    // Exibe a área calculada.
    @Override
    public void exibirArea() {
        System.out.println("Área do Triângulo: " + calcularArea());
    }
}
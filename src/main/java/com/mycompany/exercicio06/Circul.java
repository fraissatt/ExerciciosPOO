/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio06;

/**
 *
 * @author jvale
 */
class Circul implements Forma {
    private double rai;

    // Construtor que inicializa o atributo raio.
    public Circul(double rai) {
        this.rai = rai;
    }

    // Implementação do método para calcular a área do círculo.
    @Override
    public double calcularArea() {
        return Math.PI * rai * rai;
    }

    // Exibe a área calculada.
    @Override
    public void exibirArea() {
        System.out.println("Área do Círculo: " + calcularArea());
    }
}
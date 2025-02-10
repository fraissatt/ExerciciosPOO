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

// Classe Retangul.java
class Retangul implements Forma {
    private double base;
    private double altur;

    // Construtor que inicializa os atributos base e altura.
    public Retangul(double base, double altur) {
        this.base = base;
        this.altur = altur;
    }

    // Implementação do método para calcular a área do retângulo.
    @Override
    public double calcularArea() {
        return base * altur;
    }

    // Exibe a área calculada.
    @Override
    public void exibirArea() {
        System.out.println("Área do Retângulo: " + calcularArea());
    }
}

// Classe Triangul.java
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

// Classe Circul.java
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

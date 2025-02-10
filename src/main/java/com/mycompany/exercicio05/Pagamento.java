/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio05;

/**
 *
 * @author jvale
 */
public abstract class Pagamento {
    protected double valor; // Valor base do pagamento

    public Pagamento(double valor) {
        this.valor = valor;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract double calcularValor();

    // Método concreto que exibe uma mensagem genérica sobre o pagamento
    public void exibirDetalhes() {
        System.out.println("Detalhes do pagamento: valor base = " + valor);
    }
}


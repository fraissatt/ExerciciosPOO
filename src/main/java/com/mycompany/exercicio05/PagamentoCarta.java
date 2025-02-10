/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio05;

/**
 *
 * @author jvale
 */
public class PagamentoCarta extends Pagamento {

    public PagamentoCarta(double valor) {
        super(valor);
    }

    @Override
    public double calcularValor() {
        // Adiciona 2% de taxa sobre o valor base
        return valor * 1.02;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pagamento com cartão:");
        System.out.println("Valor base: " + valor);
        System.out.println("Valor com taxa (2%): " + calcularValor());
    }
}
    
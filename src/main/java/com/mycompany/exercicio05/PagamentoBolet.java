/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio05;

/**
 *
 * @author jvale
 */
public class PagamentoBolet extends Pagamento {

    public PagamentoBolet(double valor) {
        super(valor);
    }

    @Override
    public double calcularValor() {
        return valor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pagamento com boleto:");
        System.out.println("Valor: " + calcularValor());
    }
}

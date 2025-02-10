/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio05;

/**
 *
 * @author jvale
 */
public class TestePagamento {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCarta(100.0);
        Pagamento pagamento2 = new PagamentoBolet(100.0);

        pagamento1.exibirDetalhes();
        System.out.println();
        pagamento2.exibirDetalhes();
    }
}

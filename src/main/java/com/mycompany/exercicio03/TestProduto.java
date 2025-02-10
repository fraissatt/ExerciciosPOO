/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio03;

/**
 *
 * @author jvale
 */
public class TestProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Livro", 39.90, 10);

        System.out.println("Informações iniciais do produto:");
        produto.exibirInformacoes();

        System.out.println("\nAdicionando 5 unidades ao estoque..");
        produto.adicionarEstoque(5);
        produto.exibirInformacoes();

        System.out.println("\nTentando remover 20 unidades do estoque..");
        produto.removerEstoque(20);
        produto.exibirInformacoes();

        System.out.println("\nRemovendo 8 unidades do estoque..");
        produto.removerEstoque(8);
        produto.exibirInformacoes();
    }
}

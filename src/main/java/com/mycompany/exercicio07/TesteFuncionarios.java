/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio07;

/**
 *
 * @author jvale
 */
public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 3000.0);
        Funcionario gerente = new Gerente("Maria", 5000.0);
        Funcionario desenvolvedor = new Desenvolvedor("Pedro", 4000.0);
        
  
        System.out.println("Detalhes do Funcionário:");
        funcionario.exibirDetalhes();
        
        System.out.println("\nDetalhes do Gerente:");
        gerente.exibirDetalhes();
        
        System.out.println("\nDetalhes do Desenvolvedor:");
        desenvolvedor.exibirDetalhes();
    }
}

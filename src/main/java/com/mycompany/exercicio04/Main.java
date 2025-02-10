/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio04;

/**
 *
 * @author jvale
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2021, 4);
       
        Moto moto = new Moto("Yamaha", "MT-07", 2020, 689);
        
        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();
        
        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
    }
}


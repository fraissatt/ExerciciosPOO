/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio07;

/**
 *
 * @author jvale
 */
class Funcionario {
    private String nome;
    private double salario;
    

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    

    public String getNome() {
        return nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Bônus: " + calcularBonus());
    }
    
    // Método para calcular o bônus (10% do salário)
    public double calcularBonus() {
        return salario * 0.10;
    }
}

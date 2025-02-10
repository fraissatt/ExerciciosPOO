/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio07;

/**
 *
 * @author jvale
 */
class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public double calcularBonus() {
        return getSalario() * 0.20;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */

//1 - criando uma classe
public class ContaBancaria {
    //2 - craindo atribudo private
    private double saldo;
    
    //craindo contrutor

    public ContaBancaria() {
       this.saldo = 0.00; 
    }

        public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
        
        //3 criando um getter

    public double getSaldo() {
        return saldo;
    }
        
    
    //4 criando um metodo publico para o atribudo saldo
    public void depositar (double valor){
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }
    
}

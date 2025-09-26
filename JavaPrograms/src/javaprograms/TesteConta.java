/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class TesteConta {
        public static void main(String[] args) {
            //criando um objeto to tipo conta
            ContaBancaria c = new ContaBancaria();
            
            //5 chamando o metodo depositar
            c.depositar(10);
            System.out.println("Saldo atual: " + c.getSaldo());
            
            c.depositar(150);
            System.out.println("Saldo atual: " + c.getSaldo());
            
           c.depositar(-100);
            System.out.println("Saldo atual: " + (c.getSaldo()));
            
            System.out.println("Saldo atual: " + c.getSaldo());
            
        }

    
}

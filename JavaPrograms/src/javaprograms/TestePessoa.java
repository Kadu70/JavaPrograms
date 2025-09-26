/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
//classe para testa a classe pessoa
public class TestePessoa {
//4    
//metodo main - metodo que sera executado automaticamento ao rodar o programa
    
    public static void main(String[] args) {
        //intanciando um objeto do tipo pessoa
        //para declarar um objeto class é necessario o uso do perador new
        //declarando e chamando contrutor da classe pessoa para criar o objeto p
        Pessoa p = new Pessoa(); 
        Pessoa p1;
        p1 = new Pessoa("Otavio", -30);
        
        //exibindo os valores dos objetos declarados usando os metodos getters
        System.out.println ("Nome: " + p.getNome() + "\n" + "Idade: " + p.getIdade());
         System.out.println ("Nome: " + p1.getNome() + "\n" + "Idade: " + p1.getIdade());
       
         //atribuindo valores ao objeto p usando os metodos setters
         p.setNome("Carlos");
         p.setIdade(0);
         
         System.out.println ("Nome: " + p.getNome() + "\n" + "Idade: " + p.getIdade());
    }



}

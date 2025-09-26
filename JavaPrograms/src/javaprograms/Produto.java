/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
//1 - criando uma classe Produto
public class Produto {
    //2 criando os atrobutos com acesso prevate
    private String nome;
    private double preco;
    private int qtdeemestoque;
    
    //craindo construtores
//construtor sem parametros
    public Produto() {
        //atribuindo valores nulos
        this.nome = "";
        this.preco = 0.00;
        this.qtdeemestoque = 0;
    }

    //construtor com paramentos
    public Produto(String nome, double preco, int qtdeemestoque) {
        //atribuindo os valores dos atributos os valores passados pelos paramentros
        this.nome = nome;
        this.preco = preco;
        this.qtdeemestoque = qtdeemestoque;
    }
    
 
    //3 - getters e setters
    
    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtdeemestoque(int qtdeemestoque) {
        this.qtdeemestoque = qtdeemestoque;
    }
    
    
    //getters

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdeemestoque() {
        return qtdeemestoque;
    }
    
}

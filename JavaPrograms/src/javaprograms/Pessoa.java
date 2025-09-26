/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */

//declarando uma classe
//1 criar a classe pessoa
public class Pessoa {
    //declarando os atributos
    //private - modificador de acesso
    //somente os metodos da classe tem acesso a esses atributos
//2 criando os atributos como privat   
    private String nome;
    private int idade;
    
    
    //criando os metodos 
    //criando os contrutores

    //construtor sem valores (null)
    public Pessoa() {
        this.nome = "";
        this.idade=0;
    }
    //criando construtor com parametos de valores
    public Pessoa(String nome, int idade) {
        //this - operador de referencia ao atributos
        this.nome = nome;
        this.setIdade(idade);
        
    }
    //metodos de entradas  set
    
    
//3 metodos get e set    
//recebe uma string como parametro
  // tipo void significa sem retorno
    //public - modificar que define um metodo como tendo acesso a todos
    public void setNome(String nome) {
        //atribuir ao atributo this.nome o valor da variavel nome
        this.nome = nome;
    }

    
    public void setIdade(int idade) {
        //aytibui ao atributo this.idade o valor da variavel idade
        //verificando o valor da parametro idade se é >=0
        
        if (idade >= 0)
            this.idade = idade;
        else
            System.out.println("Valor da Idade Negativo");
    }

    //metodo de saida de dados
    //metodo que retorno um valor do tipo string
    public String getNome() {
        //define o atributo de retorno do get
        return nome;
    }

    //metodo que retorna o valor do atributo idade
    public int getIdade() {
        //retorno o valor do atributo idade
        return idade;
    }
    
    
    
        
    
}

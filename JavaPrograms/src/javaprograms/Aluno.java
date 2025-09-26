/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */

//1 - craindo a classe Aluno
public class Aluno {
//2 - criando os atributos private para o nome e nota
    private String nome;
    private double nota;
    
    //criando os construtores

    public Aluno(String nome, double nota) {
        this.nome = nome;
        setNota(nota);
    }

    public Aluno() {
        this.nome = "";
        this.nota = 0;
    }
    
    //3 - criando os getters e o setters
    
    
    //setters
     public void setNome(String nome) {
        this.nome = nome;
    }

     //4- verificando o valor da nota antes de atribuir ao atributo
    public void setNota(double nota) {
        //caso a nota não esteja entre 0 e 10
        if (!((nota >= 0.0) && (nota <=10.0))) {
            throw new IllegalArgumentException("Valor da Nota Invalido.");
        }
        this.nota = nota;
    }
    //getters

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
//5 - metodo que verifica o estadus do aluno
    //"Aprovado" (nota >= 7.0), "Em Recuperação" (nota >= 5.0) ou "Reprovado" (nota < 5.0).
   public String getStatus (){
       String retorno = "Aprovado";
       if (this.nota < 7.0 && this.nota >=5.0) {
           retorno = "Recuperação";
       }else if (this.nota <5.0)
           retorno = "Reprovado";
       return retorno;
   }
    
    
    
}

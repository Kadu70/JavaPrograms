/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Aluno
 */
// Classe Livro.java
class Livro {
    //criando atributos publicos
    String titulo;
    String autor;

    //construtor que atribui ao objeto os valores dos paramentros passados
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro() {
        this.titulo = "";
        this.autor = "";
    }
     //metodo que retorna uma string com os valores dos atribudos daclase
    public String getInfo() {
        return "Título: " + this.titulo + ", Autor: " + this.autor;
    }

    
}



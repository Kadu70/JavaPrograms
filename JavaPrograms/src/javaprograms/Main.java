/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Aluno
 */
// Classe Main.java
public class Main {
    public static void main(String[] args) {
        
        //cria um objeto biblioteca
        Biblioteca minhaBiblioteca = new Biblioteca();
        //cria objeto livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling");
        
        //adciona os livros ao objeto bilbioteca
        minhaBiblioteca.adicionarLivro(livro1);
        minhaBiblioteca.adicionarLivro(livro2);
        minhaBiblioteca.listarLivros();
        
    }
}


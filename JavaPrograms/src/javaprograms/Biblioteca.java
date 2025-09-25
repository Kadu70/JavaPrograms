/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Aluno
 */
// Classe Biblioteca.java
import java.util.ArrayList;

class Biblioteca {
    //criando uma lista para aramazenar objetos do tipo livro
    ArrayList<Livro> livros;

    public Biblioteca() {
        //criando uma lista para o objeto livros vazio
        //() para chamar o construtor, e os sinais de 
        //menor/maior <> (diamond operator) para inferir o tipo dos elementos 
        //que a lista irá conter, eliminando a necessidade de repetir 
        //a especificação do tipo genérico. 
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        //adiciona a lista um novo objeto
        this.livros.add(livro);
    }

    public void listarLivros() {
        System.out.println("Livros na biblioteca:");
        //criando um laço que percore toda a lista libro, um por vez
        //o objeto livro recebe item a item da lista
        for (Livro livro : this.livros) {
            //chama o metodo do libro que retorna as informação do libro atual
            System.out.println(livro.getInfo());
        }
    }
}

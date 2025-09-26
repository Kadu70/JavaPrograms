/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class TesteListaDeCompra {
    public static void main(String[] args) {
        //declarando os objetos
        ListaDeCompras lista = new ListaDeCompras();
        lista.adicionarItem("Pão", 0);
        lista.adicionarItem("Leite", 1);
        lista.adicionarItem("Acucar", 2);
        lista.adicionarItem("Cafe", 3);
        lista.adicionarItem("Mantega", 4);
        lista.imprimirLista();
        
        //teste com valor de indice invalido
        lista.adicionarItem("Bolacha", 5);
        
        //criando um novo objeto 
        ListaDeCompras lista2 = new ListaDeCompras();
        //deverá exibir todos os campos como nulo
        lista2.imprimirLista();
        
        //imprimido a lista 
        //com esse metodo posso pegar os valores da lista, sem a necessitade
        //de imprimir, ou usar um outro metodo para exibir os valores
        System.out.println ("carregando a lista : \n" +lista.CarregaLista());
 
        
        
    }
}

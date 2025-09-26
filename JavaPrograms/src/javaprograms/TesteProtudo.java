//importando a biblioteca Scanner
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class TesteProtudo {
    //4 criando o main para testa a classe protudo
    public static void main(String[] args) {
        //declarei um obj do tipo Produto
        Produto p ;
        //instanciado um objeto
        p= new Produto();
        
        //craindo um objeto para entrada de dados
        Scanner n = new Scanner(System.in);
        
        //atribuido os valores ao objeto
        p.setNome("Monitor");
        p.setPreco(8000.00);
        p.setQtdeemestoque(4);
        
        //exibindo os valores
        
        System.out.println("Nome do Produto: " + p.getNome());
        System.out.println("Preco do Produto: " + p.getPreco());
        System.out.println("Qtde do Produto: " + p.getQtdeemestoque());
        
        System.out.println("Nome do Produto: " );
        p.setNome(n.next());
        
        System.out.println("Preco do Produto: ");
        p.setPreco(n.nextDouble());
        
        System.out.println("Qtde do Produto: ") ;
        p.setQtdeemestoque(n.nextInt());
        
        System.out.println("Nome do Produto: " + p.getNome());
        System.out.println("Preco do Produto: " + p.getPreco());
        System.out.println("Qtde do Produto: " + p.getQtdeemestoque());
        
        
        
        
    }
    
}

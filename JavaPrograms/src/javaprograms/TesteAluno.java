/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class TesteAluno {
    
    //6 - criando o metodo main para testar a classe aluno
    public static void main(String[] args) {
        //declarando o objeto Aluno
        Aluno a = new Aluno();
        Aluno b = new Aluno("Carlos", 7.5);
        Aluno c = new Aluno();
        Aluno d = new Aluno();
        
        a.setNome("Joao");
        a.setNota (5.0);
        c.setNome("Eduardo");
        c.setNota (4.0);
        
        
        
        System.out.println("Aluno :" + a.getNome() + 
                          "\nMedia :" + a.getNota() +
                           "\nfoi : " + a.getStatus());
        
        System.out.println("Aluno :" + b.getNome() + 
                          "\nMedia :" + b.getNota() +
                           "\nfoi : " + b.getStatus());
        System.out.println("Aluno :" + c.getNome() + 
                          "\nMedia :" + c.getNota() +
                           "\nfoi : " + c.getStatus());
        
        d.setNome("Fernando");
        d.setNota (-10.0);
        
          System.out.println("Aluno :" + d.getNome() + 
                          "\nMedia :" + d.getNota() +
                           "\nfoi : " + d.getStatus());
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Aluno
 */

//atividade5 - aprova ou não um estuante se o mesmo seguir um contição especifica
public class Atividade05 {
     public static void main(String[] args) {
        // TODO code application logic here
        // Declare e inicialize as seguintes variáveis:
      
        //delarando e iniciando variais do tipo booleando
        //cujo os valores serão verdadeiro (true) ou falso (false)
        
        boolean estudanteAprovado= true , temAtestado =true;
        
        //usando o if para verificar se as contições para ser aprovado estao deacordo
        
        //usando as variaveis  'estudanteAprovado' e 'temAtestado', sendo ambas vedadeiras
        
        
        //usando a operação Logica E
        //caso a variaveis  'estudanteAprovado' e 'temAtestado', sejam ambas verdadeira 
        if (estudanteAprovado && temAtestado  )
            //sera exibio o testo abaixo
            System.out.println("O aluno foi aprovado " + estudanteAprovado +" E tem atestado " + temAtestado);
        else //senão o
            //Usando a Operação logica ou
            // a variavel 'estudanteAprovado' ou 'temAtestado', seja bi minimo uma verdadeira 
             if (estudanteAprovado || temAtestado )
                 //sera executado o codigo abaixo, exibindo os seus valores
               System.out.println("O aluno foi aprovado " + estudanteAprovado +"   tem atestado " + temAtestado);
             else//senao
                 //significa que ambas as variaveis estão com os valores como falso (false)
                 //infomando na saida padrao que o aluno foi não foi aprovado
                System.out.println("O aluno não foi aprovado." );
        
        //metodo que pula 2 linhas
        //uma do println e outra do "\n"
        System.out.println("\n");
        
        //altera o valor do temAtestado para falso (false)
        temAtestado = false;
        
        //realiza a operação logica E
        if (estudanteAprovado && temAtestado )
            System.out.println("O aluno foi aprovado  " + estudanteAprovado +" E tem atestado " + temAtestado);
        else 
            //realiza a operação logica OU
             if (estudanteAprovado || temAtestado )
               System.out.println("O aluno foi aprovado  " + estudanteAprovado +" E  tem atestado " +  temAtestado);
             else
                System.out.println("O aluno não foi aprovado." );
        
        //pula 2 linhas
        System.out.println("\n");
        
        //altera ambas as variaveis para falso (false)
        estudanteAprovado= false;
        temAtestado = false;
        
        //usando o operado E
        if (estudanteAprovado && temAtestado )
            System.out.println("O aluno foi aprovado  " + estudanteAprovado +" E tem atestado." + temAtestado);
        else 
            //usando o operador OU
             if (estudanteAprovado || temAtestado )
               System.out.println("O aluno foi aprovado " + estudanteAprovado +" E tem atestado." + temAtestado);
             else
                System.out.println("O aluno não foi aprovado."  );
                      
        
        
    }
}

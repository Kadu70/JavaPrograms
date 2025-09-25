/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Aluno
 */

//atividade03 - declara variaveis do tipo inteiro de varios tamanhos
//e faz a conversão de tipos
public class Atividade03 {
    public static void main(String[] args) {
        // TODO code application logic here
        // Declare e inicialize as seguintes variáveis:
        
        //declarando as variaveis inteiras
        //iniciando cada valor
         byte idade= 55;
         short diasnoano = 365;
         long popMundial = 8_23_000_000;
         int kl =  33501;
         
        
        // Imprima o valor de cada variável
        
        //classe System contem metdos de entrada e saida de valores
        //out - carrega os metodos de saida
        //println - exibe na saida padrão o valor informado, e apos isso pula uma linha
        //para concatenar os varios tipos da dados (strings e numeros) usando o operado (+)
        System.out.println("Minha Idade é " + idade + " Anos");
        System.out.println("Dias no Ano " + diasnoano +" Dias");
        System.out.println("População Mundial " + popMundial + " pessoas");
        System.out.println("De Maua ate Av Paulista " + kl + "kl" );
        
        //uso de um cast para converter um numero inteiro para um short 
        //assim não gerando erro ao ser executado, mas pode peder valores
        diasnoano = (short)kl;
        System.out.println("Kl em Short " + diasnoano );
        
        //usando um cast para conveter um tipo inteiro longo para um inteiro simples
        //pode haver peda de valores
        kl = (int) popMundial;
        System.out.println("População Mundial em int " + kl );
       
        //declando um numero inteiro com valor alto
         int meuInt = 1500000;
          
        //atribuindo a uma variavel do tipo shirt (inteiro com um range de valores menores que o int)
        
        //se usar a atribuição diretamente o copilador informara um erro
        //short meuShort = meuInt; // Erro de compilação!
        
        //e necessario usar um onversor (cast) para atribuir valores  maiore em uma variavel com menor capacidade
        //quando o valor ultrapassa o valor maximo da variavel, a mesma reinicia com o seu menor valor
        short meuShort = (short)meuInt; // Erro de compilação!
        
        
        //declarando e iniciando uma variavel do tipo double, com valores decinais
        double meuDouble = 9.78;
        
        //para não causar um erro, usamos uma cast (int) para converder o valor da variavel double para inteiro
        int outroInt = (int)meuDouble; // Erro de compilação!

        //criando e inicia uma variavel do tipo float simples, como o java considera todos os numeros de ponto flutuante, como sendo double
        //necessitando fazer uma conversão, usando a letra (F) no final do numero
        float meuFloat = 12.34F;
        
        //carregando na tela os valores das variais
        //usando a classe System e o metodo de saida out.println, para exibir os valores
        System.out.println(meuInt); //valor do inteiro conforme inicializado - 1500000
        System.out.println(meuShort);//valor do short que recebeu o valor do inteiro, como o mesmo não suporta o valor o mesmo foi inicializado, começando pelo seu menor valor
        System.out.println(meuDouble);//exibe o valor da variavel double conforme a mesma foi inicializada (9.78)
        System.out.println(outroInt);//exibe o valor da variavel inteiro que foi inicializada com um valor double, so recebendo a parte inteira, conforme o cast usado
        System.out.println(meuFloat);//valor da variavel do tipo float conforme foi inicializando usando o F
        

        
                
        
        
    }
    
}

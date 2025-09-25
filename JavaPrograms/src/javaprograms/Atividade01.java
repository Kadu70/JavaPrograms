/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /* @author Aluno
 */


//atividade que cria varias variaveis primitivas e apresenta na tela

//nome da classe
public class Atividade01 {
    
    //metodo principal que sera executado ao abrir/rodar a classe
    public static void main(String[] args) {
        
        // TODO code application logic here
        // Declare e inicialize as seguintes variáveis:
        
        //declara varias variaveis primitivas, com valores iniciais
        //tipos inteiros
         byte idade= 55;
         short ano = 2025;
         int populacao = 11_451_999;
         long distanciaViaLactea =  23_000_000;
         
         //declaração de variais tipo ponto flutuante
         float preco = 19.55F; // o uso do F bi final, e para informar que uma constante numerica do tipo float
         double pi = 3.14159265;// todos os numeros de ponto flutuante sao considerados double
         
         //declarando uma variavel tipo caracter (um digito qualquer0
         char letra = 'c';
         
         //delcarando variavel do tipo booleano (verdadeiro/falso)
         boolean ehVerdadeiro = true;
        
        // Imprima o valor de cada variável
        
        //classe System, faz parte do pacote basico do java, não necessita ser biblioteca importado
        //out - carrega metodos de saida
        //println - metido de saida que imprimi um valor na saida padrão e deois pula uma linha (ln - linha nova)
        System.out.println("Minha Idade é " + idade);
        System.out.println("Ano" + ano);
        System.out.println("População " + populacao);
        System.out.println("Vialactea " +distanciaViaLactea );
        System.out.println("Preço " + preco);
        System.out.println("Pi " + pi);
        System.out.println("Letra " + letra );
        System.out.println("Verdade " + ehVerdadeiro);
        
    }
}

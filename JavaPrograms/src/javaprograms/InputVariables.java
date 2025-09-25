/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;
// importando biblioteca que possui o classe scanner
// a classe scanner possui metodos de entrada conforme o tipo de dado
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class InputVariables {
    public static void main(String[] args) {
        
        //declarando uma classe. é necessario o usso do operador new
        //o parametro System.in que foi passado para a classe scanner
        //define que serao usados medodos para entradas de dados
        
        Scanner in = new Scanner(System.in);
        
        //declarando as variaveis do tipo primitivo
        boolean boolVal;
        byte byteVal;
        char charVal;
        short shortVal;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;
        String strMsg = "Entre com o valor de um tipo ";
        
        //usando o metodo printo da classe System para solicitar os valores
        System.out.print(strMsg + "booleando: ");
        
        boolVal = in.nextBoolean(); //le um valor booleano
        
        System.out.print(strMsg + "byte: ");
        byteVal = in.nextByte(); //le um valor tipo byte
        
        System.out.print(strMsg + "caractere (char): ");
        //metodo charAt(i) retorno o caracter que estiver na posição (i)
        charVal = in.next().charAt(0);//le apenas o primeiro caracter da linha
        
        System.out.print(strMsg + "inteiro curto (short): ");
        shortVal = in.nextShort();//le um valor do tipo Short
        
        System.out.print(strMsg + "inteiro (int): ");
        intVal = in.nextInt();//le um valor do tipo int
        
        System.out.print(strMsg + "inteiro longo (long): ");
        longVal = in.nextLong();//le um valor do tipo long
        
        System.out.print(strMsg + "ponto flutuante (float): ");
        //para os valores decimais usar o padrao configurado no pc
        floatVal = in.nextFloat();//le um valor do tipo float
        
        System.out.print(strMsg + "ponto doubro (double): ");
        //para os valores decimais usar o padrao configurado no pc
        doubleVal = in.nextDouble();//le um valor do tipo double
        
        //fecha a classe scanner que foi aberta para entrada de dados        
        in.close();
        
        //exibe na saida padrão os valores informados
        System.out.println("valor boolean : " + boolVal);
        System.out.println("valor byte : " + byteVal);
        System.out.println("valor char  : " + charVal);
        System.out.println("valor short : " + shortVal);
        System.out.println("valor int : " + intVal);
        System.out.println("valor long : " + longVal);
        System.out.println("valor float : " + floatVal);
        System.out.println("valor double: " + doubleVal);
    }     
}

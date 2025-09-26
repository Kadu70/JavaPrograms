/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Aluno
 */
public class TesteArea {
    public static void main(String[] args) {
        //declarando objeto retangulo para calculo da area
        Retangulo r = new Retangulo();// usando um construtor simples sem paramentos
        //apenas declarando o objeto
        Retangulo r1;
        //criando o objeto usando construtor com passagem de parametros
        r1 = new Retangulo (10.0, 15.0);
        
        //atribuindo os valores a largura e altura
        r.setAltura(5.0);
        r.setLargura(6.0);
                
        //exibindo os valores das areas
        
        System.out.println ("o Valor da area do retangulo R é :" + r.getArea());
        
        //exibindo o valor usando o metodo print da classe retangulo
        r1.PrintArea();
    }
}

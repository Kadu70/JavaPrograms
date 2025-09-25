// package javaprograms;
import java.util.ArrayList;
import java.util.List;

public class TesteForma {
    public static void main(String[] args) {
        // cria um arraylista do tipo base Forma
        List<Forma> formas = new ArrayList<>();
        //adiciona a lista um objeto do tipo Ciruclo com o valor do raio
        formas.add(new Circulo(5.0));

        //adiciona a lista um objeto do tipo Retangulo com os valores de altura e largura
        formas.add(new Retangulo(4.0, 6.0));

        //laço que ira percorer todos os itens da lista
        for (Forma forma : formas) {
            //exibe os valores da area e do perimeto dos objetos da lista
            System.out.println("--------------------");
            System.out.println("Área: " + forma.getArea());
            System.out.println("Perímetro: " + forma.getPerimetro());
        }
    }
}


package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criamos uma lista que só aceita nomes (String)
        ArrayList<String> listaPresenca = new ArrayList<>();

        // 1. Adicionar nomes à lista (eles são adicionados no final)
        System.out.println("--- Adicionando nomes ---");
        listaPresenca.add("Carla");
        listaPresenca.add("Ana");
        listaPresenca.add("Bruno");
       
        System.out.println("Lista inicial: " + listaPresenca); // Saída: [Carla, Ana, Bruno]
        //ordenando a lista, forma crescene
        Collections.sort(listaPresenca);

        System.out.println("Lista inicial: " + listaPresenca); // Saída: [Ana, Bruno, Carla]

    //ordenando a lista, forma descrescene
        Collections.sort(listaPresenca,Collections.reverseOrder());
        System.out.println("Lista inicial: " + listaPresenca); // Saída: [Carla, Bruno, Ana]



        // 2. Acessar um nome pela sua posição (índice)
        String primeiroNome = listaPresenca.get(0);
        System.out.println("O primeiro nome da lista é: " + primeiroNome); // Saída: Carla

        //2.1 acessando o primeiro item da lista usando o metodo getFirst()    
        System.out.println("O primeiro nome da lista é: " + listaPresenca.getFirst()); // Saída: Carla

        //2.2 acessando o ultimo item da lista usando o metodo getLast
        System.out.println("O Ultimo nome da lista é: " + listaPresenca.getLast()); // Saída: Ana

        // 3. Remover um nome
        System.out.println("\n--- Removendo um nome ---");
        listaPresenca.remove("Bruno");
        System.out.println("Lista após remover 'Bruno': " + listaPresenca); // Saída: [ Carla, Ana]

        //adicionando o bruno novamente
        listaPresenca.add("Bruno");
        System.out.println("Lista inicial: " + listaPresenca); // Saída: [Carla,  Ana, Bruno]

        //posso renover o bruno, usando o indice do mesmo, no caso 2
        listaPresenca.remove(2);
        System.out.println("Lista após remover 'Bruno': " + listaPresenca); // Saída: [ Carla, Ana]


        //removendo todos os itens da lista
        listaPresenca.clear();
        System.out.println("Lista inicial: " + listaPresenca); // Saída: []

        //verificando se a lista esta vazia
        if(listaPresenca.isEmpty()){
            System.out.println("a lista esta vazia");
        }
    }
}

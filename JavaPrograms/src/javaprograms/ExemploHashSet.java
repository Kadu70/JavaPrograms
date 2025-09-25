
package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
     public static void main(String[] args) {
        // Criamos um conjunto que só aceita tarefas (String)
        Set<String> tarefas = new HashSet<>();

        // 1. Adicionar tarefas ao conjunto
        System.out.println("--- Adicionando tarefas ---");
        tarefas.add("Comprar pão");
        tarefas.add("Estudar Java");
        tarefas.add("Comprar pão"); // Tentando adicionar uma duplicata
        tarefas.add("Lavar o carro");
        System.out.println("Conjunto de tarefas: " + tarefas);
        // A ordem pode variar, mas 'Comprar pão' aparece apenas uma vez
        // Ex: [Lavar o carro, Comprar pão, Estudar Java]


        

        // 2. Verificar se uma tarefa já existe
        boolean temTarefa = tarefas.contains("Estudar Java");
        System.out.println("\nA tarefa 'Estudar Java' está no conjunto? " + temTarefa); // Saída: true
        
        // 3. Remover uma tarefa
        System.out.println("\n--- Removendo uma tarefa ---");
        tarefas.remove("Lavar o carro");
        System.out.println("Conjunto após remover 'Lavar o carro': " + tarefas);


        //adicionando o lavar o carro novamente

        
        tarefas.add("Lavar o carro");
        System.out.println("Conjunto de tarefas: " + tarefas);

        //adicionando nova tarefa
        tarefas.add("Lavar os Pratos");
        System.out.println("Conjunto de tarefas: " + tarefas);


        //removendo o Estudar Java
         tarefas.remove("Estudar Java");
        System.out.println("Conjunto de tarefas: " + tarefas);

        //adicionando novamente o Estudar Java
          tarefas.add("Estudar Java");
          System.out.println("Conjunto de tarefas: " + tarefas);

//os itens são adicionando de uma forma livre, podendo ser colocados no inicio, final ou no meio da lista

    }

    
}

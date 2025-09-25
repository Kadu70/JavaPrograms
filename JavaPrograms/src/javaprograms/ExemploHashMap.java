

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        // Criamos um mapa onde a chave é um Integer e o valor é uma String
        Map<Integer, String> alunos = new HashMap<>();

        // 1. Adicionar alunos (pares de matrícula-nome)
        System.out.println("--- Cadastrando alunos ---");
        alunos.put(101, "João Silva");
        alunos.put(102, "Maria Oliveira");
        alunos.put(103, "Carlos Santos");
        System.out.println("Mapa de alunos: " + alunos); // Ex: {101=João Silva, 102=Maria Oliveira, 103=Carlos Santos}

        // 2. Encontrar o nome de um aluno pela sua matrícula (chave)
        System.out.println("\n--- Buscando um aluno ---");
        String nomeAluno = alunos.get(102);
        System.out.println("O nome do aluno com matrícula 102 é: " + nomeAluno); // Saída: Maria Oliveira

        // 3. Verificar se uma matrícula já existe
        boolean temMatricula = alunos.containsKey(101);
        System.out.println("A matrícula 101 existe? " + temMatricula); // Saída: true

        // 4. Remover um aluno pela sua matrícula
        System.out.println("\n--- Removendo um aluno ---");
        alunos.remove(103);
        System.out.println("Mapa após remover o aluno 103: " + alunos);
    }
}


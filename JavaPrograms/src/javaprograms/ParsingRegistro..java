public class ParsingRegistro {
    public static void main(String[] args) {
        String registro = "2024001;Joao Silva;Java Programming;9.5";
        
        System.out.println("Registro Original: " + registro);
        System.out.println("----------------------------------------");
        
        // 1. Use split() para dividir a string pelo delimitador ";"
        //é criado um array com o valor da variavel registro, sendo o caractere ';', o delimitador
        //o mesmo que {"2024001","Joao Siva", "Java Programming", "9.5"}
        String[] dados = registro.split(";");
        String[] dados2 = {"2024001","Joao Siva", "Java Programming", "9.5"};
        
        // Os dados sao armazenados nas seguintes posicoes:
        // dados[0]: Matricula
        // dados[1]: Nome do Aluno
        // dados[2]: Curso
        // dados[3]: Nota



        System.out.println("imprimi na saida padrao os valores do array que foram separado da string");
        //só entra para imprimir se tiver 4 elementos no array dados
        if (dados.length == 4) {
            System.out.println("Matricula: " + dados[0]);
            
            // 2. Imprimir o nome em maiusculas
            String nomeUpper = dados[1].toUpperCase();
          
            System.out.println("Nome:      " + nomeUpper);
            
            System.out.println("Curso:     " + dados[2]);
            
            // 3. Imprimir a nota
            System.out.println("Nota:      " + dados[3]);
        } else {
            System.out.println("Erro: O formato do registro nao corresponde ao esperado.");
        }

            System.out.println("\n");

            //usando o array simples
            //só entra aqui sé tiver 4 elementos no array dados2
            System.out.println("Usando um Array com os mesmo dados, mas neste os itens foram carregados diretamente no array atraves de uma lista com os valores ja separados");
            if (dados2.length == 4) {
            System.out.println("Matricula: " + dados2[0]);
            //colocando o metodo de caixa alta diretamente na variavel array
            System.out.println("Nome:      " + dados2[1].toUpperCase()); 
                        
            System.out.println("Curso:     " + dados2[2]);
            
            // 3. Imprimir a nota
            System.out.println("Nota:      " + dados2[3]);
        } else {
            System.out.println("Erro: O formato do registro nao corresponde ao esperado.");
        }
    }
}

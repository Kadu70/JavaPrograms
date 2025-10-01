public class ConstrutorEmail {
    public static void main(String[] args) {
        String[] destinatarios = {"ana@dominio.com", "beto@dominio.com", "carla@dominio.com", "daniel@dominio.com"};
        
        System.out.println("Lista de Destinatarios:");
        
        // 1. Inicializa o StringBuilder (melhor performance para muitas modificacoes)
        StringBuilder listaEmails = new StringBuilder();
        
        // 2. Itera sobre o array e usa append()
        //laço por que periore um lista, começando pelo primeiro item até o final
        //cada valor do array é armazenado na varial email, que deve ser do mesmo tipo dos valores da string
        for (String email : destinatarios) {
            //metodo append adiciona a lista o valor pego 
            listaEmails.append(email);
            //adiciona um novo caractere (;) apos cada inserção da lista
            listaEmails.append("; "); // adiciona o delimitador
        }
        //exibe toda a lista 
        //o metodo toString monstra os valores como sendo todos um unico string
        System.out.println("String construida (com delimitador extra): " + listaEmails.toString());

        // 3. Remove o ultimo caractere (o ';' extra)
        // O indice do ultimo caractere eh o length() - 1
        //length retorno a qtde de elementos da lista (string)
        //verifica se a lista (string) não esta vazia (tamanho tem que ser > 0)
        if (listaEmails.length() > 0) {
            //como toda a lista começa na posição sera,
            //a posição/indici do ultimo item, será o tamanho (length) - 1 
            int ultimoIndice = listaEmails.length() - 1;
            //remove da lista o caractere que esteja no indici informado
            listaEmails.deleteCharAt(ultimoIndice);//espaço em branco
            listaEmails.deleteCharAt(ultimoIndice-1);//o caractere ´;´
        }
        
        System.out.println("----------------------------------------");
        
        // 4. Imprime o resultado final (convertendo para String)
        String mensagemFinal = listaEmails.toString();
        System.out.println("Lista de E-mails Final: " + mensagemFinal);
    }
}

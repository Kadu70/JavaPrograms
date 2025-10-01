import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class BuscaPalavrasLongas {
    public static void main(String[] args) {
        String texto = "Este eh um exercicio sobre Java e Expressoes Regulares em programacao.";
        
        // Padrao: \w{5,} -> Um caractere de palavra, repetido 5 ou mais vezes.
        //defini o tipo da mascara palavra com no minimo 5 caracteres
        String regex = "\\w{5,}"; 
        //carrega o padrao
        Pattern padrao = Pattern.compile(regex);
        //todas as palabras encontradas que correspondem a mascara, serão armazenada no objeto matcher
        Matcher matcher = padrao.matcher(texto);
        
        System.out.println("Texto em analise: " + texto);
        System.out.println("----------------------------------------");
        System.out.println("Palavras com 5 ou mais caracteres:");
        
        int contador = 0;
        
        // Loop while para encontrar todas as ocorrencias do padrao
        //laço que percorrerar a lista contida em matcher
        //find retorna true se ha valor correspondente a mascara
        //a cada find um novo valor sera carregado/apontado
        //quando não tiver mais valores que corresponderem a mascara
        //o valor sera falso
        while (matcher.find()) {
            // matcher.group() retorna a string que corresponde ao padrao
            //o group retona a string atualmente apontado pelo find
            String palavraEncontrada = matcher.group();
            //exibe a palavra encontrada
            System.out.println(" - " + palavraEncontrada);
            //a cada palavra encontrado o contador sera incrementado
            contador++;
        }
        
        System.out.println("----------------------------------------");
        //mostra o total de palavras encontrada no texto
        System.out.println("Total de palavras longas encontradas: " + contador);
    }
}


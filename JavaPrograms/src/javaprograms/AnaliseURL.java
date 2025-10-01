import java.util.Scanner;

public class AnaliseURL {

    
    public static void main(String[] args) {
  
        while(true){
           // Validar();
            //in1.nextLine();
            //System.out.println("Continua? (0)");
            //continua = Integer.parseInt(in1.nextLine());
            if (Validar()!=0 ){
                break;
            }
            
        }

       
    }

public static int Validar(){
        
              
        Scanner in = new Scanner(System.in);

        String url;
        int retorno = 0;
        System.out.println("Entre com uma URL: ");
        url = in.nextLine();

        System.out.println("URL em analise: " + url);
        System.out.println("----------------------------------------");

        // 1. Verificar o protocolo (http ou https)
        //comprara os valores iniciais da string url com os informados
        //se os mesmos correspodere, retornara True caso contrario Fase
        boolean usaHttp = url.startsWith("http://");
        boolean usaHttps = url.startsWith("https://");
        
        //imprimi na saida os valores obtidos
        System.out.println("Usa HTTPS? " + usaHttps);
        System.out.println("Usa HTTP?  " + usaHttp);

        // 2. Verificar se contem o indicador de dominio (.com)

        //contains ->procura no string url o valor informado, retorno true se encontrar ou false se não
        boolean isComercial = url.contains(".com");
        System.out.println("Contem .com? " + isComercial);

        // 3. Extrair o dominio
        
        // Passo a: Encontrar o Indice onde o dominio comeca (apos "//").
        //retorna o valor (posição), em que o valor informado se encontra
        int inicioProtocolo = url.indexOf("://");
        // O dominio comeca dois caracteres apos "://"
        int inicioDominio = inicioProtocolo + 3; 

        // Passo b: Encontrar o indice onde o dominio termina (na proxima "/").
        // Procuramos o '/' a partir do indice onde o dominio comeca.
        //indexOf -> retorna a posição inicial que o valor informado aparece, começando pelo posição informado (inicioDominio)
        //ele procurara a primeira ocorrencia, se tiver mais ele não informara
        int fimDominio = url.indexOf("/", inicioDominio); 
        // se não encontrar o valor de retorno será (-1)
        // Se nao encontrar '/', significa que a URL termina no dominio (ex: "https://google.com").
        if (fimDominio == -1) {
            //length-> retorna a qtde de caracteres que a string posui, incluindo os espaços em branca, se houver
            fimDominio = url.length();
        }

        // Passo c: Usar substring() para extrair o dominio.
        //substring-> retorna parte de uma string, informando a posição inicial e final do trexo que deseja copiar da string
        String dominio = url.substring(inicioDominio, fimDominio);
        
        System.out.println("----------------------------------------");
        System.out.println("DomÃ­nio Extraido: " + dominio);
        System.out.println("Continua? (0)");
        retorno = Integer.parseInt(in.nextLine());
        in.close();
        return retorno;

}

}

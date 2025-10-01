
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtracaoData {
//metodo que extrai uma data no testo, mas somente verifica se a mesma corresponde ao padrão/mascara informada
//não valida se a data eh valida ou não
    public static void main(String[] args) 
    {
        String texto = "A reuniao esta marcada para 45/09/2025, anote ai.";
        
        // Padrao: (DD)/(MM)/(AAAA)
        // \d{2} para dois digitos, \d{4} para quatro digitos.
        // Os parenteses criam os grupos de captura.
        //define uma mascara que seja no padrao
        // 2 numeros / 2 numeros / 4 numeros
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})"; 
        //carrega o padrao
        Pattern padrao = Pattern.compile(regex);
        //localiza na string se ha algum valor que corresponde a mascara informada
        Matcher matcher = padrao.matcher(texto);
        
        System.out.println("Texto Original: " + texto);
        System.out.println("Padrao: " + regex);
        System.out.println("----------------------------------------");
        //se encontrou na string informada alguma data (conforme a mascara informada)
        //continua a programacao
        if (matcher.find()) {
            //como a mascara é composta por 3 tipos, é possivel acessar cada um deles
            //o group(0) corresponte ao valor total da mascara encontrada
            // matcher.group(0) eh a correspondencia completa: "25/09/2025"
            System.out.println("Data Completa: " + matcher.group(0)); 
            
            //a cada posição do group, retorna o valor de cada parametro da mascara
            // matcher.group(1) eh o conteudo do primeiro parentese
            String dia = matcher.group(1); 
            
            // matcher.group(2) eh o conteudo do segundo parentese
            String mes = matcher.group(2); 
            
            // matcher.group(3) eh o conteudo do terceiro parentese
            String ano = matcher.group(3);
            
            System.out.println("Dia (Grupo 1): " + dia);
            System.out.println("MÃªs (Grupo 2): " + mes);
            System.out.println("Ano (Grupo 3): " + ano);
        } else {
            //caso o metodo find() não encontre nem texto que corresponde a mascara, retornando false
            //exibira essa mensagem
            System.out.println("Data nao encontrada no formato DD/MM/AAAA.");
        }
    }
}

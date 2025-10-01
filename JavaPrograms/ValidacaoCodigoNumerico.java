import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidacaoCodigoNumerico {
    public static void main(String[] args) {
        
        // Padrao: exatamente 6 digitos (\d{6})
        // O uso de "\\d" eh necessario em Strings Java para escapar a barra.
        //define um a mascara
        String regex = "\\d{6}"; //
        //define um padrao que seria 6 numeros decimais, usando a mascara como comparação (6 numeros)
        Pattern padrao = Pattern.compile(regex);
        
        //cria varias varias para o teste
        String codigo1 = "123456"; // Valido
        String codigo2 = "12345";  // Invalido (5 digitos)
        String codigo3 = "12345a"; // Invalido (contem letra)
        String codigo4 = "1234567"; // Invalido (7 digitos)
        
        System.out.println("Padrao: " + regex);
        System.out.println("----------------------------------------");
        
        // Funcao auxiliar para testar e imprimir o resultado
        //metodo criado, que recebe o objeto que possui a mascara e o valor a ser comparado
        testarCodigo(padrao, codigo1);
        testarCodigo(padrao, codigo2);
        testarCodigo(padrao, codigo3);
        testarCodigo(padrao, codigo4);
    }
    
    public static void testarCodigo(Pattern padrao, String codigo) {
        // Cria o Matcher para a string atual
        //verifica ser o valor informado, corresponte a mascara definida no objeto Pattern padrao
        Matcher matcher = padrao.matcher(codigo);
        
        // Usa matches() para verificar se a string INTEIRA se encaixa no padrao.
        // se o valor da string corresponder a mascara, retorna verdadeiro
        boolean isValido = matcher.matches();
        

        //define uma saida formatada
        //%s sera substituido pelo valor da primeira variavel como sendo String
        //o proximo %s refere-se a proxima variavel(valor), e assim em diante
        // "? :" é como um if em lina
        //caso o valor 'isValide' for verdadeiro, pegara o primeiro paramentro ("VALIDO"), caso não o segundo ("INVALIDO")
        System.out.printf("Codigo '%s': %s%n", codigo, isValido ? "VALIDO" : "INVALIDO");
        //se for informado qualquer valor que não tenha 6 caracteres numericos o valor de saida sera invalido
        
    }
}


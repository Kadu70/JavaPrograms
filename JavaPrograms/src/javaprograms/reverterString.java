package javaprograms;

public class reverterString {
    
public static void main(String[] args) {
    
}
public static String Reverter( String str){
        String retorno="";

        //percore a string do ultimo caracter até o primeiro
        for (int i = (str.length()-1); i>=0 ; i--)
        //atribui a variavel retorno o valor do caracter na posição i
        //convertendo para String
            retorno =retorno + String.valueOf(str.charAt(i));
        return retorno;

    }

    //verifica se a palavra ou frase são palidrome, podendo ler do final para o inicio tem o mesmo resultado
    public static boolean Palindrome (String str){
        //definindo que não sao palindrome o retorno sera false
        boolean retorno = false;
        //renove os espaco da string
        String str1 = Remover_Espaco(str);
        //inverte a posição dos caracteres da estring
        String str2 = Reverter (str1);

        //compara as duas String, ignorando as caixas altas e baixa
        //se o resultado for o, são iguais, retornando o falor true
        if (str1.compareToIgnoreCase(str2)== 0)
            retorno = true;
        return retorno;
    }

    public static String Remover_Espaco (String str){
        String retorno="";
        //remove da string todos os espaços em branco , substituindo por ""
        retorno = str.replaceAll(" ","");
        return retorno;
    }
    

}

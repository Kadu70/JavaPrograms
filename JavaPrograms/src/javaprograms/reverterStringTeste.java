package javaprograms;

public class reverterStringTeste {
    
    public static String Reverter( String str){
        String retorno="";
        for (int i = (str.length()-1); i>=0 ; i--)
            retorno =retorno + String.valueOf(str.charAt(i));
        return retorno;

    }
    public static void main(String[] args) {
        String str = "Java";
        System.out.format("A palavra '%s', invertida eh '%s' \n", str.toUpperCase(), reverterString.Reverter(str).toUpperCase() );

        str = "Ama";
        Print_Palindrome(str);

        str = "Roma";
        Print_Palindrome(str);

        str = "Socorram me Subi no Onibus em Marrocos";
        Print_Palindrome(str);
    }

    public static void Print_Palindrome(String str){
        if (reverterString.Palindrome(str)){
            System.out.format("A palavra '%s', invertida eh '%s', são Palindrome \n", str.toUpperCase(), reverterString.Reverter(str).toUpperCase() );
        }else{
            System.out.format("A palavra '%s', invertida eh '%s', não são Palindrome \n", str.toUpperCase(), reverterString.Reverter(str).toUpperCase() );
        }

    }

}


import java.util.Scanner;


public class IMCCalculo {
    public static void main(String[] args) {
        
        //objeto para entrada de dados
        Scanner in = new Scanner (System.in);
        
        //variaveis para o calculo
        double altura = 0;
        double peso = 0;
        
        //retorno calculo
        double imc = 0;

        //retrono da classificacao
        String classificacao= "";

        //entra com o peso
        System.out.println("Qual o seu peso: ");
        peso = in.nextDouble();

        //entra com sua altura
        System.out.println("Qual a sua altura: ");
        altura = in.nextDouble();

        //realizando o calculo
        imc = IMC.Calculo(peso, altura);
        

        //pega a classificacao
        classificacao = IMC.Classificacao(imc);

        System.out.format("O valor do seu IMC eh %.2f \n", imc);
        System.out.println("Sua Classificação de risco eh: "+ classificacao);

        in.close();

    }
}

// Desafio 2: Cálculo de IMC com Controle de Ponto Flutuante

// Crie um programa completo para calcular o Índice de Massa Corporal (IMC) de uma pessoa, tratando os dados com precisão:Solicite o peso da pessoa em quilogramas (double).Solicite a altura da pessoa em metros (double).Calcule o IMC usando a fórmula:
// IMC=(Altura×Altura)Peso​Imprima o resultado do IMC usando System.out.printf() para garantir que o valor seja exibido com apenas duas casas decimais.
// Foco: Combinação de leitura double, cálculo e o uso de printf para formatação precisa da saída no console.
// Saída Esperada (Exemplo):

// Digite seu peso em kg (ex: 75.5): 80
// Digite sua altura em metros (ex: 1.75): 1.80
// Seu IMC calculado é: 24.69

public class IMC {

    public static double Calculo(double peso, double altura){
        double retorno = 0;
        //calcula o IMC
        
        retorno = peso/(altura * altura);
        return  retorno;

    }

    public static String Classificacao (double imc){
        String retorno = "Normal";
        if (imc < 18.5){
            retorno = "Abixo do Peso Normal";
        } else {
            if (imc >= 25.0 && imc <=29.9){
                retorno = "Excesso de Peso";
            }else {
                if (imc >=30.0 && imc <= 34.9){
                    retorno = "Obesidade Classe I";
                }else{
                    if (imc >=35.0 && imc <= 39.9){
                         retorno = "Obesidade Classe II";
                    }else{
                        if (imc >=40.0 ){
                            retorno = "Obesidade Classe III";
                        }
                    }

                }
            }
        }
        return retorno;    
    }
    
}

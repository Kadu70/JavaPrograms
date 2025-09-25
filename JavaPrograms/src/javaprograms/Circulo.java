// package javaprograms;
//classe imutavel que  tem implementação de forma
public final class Circulo implements Forma {

    // atributo do circulo - raio
    private double raio;

    // construtor da classe
     public Circulo(double raio) {
        this.raio = raio;
    }

    //metodoS da classe forma reescrito
    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
   
}

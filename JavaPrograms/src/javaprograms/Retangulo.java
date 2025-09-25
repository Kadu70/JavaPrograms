//package javaprograms;
//classe implementado de Forma
public final class Retangulo implements Forma {
    //atributos do retangulo
    private final double largura;
    private final double altura;

    //construtor do retangulo
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }


    // metodos reescrito de forma
    @Override
    public double getArea() {
        return largura * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largura + altura);
    }
}

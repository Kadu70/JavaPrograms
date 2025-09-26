//casse filme
public class Filme {
    //lista de atributos
    private String titulo;
    //atribudo criado como enumerador
    private Genero genero;

    //contrutor que recebe uma String (titulo) e um Genero (genero)
    public Filme(String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    //metodo para pega os valores dos atribudo e retorna como uma string
    @Override
    public String toString() {
        return "Filme{" + "titulo='" + titulo + '\'' + ", genero=" + genero + '}'+ "\n";
    }
}


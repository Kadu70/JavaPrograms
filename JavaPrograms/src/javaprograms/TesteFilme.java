import java.util.ArrayList;
import java.util.List;

public class TesteFilme {
     public static void imprimirListaFilmes(List<? extends Filme> lista) {
        for (Filme filme : lista) {
            System.out.println(filme.toString());
        }
    }

    public static void main(String[] args) {
          // Usando a classe generica customizada
        Caixa<String> caixaString = new Caixa<>();
        caixaString.adicionar("Java para Iniciantes");
        System.out.println("Conteudo da caixa de String: " + caixaString.obter());

        Caixa<Integer> caixaInteger = new Caixa<>();
        caixaInteger.adicionar(123);
        System.out.println("Conteudo da caixa de Integer: " + caixaInteger.obter());

        // Exemplo com Wildcard
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("O Chamado", Genero.ACAO));
        filmes.add(new Filme("A Chegada", Genero.FICCAO_CIENTIFICA));

        //adicionando mais filmes
        filmes.add(new Filme("Debi & Loyde", Genero.COMEDIA));
        filmes.add(new Filme("Como Eu Era Antes de Voce", Genero.DRAMA));



        imprimirListaFilmes(filmes);

        //colocando na caixa objeto do tipo List com objetos filmes
        caixaString.adicionar(filmes.toString());
        System.out.println("Conteudo da caixa de String:\n " + caixaString.obter());


        // ao adicionar um objeto ou um dado primitivo ao objeto do tipo Caixa (generico), o mesmo é sobreposto ao anterior


    }

   
}

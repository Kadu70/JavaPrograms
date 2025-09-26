public class AulaGenerics {
    // Metodo generico com wildcard
    public static void imprimirListaFilmes(List<? extends Filme> lista) {
        System.out.println("Lista de Filmes:");
        for (Filme filme : lista) {
            System.out.println(filme);
        }
    }

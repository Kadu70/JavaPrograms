public class ProdutoTeste {
    public static void main(String[] args) {
        System.out.println("Teste de Produto");
        Produto p = new Produto("Caneta", 2.5, 123);
        System.out.println(p);
        System.out.println("Nome: " + p.getNome());
        System.out.println("Preço: " + p.getPreco());
        System.out.println("Código: " + p.getCodigo());

        


    }
}
public class Caixa<T> {
    //criando um obheto generico
    private T item;


    //adicionando um objeto generico
    public void adicionar(T item) {
        this.item = item;
    }
 //carregando um objeto generico
    public T obter() {
        return this.item;
    }
}

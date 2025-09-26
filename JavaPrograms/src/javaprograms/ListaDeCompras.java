/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */

//1 craindo a classe Lista de compras
public class ListaDeCompras {
  //2 crianto atrobuto de array String  com tamanho de 5
    private final int i = 5;
    private String[] itens = new String[i] ;
    
    
   //criando construtor
    public ListaDeCompras() {
        //carrega em cada possição do array itens o valor 'nulo'
        for (int i =0;i< this.i; i++){
            itens[i]="Nulo";
        }
    }
    
        
  //3 não tem metodos getters e nem setters
    
  //4 - criando metodos publicos
// adicionarItem(String item, int indice): Adiciona um item no índice especificado.
// Valide o índice para evitar ArrayIndexOutOfBoundsException.
    
   public void adicionarItem(String item, int indice){
       //verificando o valor do indice (0<=indice<5)
       if (this.validaIndice(indice))
            this.itens[indice]= item;
          else
           System.out.println("Indice Incoreto, favor digitar valores "
                            + "positivos (>=0) e nemor que :" + this.i);
   } 
    
   private boolean validaIndice(int i){
       boolean retorno = true;
        if (!((i>=0)&&(i <5)))
           retorno = false;
        return retorno;
   }
//obterItem(int indice): Retorna o item no índice especificado, com validação de índice.
   
public String obterItem(int indice){
    String retorno = "nulo"; 
    if (this.validaIndice(indice))
        retorno = (this.itens[indice]);
    else
        System.out.println("positivos (>=0) e menor que :"
                            + "Indice Incoreto, favor digitar valores " + this.i);
    return  retorno;  
}



//imprimirLista(): Itera sobre o array e imprime todos os itens.
public void imprimirLista(){
    //chama um metodos para carregar a lista
    System.out.println ("Itens da Lista\n" + this.CarregaLista());
}

//carrega todos os itens da lista
public String CarregaLista(){
    //declara uma variavel para retorno, do mesmo tipo do metodo
    //cujo o valor inicial é o primeiro item da lista
    String retorno = this.itens[0] + "\n"; //\n pula uma linha
    //percore a lista até o final
    for (int i =1; i< this.i; i++){
        //adiciona a variavel tetorno os valores de cada item da lista
        //sendo um por vez
        retorno+= this.itens[i] + "\n";
    }
    //retorna para quem chamou o metodo o valor da varivel retorno
    return retorno;
}
    
    
}

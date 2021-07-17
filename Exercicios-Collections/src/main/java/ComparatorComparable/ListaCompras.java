package ComparatorComparable;

public class ListaCompras implements Comparable<ListaCompras> {

    private final String produto;
    private final Integer quantidade;

    public ListaCompras(String produto, Integer quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public String getProduto(){
        return produto;
    }
    public Integer getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString(){
        return produto + " - " + quantidade;
    }

    @Override
    public int compareTo(ListaCompras o){
        return this.getQuantidade() - o.getQuantidade();
    }

}

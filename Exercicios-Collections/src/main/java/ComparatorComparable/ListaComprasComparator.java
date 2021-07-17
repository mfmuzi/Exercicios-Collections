package ComparatorComparable;

import java.util.Comparator;

public class ListaComprasComparator implements Comparator<ListaCompras> {

    @Override
    public int compare (ListaCompras o1, ListaCompras o2){
        return o2.getQuantidade() - o1.getQuantidade();
    }
}

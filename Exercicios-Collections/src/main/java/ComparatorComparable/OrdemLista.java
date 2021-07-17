package ComparatorComparable;

// Crie uma lista de um objeto complexo e execute as seguintes operações:

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdemLista {

    public static void main(String[] args){

        List<ListaCompras> listaCompras = new ArrayList<>();

//        Adicione elementos nessa lista
        listaCompras.add(new ListaCompras("Cebola", 10));
        listaCompras.add(new ListaCompras("Batata", 6));
        listaCompras.add(new ListaCompras("Tomate", 4));
        listaCompras.add(new ListaCompras("Cenoura", 4));
        listaCompras.add(new ListaCompras("Abobrinha", 2));
        listaCompras.add(new ListaCompras("Banana", 8));
        listaCompras.add(new ListaCompras("Maracujá", 1));
        listaCompras.add(new ListaCompras("Vagem", 20));
        listaCompras.add(new ListaCompras("Pimentão", 3));

        System.out.println(listaCompras);

//        Ordene implementando a interface java.util.Comparator no seu objeto complexo.
        System.out.println("\n" +"Interface Comparator");

        listaCompras.sort(Comparator.comparingInt(ListaCompras::getQuantidade));
        System.out.println("De menor para maior quantidade");
        System.out.println(listaCompras);

        listaCompras.sort(Comparator.comparingInt(ListaCompras::getQuantidade).reversed());
        System.out.println("De maior para menor quantidade");
        System.out.println(listaCompras);

//        Ordene implementando um novo objeto com a interface java.util.Comparable.
        System.out.println("\n" +"Usando Comparable");
        Collections.sort(listaCompras);

        System.out.println("De menor para maior quantiadde");
        System.out.println(listaCompras);

//        Ordene usando uma expressão lambda na chamada de sua Lista.sort().
        System.out.println("\n" +"Usando List");
        listaCompras.sort((first, second) -> first.getQuantidade() - second.getQuantidade());
        System.out.println("De menor para maior quantiadde");
        System.out.println(listaCompras);

        listaCompras.sort((first,second) -> second.getQuantidade() - first.getQuantidade());
        System.out.println("De maior para menor quantidade");
        System.out.println(listaCompras);

//        Ordene usando referências de métodos e os métodos estáticos de Comparator.
        System.out.println("\n" +"Usando Comparator");
        Collections.sort(listaCompras, new ListaComprasComparator());

        System.out.println("De maior para menor quantiadde");
        System.out.println(listaCompras);

    }
}

import java.util.LinkedList;
import java.util.Queue;

//Crie uma fila e execute as seguintes operações:

public class FilaNomes {

    public static void main(String[] args) {

        Queue<String> nomes = new LinkedList<>();

//     Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

//     Navegue na fila exibindo cada nome no console.
        System.out.println(nomes);


        for (String lista : nomes) {
            System.out.println(lista);}

//      Retorne o primeiro item da fila, sem removê-lo.
            System.out.println(nomes.peek());
            System.out.println(nomes);

//      Retorne o primeiro item da fila, removendo-o.
            System.out.println(nomes.poll());
            System.out.println(nomes);

//      Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila.
            nomes.add("Daniel");
            System.out.println(nomes);

//      Retorne o tamanho da fila.
            System.out.println(nomes.size());

//      Verifique se a fila esta vazia
            boolean vazio = nomes.isEmpty();
            System.out.println(vazio);

//      Verifique se o nome Carlos está na fila.
            System.out.println(nomes.contains("Carlos"));

        }

}

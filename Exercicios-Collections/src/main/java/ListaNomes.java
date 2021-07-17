import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Crie um lista e execute as seguintes operações:


public class ListaNomes {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        {
//        Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
            nomes.add("Juliana");
            nomes.add("Pedro");
            nomes.add("Carlos");
            nomes.add("Larissa");
            nomes.add("João");

//        Navegue na lista exibindo cada nome no console.
            System.out.println(nomes);

//        Substitua o nome Carlos por Roberto.
            nomes.set(2, "Roberto");
            System.out.println(nomes);

//        Retorne o nome da posição 1.
            String posicao = nomes.get(1);
            System.out.println(posicao);

//        Retorne o nome da posição 4.
            String position = nomes.get(4);
            System.out.println(position);

//        Remova o nome João.
            nomes.remove("João");
            System.out.println(nomes);

//        Retorne a quantidade de itens na lista.
            System.out.println(nomes.size());

//        Verifique se o nome Juliano existe na lista.
            boolean juliano = nomes.contains("Juliano");
            System.out.println(juliano);

//        Crie uma nova lista com os nomes: Ismael e Rodrigo.
            List<String> novosNomes = new ArrayList<>();

                novosNomes.add ("Ismael");
                novosNomes.add ("Rodrigo");

            System.out.println(nomes);
            System.out.println(novosNomes);

//        Adicione todos os itens da nova lista na primeira lista criada.
            for(String novaLista: novosNomes){
                nomes.add(novaLista);
            }

            System.out.println(nomes);

//        Ordene os itens da lista por ordem alfabética
            Collections.sort (nomes);
            System.out.println(nomes);

//        Verifique se a lista esta vazia.
            System.out.println(nomes.isEmpty());
        }
    }
}

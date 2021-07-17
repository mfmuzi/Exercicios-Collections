package SetNumeros;

// Crie um Set e execute as seguintes operações:

import java.util.TreeSet;

public class TreeSetNumeros {

    public static void main(String[] args){

        TreeSet<Integer> numeros = new TreeSet<>();

//        Adicione 5 números inteiros: 3, 88, 10, 44, 5.
        numeros.add (3);
        numeros.add (88);
        numeros.add(10);
        numeros.add(44);
        numeros.add(5);

//        Navegue no Set exibindo cada número no console.
        System.out.println(numeros);

        for(Integer numero: numeros){
            System.out.println(numero);
        }

//        Remova o primeiro item do Set.
        System.out.println(numeros.pollFirst());
        System.out.println(numeros);

//        Adicione um novo número no Set: 23.
        numeros.add(23);
        System.out.println(numeros);

//        Verifique o tamanho do Set.
        System.out.println(numeros.size());

//        Verifique se o Set está vazio.
        System.out.println(numeros.isEmpty());
    }
}

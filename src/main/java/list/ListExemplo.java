package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExemplo {

    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissinha"); //atualiza por index um elemento
        System.out.println(nomes);

        Collections.sort(nomes); //Uso de Collections para ordernar o array de forma lexicográfica
        System.out.println("Sorted Result: " + nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("João");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        int pos = nomes.indexOf("Carlos");
        System.out.println("Indice de Carlos: " + pos);

        int tamanho = nomes.size();
        System.out.println("Tamanho da Lista: " + tamanho);

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println("Lista tem Anderson? " + temAnderson);
        boolean temFernando = nomes.contains("Fernando");
        System.out.println("Lista tem Fernando? " + temFernando);

        boolean listaVazia = nomes.isEmpty();
        System.out.println("Lista Vazia: " + listaVazia);

        System.out.println("Percorrendo a Lista via elemento:");
        for(String nomeDoItem: nomes){ //Percorrer lista por elementos
            System.out.println("----->" + nomeDoItem);
        }

        Iterator<String> iterator =  nomes.iterator(); //criando iterador para percorrer o array
        System.out.println("Percorrendo Array por iterador:");

        while (iterator.hasNext()){
            System.out.println("-->" + iterator.next());
        }

        nomes.clear();
        listaVazia = nomes.isEmpty();
        System.out.println("Lista Vazia: " + listaVazia);

    }
}

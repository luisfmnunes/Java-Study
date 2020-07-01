package list;

/*
    Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
    Navegue na lista exibindo cada nome no console.
    Substitua o nome Carlos por Roberto.
    Retorne o nome da posição 1.
    Remova o nome da posição 4.
    Remova o nome João
    Retorne a quantidade de itens na lista.
    Verifique se o nome Juliano existe na lista.
    Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira lista criada.
    Ordene os itens da lista por ordem alfabética.
    Verifique se a lista esta vazia.
 */

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Exercicio {

    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();
        List<String> novosNomes = new ArrayList<>();

        //Adicionar os nomes
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Imprimir os nomes percorrendo o Array
        for (String nome: nomes){
            System.out.println("--> " + nome );
        }

        //Substituir o nome Carlos por Roberto (feito de maneira segura sem criar bloco protegido com try/catch).
        if(nomes.contains("Carlos")) {
            nomes.set(nomes.indexOf("Carlos"),"Roberto");
        }

        //Retornar o nome da posição 1
        System.out.println(nomes.get(1));

        //Remover o nome da Posição 4
        if(nomes.size() <= 5) {
            nomes.remove(4);
        }

        //Remova o nome João
        if(nomes.contains("João")) {
            nomes.remove("João");
        } else {
            System.out.println("Não há João na Lista");
        }

        //Retorne a quantidade de items na lista
        System.out.println("Nomes na Lista: " + nomes.size());

        //Verifique se o nome Juliano existe na lista
        if(nomes.contains("Juliano")) {
            System.out.println("Lista Contém Juliano.");
        } else {
            System.out.println("Lista não Contém Juliano.");
        }

        //Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira lista criada.
        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");

        nomes.addAll(novosNomes);
        System.out.println(nomes);

        //Ordene os itens da lista por ordem alfabética.
        Collections.sort(nomes);
        System.out.println("Lista Ordenada: " + nomes);

        //Verifique se a lista esta vazia.
        System.out.println("Lista Está Vazia: " + nomes.isEmpty());

    }
}

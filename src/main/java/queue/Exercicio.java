package queue;

/*
    Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
    Navegue na fila exibindo cada nome no console.
    Retorne o primeiro item da fila, sem removê-lo.
    Retorne o primeiro item da fila, removendo o mesmo.
    Adiciona um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila.
    Retorne o tamanho da lista.
    Verifique se a lista está vazia
    Verifique se o nome Carlos está na lista.
 */

import java.util.Queue;
import java.util.LinkedList;

public class Exercicio {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        //Navegue na fila exibindo cada nome no console.
        for(String cliente: fila){
            System.out.println("--> " + cliente);
        }

        //Retorne o primeiro item da fila, sem removê-lo.
        System.out.println("Verificar o primeiro elemento da fila sem removê-lo:");
        System.out.println(fila.peek());
        System.out.println(fila);

        //Retorne o primeiro item da fila, removendo o mesmo.
        System.out.println("Verificar o primeiro elemento da fila removendo-o");
        System.out.println(fila.poll());
        System.out.println(fila);

        //Adiciona um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila.
        fila.add("Daniel");
        System.out.println(fila);

        //Retorne o tamanho da lista.
        System.out.println("Clientes na Fila: " + fila.size());

        //Verifique se a lista está vazia
        System.out.println("Fila está Vazia? " + fila.isEmpty());

        //Verifique se o nome Carlos está na lista.
        System.out.println("Carlos está na fila? " + fila.contains("Carlos"));
    }
}

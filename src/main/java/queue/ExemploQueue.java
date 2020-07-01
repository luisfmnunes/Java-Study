package queue;

//Implementação via LinkedList

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek(); //Não lança exceção caso esteja vazia, retorna null
        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        //filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        for(String cliente: filaBanco){
            System.out.println("--> "+cliente);
        }

        //Percorrendo a Fila por iterator
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while( iteratorFilaBanco.hasNext() ) {
            System.out.println("---> " + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

    }
}

package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio {

    public static void main(String[] args) {

        Set<Integer> conjunto = new HashSet<>();

        //Adicione 5 números inteiros: 3, 88, 20, 44, 3
        conjunto.add(3);
        conjunto.add(88);
        conjunto.add(20);
        conjunto.add(44);
        conjunto.add(3); //duplicado, será ignorado

        System.out.println(conjunto);

        //Navegue no Set exibindo cada número no console.
        for(Integer numero: conjunto) {
            System.out.println(numero);
        }

        //Remova o primeiro item do Set.
        Iterator<Integer> iterator = conjunto.iterator();

        conjunto.remove(iterator.next());

        System.out.println(conjunto);

        //Adicione um novo número no Set: 23

        conjunto.add(23);

        //Verifique o tamanho do Set.

        System.out.println("Tamanho: "+ conjunto.size());

        //Verifique se o Set está vazio:

        System.out.println("Vazio? "+ conjunto.isEmpty());
    }
}

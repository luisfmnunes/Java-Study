package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args){

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>(); //Mantem a ordem de inserção - Menos performática que a HashSet por isso

        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(110);
        sequenciaNumerica.add(23);
        sequenciaNumerica.add(1);

        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(8);

        System.out.println(sequenciaNumerica);

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println("iterator --> " + iterator.next());
        }

        for(Integer numero: sequenciaNumerica){
            System.out.println("For Each --> " + numero);
        }

    }
}

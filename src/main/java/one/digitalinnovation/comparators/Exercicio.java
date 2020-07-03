package one.digitalinnovation.comparators;


import java.util.*;

public class Exercicio {

    public static void main(String[] args) {

        List<Personagem> personagens = new ArrayList<>();

        //Adicione elementos nesta lista.
        personagens.add(new Personagem("Osamodas",18));
        personagens.add(new Personagem("Xelor", 200));
        personagens.add(new Personagem("Zorbal",23));
        personagens.add(new Personagem("Enutrof", 60));
        personagens.add(new Personagem("Ecaflip", 35));

        TreeSet<Personagem> treeSet = new TreeSet<>(personagens);

        //Ordene implementando a interface java.util.Comparator no seu objeto complexo.
        personagens.sort(new PersonagemOrdemLevelReverso());

        System.out.println("--- ordem reversa de Level usando objeto Comparator ---");
        System.out.println(personagens);

        //Ordene implementando um novo objeto com a interface java.util.Comparable
        Collections.sort(personagens); //metodo compareTo implementado na própria classe

        System.out.println("--- ordem natural de Level usando interface Comparable ---");
        System.out.println(personagens);

        //Ordene usando uma expressão lambda na chamada de suaLista.sort()
        personagens.sort((first,second) -> second.getLevel() - first.getLevel());

        System.out.println("--- ordem reversa de Level usando função lambda ---");
        System.out.println(personagens);

        //Ordene usando referências de métodos e o métodos estátisticos de Comparator
        personagens.sort(Comparator.comparingInt(Personagem::getLevel));

        System.out.println("--- ordem natural de Level usando método comparingInt de Comparator ---");
        System.out.println(personagens);

        //Ordene coleções TreeSet e TreeMap.
        System.out.println(treeSet);

    }
}

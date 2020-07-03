package one.digitalinnovation.comparators;

import java.util.Comparator;

public class PersonagemOrdemLevelReverso implements Comparator<Personagem> {
    @Override
    public int compare(Personagem o1, Personagem o2) {
        return o2.getLevel() - o1.getLevel();
    }
}

package one.digitalinnovation.comparators;

public class Personagem implements Comparable<Personagem> {

    private final String classe;
    private Integer level;

    public Personagem(String classe, Integer level) {
        this.classe = classe;
        this.level = level;
    }

    public String getClasse() { return classe; }

    public Integer getLevel() { return level; }

    @Override
    public String toString() {
        return (this.getClasse() + " - " + this.getLevel());
    }

    @Override
    public int compareTo(Personagem personagem) {
        return this.getLevel() - personagem.getLevel();
    }
}

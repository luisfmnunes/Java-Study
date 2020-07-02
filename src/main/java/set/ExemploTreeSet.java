package set;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static Integer getTreeHeight( TreeSet<String> tree){
        return (int) (Math.log10(tree.size())/Math.log10(2)) + 1;
    }

    public static void printTree( TreeSet<String> tree) {
        String tab = "--";
        int index = 0;
        boolean backward = false;

        while(index != tree.size()/2){
            int distance = Math.abs(index-tree.size()/2);
            while(distance >= 0) {
                distance -= 2;
                System.out.print(tab);
            }

            System.out.println(tree.toArray()[index]);

            index += backward ? (tree.size()/2-2 == 0 ? 1 : -(tree.size()/2-2)) : tree.size()/2-1;
            backward = !backward;
        }

        System.out.println(tree.toArray()[tree.size()/2]);

        index = tree.size()/2 + tree.size()/2-1;

        while(index != tree.size()){
            int distance = index - tree.size()/2;
            while(distance >= 0) {
                distance -= 2;
                System.out.print(tab);
            }

            System.out.println(tree.toArray()[index]);
            if(index == tree.size()-1) break;

            index += backward ? (tree.size()/2-2 == 0 ? 1 : -(tree.size()/2-2)) : tree.size()/2-1;
            backward = !backward;


        }
    }

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();
        TreeSet<String> treeMaiusculas = new TreeSet<>();

        Integer treeHeight;

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        treeCapitais.add("Brasília");

        System.out.println(treeCapitais);

        //Retorna o primeiro elemento
        System.out.println(treeCapitais.first());

        //Retorna o último elemento
        System.out.println(treeCapitais.last());

        //Retorna as folhas do parâmetro
        System.out.println(treeCapitais.lower("Florianópolis"));

        //Retorna o nó pais do parâmetro
        System.out.println(treeCapitais.higher("Florianópolis"));

        //Retorna o primeiro elemento e o remove da árvore
        //System.out.println(treeCapitais.pollFirst());

        //Retorna o último elemento e o remove da árvore
        //System.out.println(treeCapitais.pollLast());

        for(String cidade: treeCapitais){
            System.out.println("ForEach --> " + cidade);
        }

        treeHeight = getTreeHeight(treeCapitais);
        System.out.println("Tree Height = " + treeHeight);

        for(String cidade: treeCapitais) {
            treeMaiusculas.add(cidade.replaceAll("[^A-Z]", ""));
        }

        System.out.println(treeMaiusculas);

        printTree(treeMaiusculas);

    }
}

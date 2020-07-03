package map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args){

        TreeMap<String,String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS","Porto Alegre");
        treeCapitais.put("SC","Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");
        treeCapitais.put("DF", "Brasília");

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.firstKey());

        System.out.println(treeCapitais.lastKey());

        System.out.println(treeCapitais.lowerKey("SC"));
        System.out.println(treeCapitais.higherKey("SC"));
        System.out.println(treeCapitais.lowerKey("DF"));

        System.out.println(treeCapitais.firstEntry().getKey() + " -> " + treeCapitais.firstEntry().getValue());
        System.out.println(treeCapitais.lastEntry().getKey() + " -> " + treeCapitais.lastEntry().getValue());
        System.out.println(treeCapitais.higherEntry("SC").getKey() + " -> " + treeCapitais.higherEntry("SC").getValue());
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + " -> " + treeCapitais.lowerEntry("SC").getValue());
        //treeCapitais.lowerEntry("DF").getKey() -> gera erro pois null não tem .getKey()

        Map.Entry<String,String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String,String> lastEntry = treeCapitais.pollLastEntry();

        System.out.println(treeCapitais);
        System.out.println(firstEntry);
        System.out.println(lastEntry);

        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while(iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("Iterator: " + key + " -> " + treeCapitais.get(key));
        }

        for (String capital: treeCapitais.keySet()){
            System.out.println("ForEach KeySet: " + capital + " -> " + treeCapitais.get(capital));
        }

        for(Map.Entry<String,String> capital: treeCapitais.entrySet()){
            System.out.println("ForEach EntrySet: " + capital.getKey() + " -> " + capital.getValue());
        }

    }
}

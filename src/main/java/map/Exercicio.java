package map;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {

    public static void main(String[] args) {

        HashMap<String,String> estados = new HashMap<>();

        //Adicione os 26 estados Brasileiros no map, onde a sigla será a chave e o nome do estado o valor.
        estados.put("AC","Acre");
        estados.put("AL","Alagoas");
        estados.put("AP","Amapá");
        estados.put("AM","Amazonas");
        estados.put("BA","Bahia");
        estados.put("CE","Ceará");
        estados.put("ES","Espírito Santo");
        estados.put("GO","Goiás");
        estados.put("MA","Maranhão");
        estados.put("MT","Mato Grosso");
        estados.put("MS","Mato Grosso do Sul");
        estados.put("MG","Minas Gerais");
        estados.put("PA","Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR","Paraná");
        estados.put("PE","Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ","Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS","Rio Grande do Sul");
        estados.put("RO","Rondônia");
        estados.put("RR","Roraima");
        estados.put("SC","Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");

        System.out.println(estados);
        //Remove o estado de Minas Gerais.
        estados.remove("MG");
        System.out.println(estados);

        //Adicione o Distrito Federal
        estados.put("DF","Distrito Federal");
        System.out.println(estados);

        //Verifique o tamnho do mapa.
        System.out.println("Tamanho: " + estados.size());

        //Remova o estado de Mato Grosso do Sul usando o nome.
        for(Map.Entry<String,String> estado: estados.entrySet()) {
            if(estado.getValue().equals( "Mato Grosso do Sul" )) {
                estados.remove(estado.getKey());
                break;
            }
        }
        System.out.println(estados);

        //Navegue em todos os registros do map, mostrando no console o seguinte formato: NOME (SIGLA)
        for(Map.Entry<String,String> estado: estados.entrySet()) {
            System.out.println(estado.getValue() + " (" + estado.getKey() + ")");
        }

        //Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC)
        System.out.println("Existe Santa Catarina no Mapa? " + estados.containsKey("SC"));

        //Verifique se o estado de Maranhão existe no map buscando por seu nome.
        System.out.println("Existe Maranhão no Mapa? " + estados.containsValue("Maranhão"));
    }
}

package datas;

import java.time.LocalDateTime;

public class Exemplo0004 {

    public static void main(String[] args){
        LocalDateTime hoje = LocalDateTime.now();

        LocalDateTime ontem = hoje.minusDays(1);

        LocalDateTime ontem23horas = hoje.plusHours(1);

        System.out.println(hoje);
        System.out.println("ontem: " + ontem);
        System.out.println("ontem 23 horas atras: " + ontem23horas);
    }
}

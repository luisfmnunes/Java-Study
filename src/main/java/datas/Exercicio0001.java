package datas;

import java.util.Date;

public class Exercicio0001 {
    public static void main(String[] args) {
        Date novaData = new Date(776401200000L);
        Date quinzeMaio2010 = new Date(1273892400000L);

        System.out.println("09/08/1994 é anterior a 15/05/2010: " + novaData.before(quinzeMaio2010));
        System.out.println("09/08/1994 é posterior a 15/05/2010: " + novaData.after(quinzeMaio2010));
    }
}

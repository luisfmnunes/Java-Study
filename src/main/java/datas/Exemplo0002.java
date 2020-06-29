package datas;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo0002 {

    public static void main(String[] args){
        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);

        System.out.println(dateToStr);
        // dd/mm/yy hh:mm

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);

        System.out.println(dateToStr);
        // DIA(ddd) de MES(mmm) de ANO(yyyy) hh:mm

    }
}

package datas;

//Converta a Data atual no formato DD/MM/YYYY HH:MM:SS:MMM

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Locale;

public class Exercicio0003 {

    public static final Date agora = new Date();

    public static String formatData(Date data){
        DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.FULL,Locale.UK);
        return formatter.format(data);
    }

    public static String simpleFormat(Date data){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        return formatter.format(data);
    }

    public static void main(String[] args){

        System.out.println("Simple Date Format: " + simpleFormat(agora));
        System.out.println("Date Format: " + formatData(agora));
    }
}

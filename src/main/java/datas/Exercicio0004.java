package datas;

//Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio0004 {

    public static final String date = "15/05/2010 10:00:00";

    public static LocalDateTime parseLocalDateTime(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return LocalDateTime.parse(date,formatter);
    }

    public static LocalDateTime addTime(
        LocalDateTime date,
        Integer year,
        Integer month,
        Integer day,
        Integer hour,
        Integer minute,
        Integer second) {

        year = year != null ? year : 0;
        month = month != null ? month : 0;
        day = day != null ? day : 0;
        hour = hour != null ? hour : 0;
        minute = minute != null ? minute : 0;
        second = second != null ? second : 0;

        return date.plusYears(year)
        .plusMonths(month)
        .plusDays(day)
        .plusHours(hour)
        .plusMinutes(minute)
        .plusSeconds(second);
    }

    public static void main(String[] args){
        LocalDateTime dataExercicio = parseLocalDateTime(date);
        System.out.println("Data Inicial: " + dataExercicio);

        LocalDateTime dataFinal = addTime(dataExercicio, 4,6,0,13,0 ,0);
        System.out.println("Data Final: " + dataFinal);
    }
}

package datas;

import java.util.Calendar;
import java.util.Date;

public class DataCalendario {
    public static void main(String[] args) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = (Calendar) Calendar.getInstance();
        Calendar calendar3 = (Calendar) Calendar.getInstance();

        Date calendario1 = Calendar.getInstance().getTime();

        System.out.println("Calendário 1 antes: " + calendar1.getTime());
        System.out.println("Calendário 2 antes: " + calendar2.getTime());
        System.out.println("Calendário 3 antes: " + calendar3.getTime());
        System.out.println("Calendário 4: " + calendario1);
        System.out.println("--------------------------------------------");

        calendar1.add(Calendar.MONTH, 2);
        calendar2.add(Calendar.YEAR, 5);
        calendar3.add(Calendar.DAY_OF_MONTH, 10);

        System.out.println("Calendário 1 depois: " + calendar1.getTime());
        System.out.println("Calendário 2 depois: " + calendar2.getTime());
        System.out.println("Calendário 3 depois: " + calendar3.getTime());


    }
}

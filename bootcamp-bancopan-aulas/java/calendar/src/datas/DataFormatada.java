package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFormatada {
    public static void main(String[] args) {
        //Calendar calendar = Calendar.getInstance();
        //Date data = calendar.getTime();
        Date date = Calendar.getInstance().getTime();

        //System.out.println(System.currentTimeMillis());

        DateFormat format = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data Brasileira: " + format.format(date));

        format = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Data sem o dia descrito: " + format.format(date));

        format = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data média 1: " + format.format(date));

        format = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data curta 2: " + format.format(date));

        SimpleDateFormat datinha = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data Formatada " + datinha.format(date));
    }
}
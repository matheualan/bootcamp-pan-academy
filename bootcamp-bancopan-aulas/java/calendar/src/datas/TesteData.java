package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteData {

    public static void main(String[] args) {
        Date dataAtualizada = Calendar.getInstance().getTime();
        DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dataFormatada.format(dataAtualizada));

        Date dataAtual = Calendar.getInstance().getTime();
        SimpleDateFormat formatador = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
        String formattedDate = formatador.format(dataAtual);
        System.out.println(formattedDate);
    }
}

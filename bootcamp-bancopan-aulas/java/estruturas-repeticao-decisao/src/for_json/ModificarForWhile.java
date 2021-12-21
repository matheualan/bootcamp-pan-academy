package for_json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificarForWhile {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + " ,");
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Conseguie a " + (i+1) + " vez!!! Uhuuulll!!!");
        }

        String[] cars = {"Gol", "Palio", "Uno"};
        for (String i : cars) {
            System.out.println(i);
        }

        String example = "2021.10.10";
        Pattern pattern = Pattern.compile("((\\d{4})[.](\\d{2})[.](\\d{2}))");
        Matcher matcher = pattern.matcher(example);

        while (matcher.find()) {
            System.out.println("while 1: " + matcher.group());
        }

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("hello1234goodboy789very2345");
        while (m.find()) {
            System.out.println("while 2: " + m.group());
        }


        String text = "John speak  and John writes about that,\"\n" +
                "\t\t\t\t+ \" and John think 2021.10.10 about everything.";
        String nome = "(John)";
        Pattern patternNome = Pattern.compile(nome);
        Matcher matcherNome = patternNome.matcher(text);

        while (matcherNome.find()) {
            System.out.println("Found: " + matcherNome.group());
        }

    }

}

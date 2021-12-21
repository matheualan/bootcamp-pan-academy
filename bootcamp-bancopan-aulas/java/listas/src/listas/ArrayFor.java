package listas;

import java.util.ArrayList;

public class ArrayFor {
    public static void main(String[] args) {

        ArrayList<String> pessoas = new ArrayList<>();
        //List<String> pessoas2 = new ArrayList();

        pessoas.add("Luiza");
        pessoas.add("Gabriel");
        pessoas.add("Marcio");

        System.out.println("--------------- TODAS PESSOAS ---------------");
        for (String pessoinha : pessoas) {
            System.out.printf("Posição: %s\n", pessoinha);
        }

        System.out.println("--------------- COMEÇA COM 'L' ---------------");
        for (String pessoinha : pessoas) {
            if (pessoinha.charAt(0) == 'L') {
                System.out.printf("Posição: %s\n", pessoinha);
            }
        }

        System.out.println("--------------- PESSOAS e INDICES ---------------");
        System.out.println("Indo de um por um");
        int i = 0;
        for (String pessoinha : pessoas) {
            System.out.printf("Posição %d - %s\n", i, pessoinha);
            i++;
        }
    }
}

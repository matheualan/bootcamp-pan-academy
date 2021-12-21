package pilhas;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        //HashSet não imprime dados duplicados
        HashSet<String> cars = new HashSet<String>();
        cars.add("Gold");
        cars.add("Fox");
        cars.add("Gol");
        cars.add("BMW");
        cars.add("Eco");
        //HashSet mais rapido mais sem ordem
        //treeset ordena

        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println();

        for (String i : cars) {
            if (i.contains("o")) {
                System.out.println(i);
            }
        }
    }
}

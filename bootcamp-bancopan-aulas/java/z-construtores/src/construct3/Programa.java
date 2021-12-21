package construct3;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        //product.setName(sc.nextLine());

        System.out.println("Price: ");
        //product.setPrice(sc.nextDouble());

        if(sc.hasNextInt()) { //enquanto tiver proximo variavel faça...
            Product product = new Product();
            System.out.println();
            System.out.println("Product info: " + product);
        } else {
            Product product = new Product();
            System.out.println();
            System.out.println("Product data: " + product);
        }
    }

}

package construct;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //decidindo se vai usar . ou ,
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Whats name of product? ");
        product.name = sc.nextLine();

        System.out.println("Whats price of product? ");
        product.price = sc.nextDouble();

        if(sc.hasNextInt()) { //enquanto tiver proximo variavel faça...
            System.out.println("Quantity in inventory: ");
            product.quantity = sc.nextInt();
            System.out.println();
            System.out.println("Product info: " + product);
        } else {
            System.out.println();
            System.out.println("Product data: " + product);
        }
    }

}

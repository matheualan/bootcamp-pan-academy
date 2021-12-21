package construct2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Name: ");
        product.setName(sc.nextLine());

        System.out.println("Price: ");
        product.setPrice(sc.nextDouble());

        System.out.println("Quantity in inventory: ");
        product.setQuantity(sc.nextInt());

        sc.close();
    }

}

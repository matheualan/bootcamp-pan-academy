package entradas;

import java.util.Scanner;

public class LerScanner {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        System.out.print("Agora sua idade: ");
        int idade = Integer.parseInt(myObj.nextLine());
        System.out.println("Idade: " + idade);
    }
}

package entradas;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFile {

    public static void main(String[] args) throws IOException {
        String path = "./src/entradas/arquivo.txt";
        File arquivo = new File(path);
        Scanner sc = new Scanner(arquivo);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}

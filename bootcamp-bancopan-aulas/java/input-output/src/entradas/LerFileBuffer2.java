package entradas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerFileBuffer2 {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("./src/entradas/arquivo.txt");
        BufferedReader bufferedReader = new BufferedReader(in);
        String text = bufferedReader.readLine();
        while(text != null) {
            System.out.println(text);
            text = bufferedReader.readLine();
        }
        in.close();
    }
}
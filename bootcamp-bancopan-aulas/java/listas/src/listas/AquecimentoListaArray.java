package listas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class AquecimentoListaArray {
    public static void main(String[] args) {

        HashMap<String, String> hashMapinho = new HashMap<>();
        hashMapinho.put("procuro", "fui achado hash"); //.put adiciona
        hashMapinho.put("procuro2", "fui achado hash 2");

        String value = hashMapinho.get("procuro"); //pega pela chave
        System.out.println(value);

//      ------------------------------------------------------------

        ArrayList<String> lista = new ArrayList<>();
        lista.add("topico 1 da lista me achou");
        lista.add("topico 2 da lista me achou");

        String str1 = lista.get(0);//pega pela posição na array
        System.out.println(str1);
    }
}
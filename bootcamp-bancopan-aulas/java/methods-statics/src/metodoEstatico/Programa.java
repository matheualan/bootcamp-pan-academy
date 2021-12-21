package metodoEstatico;

public class Programa {

    public static void main(String[] args) {

        Produto produto = new Produto();

        System.out.println(Produto.resultado(10, 50));
        System.out.println(produto.mudeNomeProduto("João"));
        System.out.println(Produto.pegarCpf("    999-222-111-00"));
    }
}

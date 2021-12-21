package metodoEstatico;

public class Produto {

    //Ñ precisa inicilizar, vantagem: Não precisa instanciar quando usar
    public static int resultado(int arroz, int feijao) {
        return (arroz + feijao);
    }

    public String mudeNomeProduto(String nomeProd) {
        return (nomeProd);
    }

    public static String pegarCpf(String cpf) {
        String tratei = cpf.strip();
        return tratei;
    }
}

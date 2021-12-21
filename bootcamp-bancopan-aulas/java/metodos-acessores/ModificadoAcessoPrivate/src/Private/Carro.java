package Private;

public class Carro {
    private String nome;
    private void exibeVelocidade() {
        System.out.println("A velocidade de uma " + nome + " é de 280km");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

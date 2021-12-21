package heranca.animal;

public abstract class Animal {
    private String raca;
    private double peso;

    public void dormir() {
        System.out.println("ZzZzZZzzzz...");
    }

    public void comer() {
        System.out.println("mmmmmmmmmmmmm...");
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}

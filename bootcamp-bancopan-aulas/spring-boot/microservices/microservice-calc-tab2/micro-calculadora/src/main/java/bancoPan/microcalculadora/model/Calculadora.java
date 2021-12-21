package bancoPan.microcalculadora.model;

public class Calculadora {

    private String pessoas;
    private Double precoPorDia;
    private Integer dias;

    //construtores
    public Calculadora() {
    }

    public Calculadora(String pessoas, Double precoPorDia, Integer dias) {
        this.pessoas = pessoas;
        this.precoPorDia = precoPorDia;
        this.dias = dias;
    }

    //método criado
    public double getTotal() {
        return dias * precoPorDia;
    }

    //getters e setters
    public String getPessoas() {
        return pessoas;
    }

    public void setPessoas(String pessoas) {
        this.pessoas = pessoas;
    }

    public Double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(Double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
}

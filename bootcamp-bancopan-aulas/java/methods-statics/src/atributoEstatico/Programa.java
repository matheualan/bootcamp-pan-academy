package atributoEstatico;

public class Programa {
    public static void main(String[] args) {

        // nao precisa inicializar
        Time.professor= "Master Coach Gilberto";
        //Time.aluno = "Julia";

        Time atleta1 = new Time();
        atleta1.atleta = "Julia";
        System.out.println("atleta:" + atleta1.atleta);
        System.out.println("Coach:" + atleta1.professor);

        Time atleta2 = new Time();
        atleta2.atleta = "Marcela";
        System.out.println("atleta:" + atleta2.atleta);
        System.out.println("Coach:" + atleta2.professor);

    }
}

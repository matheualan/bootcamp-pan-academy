package heranca.alunos;

public class Programa {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();

        aluno1.setNome("Julio");
        aluno1.setCurso("Portugues");
        System.out.println(aluno1.getCurso());
        System.out.println(aluno1.getNome());
        professor1.setSalario(1000.00);
        System.out.println("Salário do Prof: " + professor1.getSalario());
    }


}

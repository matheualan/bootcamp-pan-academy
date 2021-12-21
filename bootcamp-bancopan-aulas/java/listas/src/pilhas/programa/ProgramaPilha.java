package pilhas.programa;

import java.util.Stack;

import static pilhas.programa.pilhaRepo.deletandoPop;
import static pilhas.programa.pilhaRepo.inserindoPush;

public class ProgramaPilha extends pilhaRepo {
    public static void main(String[] args) {
//      creating an object of Stack class
        Stack<String> pilhinha = new Stack<>();
        System.out.println("stack: " + pilhinha);
//      pushing elements into the stack
        inserindoPush(pilhinha, "Caixa acústica 110");
        inserindoPush(pilhinha, "Caixa acústica 220");
        inserindoPush(pilhinha, "Note");
        deletandoPop(pilhinha);
        deletandoPop(pilhinha);
    }
}

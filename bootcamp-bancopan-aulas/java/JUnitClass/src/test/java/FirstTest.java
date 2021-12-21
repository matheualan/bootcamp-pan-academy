import org.junit.After;
import org.junit.Test;

public class FirstTest {

    //A anotação @Test deve ser public e void
    @Test
    public void exemploTesteValido() {
    }

    @Test
    public void secondMethod() {
    }

//    @Test
    public String exemploMetodoTesteInvalidoString() {
        return "";
    }

    @Test
    public void fourthMethod() {
    }

    @After
    public void metodoDeExemploTesteImpressaoNaTela() {
        System.out.println("Teste 1 executado");
    }

    //@Test
    public void metodoNaoETeste() {
        System.out.println("Esta mensagem nao deve aparecer");
    }

    @Test
    public void exemploTesteImpressaoNaTela2() {
        System.out.println("Teste 2 executado");
    }
}

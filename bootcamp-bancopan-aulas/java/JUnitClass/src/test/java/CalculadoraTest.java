import demo.Calculadora;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        System.out.println("somar");
        int n1 = 5;
        int n2 = 5;
        Calculadora calculadoraTeste = new Calculadora();
        double resultadoEsperado = 10.0;
        double result = calculadoraTeste.aumentar(n1, n2);
        assertEquals(resultadoEsperado, result, 0);
    }

    @Test
    public void testDiminuir() {
        System.out.println("subtrair");
        int n1 = 5;
        int n2 = 3;
        Calculadora calculadoraTeste = new Calculadora();
        double resultadoEsperado = 5;
        double result = calculadoraTeste.aumentar(n1, n2);
        assertEquals(resultadoEsperado, result, 0);
    }

    @Test
    public void testDuplica() {
        System.out.println("duplica");
        int n1 = 6;
        Calculadora calcTeste = new Calculadora();
        double resultadoEsperado = 12;
        double result = calcTeste.duplica(n1);
        assertEquals(resultadoEsperado, result);
    }
}

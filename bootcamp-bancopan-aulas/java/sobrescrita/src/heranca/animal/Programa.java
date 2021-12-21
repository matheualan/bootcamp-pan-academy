package heranca.animal;

public class Programa {
    public static void main(String[] args) {

        Gato gatinho1 = new Gato();
        gatinho1.dormir();
        gatinho1.setPeso(7);
        gatinho1.setRaca("Siameses");
        System.out.println("------Sobre o gato-----");
        System.out.println(gatinho1.getPeso());

        System.out.println();
        Cachorro cachorro = new Cachorro();
        cachorro.dormir();
        cachorro.setPeso(12);
        cachorro.setRaca("Labrador");
        System.out.println("------ Sobre o Cachorro -----");
        System.out.println(cachorro.getPeso());
    }
}

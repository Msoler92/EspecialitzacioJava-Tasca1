package n1exercici1;
public class Main {
    public static void main(String[] args) {
        System.out.println("Creant instrument de vent:");
        Vent clarinet = new Vent("clarinet", 2000);

        System.out.println("Creant instrument de corda:");
        Corda violi = new Corda("violí", 2000);

        System.out.println("Creant instrument de percussió:");
        Percussio timbal = new Percussio("timbal", 2000);
    }
}

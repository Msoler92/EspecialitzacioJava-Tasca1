package n1exercici1;

public class Percussio extends Instrument {
    public Percussio (String name, float price) {
        super(name, price);
    }

    static {
        System.out.println("Aquesta és la classe Percussio.");
    }
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió.");
    }
}

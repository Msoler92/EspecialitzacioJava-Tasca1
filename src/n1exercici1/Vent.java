package n1exercici1;

public class Vent extends Instrument {
    public Vent (String name, float price) {
        super(name, price);
    }

    static {
        System.out.println("Aquesta és la classe Vent.");
    }

    public void tocar() {
        System.out.println("Està sonant un instrument de vent.");
    }
}

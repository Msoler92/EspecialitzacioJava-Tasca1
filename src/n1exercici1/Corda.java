package n1exercici1;

public class Corda extends Instrument {
    public Corda (String name, float price) {
        super(name, price);
    }

    static {
        System.out.println("Aquest és un bloc estàtic de la classe Corda.");
    }

    public float getPrice() {
        return price;
    }
    public void tocar() {
        System.out.println("Està sonant un instrument de corda.");
    }
}

package n1exercici1;

public class Percussio extends Instrument {
    public Percussio (String name, float price) {
        super(name, price);
    }

    static {
        System.out.println("Aquest és un bloc estàtic de la classe Percussio.");
    }

    public float getPrice() {
        return price;
    }
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió.");
    }
}

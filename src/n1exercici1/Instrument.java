package n1exercici1;

public abstract class Instrument {
    protected String name;
    protected float price;

    public Instrument (String name, float price) {
        this.name = name;
        this.price = price;
    }

    static {
        System.out.println("Aquest és un bloc estàtic de la classe Instrument.");
    }

    abstract void tocar();

}

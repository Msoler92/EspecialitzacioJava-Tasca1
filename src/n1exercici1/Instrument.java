package n1exercici1;

public abstract class Instrument {
    protected String name;
    protected float price;

    public Instrument (String name, float price) {
        this.name = name;
        this.price = price;
    }

    static {
        System.out.println("Aquesta és la classe Instrument.");
    }

    abstract void tocar();

}

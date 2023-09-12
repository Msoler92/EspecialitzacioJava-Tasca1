package n1exercici2;

public class Cotxe {
    static final String marca;
    static String model;
    final int potencia;

    static {
        //Son atributs estàtics, i per tant no es poden canviar en diferents instàncies de la classe.
        marca = "MarcaCotxe";
        model = "ModelCotxe";
    }
    //Constructor
    public Cotxe (int potencia) {
        this.potencia = potencia; //No és un atribut estàtic. Per tant, cada instància de la classe pot tenir un valor diferent.
    }
    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getPotencia() {
        return potencia;
    }
    //Setters
    public static void setModel(String nouModel) {
        model = nouModel;
    }
    //No hi pot haver Setter per Marca o Potencia, ja que son Finals

    //Class Methods
    public static void frenar() {
        System.out.println("El vehicle està accelerant");
    }

    public void accelerar() {
        System.out.println("El vehicle està frenant.");
    }
}
package n3exercici1;

public class NoticiaMoto extends Noticia {
    private static final int TypeID = 5;
    private String equip;

    //Constructor
    public NoticiaMoto(String titular, String equip) {
        this.equip = equip;
        this.titular = titular;
        this.text = "";
        this.punts = calculaPuntuacioNoticia();
        this.preu = calculaPreuNoticia();
    }

    //Class methods
    public float calculaPreuNoticia() {
        float preuFinal = 100;

        if (equip.equals("Honda") || equip.equals("Yamaha")) {
            preuFinal += 50;
        }
        return preuFinal;
    }

    public int calculaPuntuacioNoticia() {
        int puntsFinal = 3;

        if (equip.equals("Honda") || equip.equals("Yamaha")) {
            puntsFinal += 3;
        }
        return puntsFinal;
    }
}

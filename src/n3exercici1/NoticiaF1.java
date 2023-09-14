package n3exercici1;

public class NoticiaF1 extends Noticia {
    private static final int TypeID = 4;
    private String escuderia;

    //Constructor
    public NoticiaF1(String titular, String escuderia) {
        this.escuderia = escuderia;
        this.titular = titular;
        this.text = "";
        this.punts = calculaPuntuacioNoticia();
        this.preu = calculaPreuNoticia();
    }

    public float calculaPreuNoticia() {
        float preuFinal = 100;

        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) {
            preuFinal += 50;
        }
        return preuFinal;
    }

    public int calculaPuntuacioNoticia() {
        int puntsFinal = 4;

        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) {
            puntsFinal += 2;
        }
        return puntsFinal;
    }

    public String toString() {
        return super.toString() +
                "Escuderia: " + escuderia + "\n";
    }

}

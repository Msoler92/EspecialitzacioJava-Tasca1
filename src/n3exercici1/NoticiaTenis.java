package n3exercici1;

public class NoticiaTenis extends Noticia {
    private static final int TypeID = 3;
    private String competicio;
    private String tenista;

    //Constructor
    public NoticiaTenis (String titular, String competicio, String tenista) {
        this.competicio = competicio;
        this.tenista = tenista;
        this.titular = titular;
        this.text = "";
        this.punts = calculaPuntuacioNoticia();
        this.preu = calculaPreuNoticia();
    }

    //Class methods
    //Class methods
    public float calculaPreuNoticia() {
        float preuFinal = 150;
        if (tenista.equals("Federer") || tenista.equals("Nadal") || tenista.equals("Djokovic")) {
            preuFinal += 100;
        }
        return preuFinal;
    }

    public int calculaPuntuacioNoticia() {
        int puntsFinal = 4;

        if (tenista.equals("Federer") || tenista.equals("Nadal") || tenista.equals("Djokovic")) {
            puntsFinal += 3;
        }
        return puntsFinal;
    }
    public String toString() {
        return super.toString() +
                "Competició: " + competicio + "\n" +
                "Tenista: " + tenista + "\n";
    }

}

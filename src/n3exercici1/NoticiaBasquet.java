package n3exercici1;

public class NoticiaBasquet extends Noticia {
    private static final int TypeID = 2;
    private String competicio;
    private String club;

    //Constructor
    public NoticiaBasquet(String titular, String competicio, String club) {
        this.competicio = competicio;
        this.club = club;
        this.titular = titular;
        this.text = "";
        this.punts = calculaPuntuacioNoticia();
        this.preu = calculaPreuNoticia();
    }

    //Class methods
    public float calculaPreuNoticia() {
        float preuFinal = 250;
        if (competicio.equals("Eurolliga")) {
            preuFinal += 75;
        }
        if (club.equals("Barça") || club.equals("Madrid")) {
            preuFinal += 75;
        }
        return preuFinal;
    }

    public int calculaPuntuacioNoticia() {
        int puntsFinal = 4;
        if (competicio.equals("Eurolliga")) {
            puntsFinal += 3;
        }
        else if (competicio.equals("ACB")) {
            puntsFinal += 2;
        }
        if (club.equals("Barça") || club.equals("Madrid")) {
            puntsFinal += 1;
        }
        return puntsFinal;
    }
}

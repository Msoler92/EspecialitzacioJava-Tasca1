package n3exercici1;

public class NoticiaFutbol extends Noticia {
    private static final int TypeID = 1;
    private String competicio;
    private String club;
    private String jugador;

    //Constructor
    public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
        this.titular = titular;
        this.text = "";
        this.punts = calculaPuntuacioNoticia();
        this.preu = calculaPreuNoticia();
    }

    //Class methods
    public float calculaPreuNoticia() {
        float preuFinal = 300;
        if (competicio.equals("Lliga de Campions")) {
            preuFinal += 100;
        }
        if (club.equals("Barça") || club.equals("Madrid")) {
            preuFinal += 100;
        }
        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
            preuFinal += 50;
        }
        return preuFinal;
    }

    public int calculaPuntuacioNoticia() {
        int puntsFinal = 5;
        if (competicio.equals("Lliga de Campions")) {
            puntsFinal += 3;
        }
        else if (competicio.equals("Lliga")) {
            puntsFinal += 2;
        }
        if (club.equals("Barça") || club.equals("Madrid")) {
            puntsFinal += 1;
        }
        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) {
            puntsFinal += 1;
        }
        return puntsFinal;
    }

}

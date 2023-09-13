package n3exercici1;
import java.util.ArrayList;

public class Redactor {
    private String nom;
    private final String DNI;
    private static float sou = 1500;

    private ArrayList<Noticia> noticiesAssignades;

    //Constructor
    public Redactor (String nom, String DNI) {
        this.nom = nom;
        this.DNI = DNI;
        noticiesAssignades = new ArrayList<Noticia>();
    }

    //Getters
    public String getNom() {
        return nom;
    }
    public String getDNI() {
        return DNI;
    }
    public static float getSou() {
        return sou;
    }

    public ArrayList<Noticia> getNoticiesAssignades() {
        return noticiesAssignades;
    }

    //Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    //Class methods
    public void addNoticia(Noticia novaNoticia) {
        noticiesAssignades.add(novaNoticia);
    }

    public boolean removeNoticia (String titular) {
        boolean found = false;
        int numNoticies = noticiesAssignades.size();
        int i = 0;
        while (!found && i < numNoticies) {
            if (noticiesAssignades.get(i).getTitular().equals(titular)) {
                noticiesAssignades.remove(i);
                found = true;
            }
            i++;
        }
        return found;
    }


}

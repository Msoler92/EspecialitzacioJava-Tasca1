package n3exercici1;

public class Noticia {
    protected static final int TypeID = 0;
    protected String titular;
    protected String text;
    protected int punts;
    protected float preu;

    //Constructor
    public Noticia() {
    }

    //Getters
    public String getTitular() {
        return titular;
    }
    public String getText() {
        return text;
    }
    public int getPunts() {
        return punts;
    }
    public float getPreu() {
        return preu;
    }

    public int getTypeID() {
        return TypeID;
    }

    //Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setPunts(int punts) {
        this.punts = punts;
    }
    public void setPreu(float preu) {
        this.preu = preu;
    }

    //Class methods
    public String toString() {
        return "Titular: " + titular + "\n" +
                "Text: " + text + "\n" +
                "Punts: " + punts + "\n" +
                "Preu " + preu + "\n";
    }

}

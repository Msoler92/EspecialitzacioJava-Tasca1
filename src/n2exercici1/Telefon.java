package n2exercici1;

public class Telefon {
    protected String marca;
    protected String model;

    public Telefon (String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getMarca() {
        return marca;
    }
    public String getModel() {
        return model;
    }

    //Class methods
    public void trucar(String phoneNum) {
        System.out.println("S'està trucant al " + phoneNum);
    }


}

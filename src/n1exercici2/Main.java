package n1exercici2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creem dos objectes de la classe Cotxe");
        Cotxe cotxe1 = new Cotxe(2200);
        Cotxe cotxe2 = new Cotxe(1100);

        System.out.println();
        System.out.println("Atributs de cotxe1:");
        System.out.println("Marca: " + cotxe1.getMarca());
        System.out.println("Model: " + cotxe1.getModel());
        System.out.println("Potencia: " + cotxe1.getPotencia());
        System.out.println();
        System.out.println("Atributs de cotxe2:");
        System.out.println("Marca: " + cotxe2.getMarca());
        System.out.println("Model: " + cotxe2.getModel());
        System.out.println("Potencia: " + cotxe2.getPotencia());
        System.out.println();

        //No podem canviar la marca ni la potència, per ser finals.
        //Podem canviar el model, però com que és estàtic el canvi afectarà a la classe (i, per tant, a totes les instàncies individuals)
        System.out.println("Canviem el Model a \"NouModel\".");
        System.out.println();
        Cotxe.setModel("NouModel");//És un mètode de la classe Cotxe, no de les instàncies cotxe1 o cotxe2
        System.out.println("Atributs de cotxe1:");
        System.out.println("Marca: " + cotxe1.getMarca());
        System.out.println("Model: " + cotxe1.getModel());
        System.out.println("Potencia: " + cotxe1.getPotencia());
        System.out.println();
        System.out.println("Atributs de cotxe2:");
        System.out.println("Marca: " + cotxe2.getMarca());
        System.out.println("Model: " + cotxe2.getModel());
        System.out.println("Potencia: " + cotxe2.getPotencia());
        System.out.println();

        System.out.println("Cridem el mètode Accelerar():");
        cotxe1.accelerar(); //Cridem el mètode de la instància cotxe1
        System.out.println("Cridem el mètode Frenar():");
        Cotxe.frenar(); //Cridem el mètode estàtic de la classe Cotxe
    }
}

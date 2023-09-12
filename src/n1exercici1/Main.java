package n1exercici1;
public class Main {
    public static void main(String[] args) {
        System.out.println("Creant instrument de vent (clarinet):");
        Vent clarinet = new Vent("clarinet", 2000);
        System.out.println("Creant instrument de vent (flauta):");
        Vent flauta = new Vent("flauta", 100);

        System.out.println("Creant instrument de corda (violí):");
        Corda violi = new Corda("violí", 2000);
        System.out.println("Creant instrument de corda (guitarra):");
        Corda guitarra = new Corda("guitarra", 1200);

        System.out.println("Creant instrument de percussió (timbal):");
        Percussio timbal = new Percussio("timbal", 2000);
        System.out.println("Creant instrument de percussió (pandero):");
        Percussio pandero = new Percussio("pandero", 1000);

        System.out.println("Els missatges dels blocs estàtics de les classes filles (Vent, Corda o Percussió) només es mostren la " +
                "primera vegada que es crea un objecte de la classe filla en qüestió.");
        System.out.println("El missatge del bloc estàtic de la classe mare Instrument només es mostra una vegada, " +
                "la primera vegada que es crea un objecte d'alguna classe filla.");
        System.out.println();

        System.out.println("Provant el mètode tocar():");
        System.out.println("Clarinet (vent):");
        clarinet.tocar();
        System.out.println("Violí (corda):");
        violi.tocar();
        System.out.println("Timbal (percussió):");
        timbal.tocar();
        System.out.println("Aquest mètode no és estàtic. Per tant, s'ha de cridar des d'una instància de la classe.");
        // Vent.tocar(); No funciona perquè tocar() no és estàtic.
        System.out.println();

        System.out.println("Els atributs de les classes filles no són estàtics: cada objecte pot tenir-hi valors diferents.");
        System.out.println("Preu del \"clarinet\":");
        System.out.println(clarinet.getPrice());
        System.out.println("Preu de la \"flauta\":");
        System.out.println(flauta.getPrice());
    }
}

package n3exercici1;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Redactor> plantilla = new ArrayList<Redactor>();
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            int n = 0;
            System.out.println("Menú principal:");
            System.out.println("1.- Introduir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introduir notícia a un redactor.");
            System.out.println("4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).");
            System.out.println("5.- Mostrar totes les notícies per redactor.");
            System.out.println("6.- Calcular puntuació de la notícia.");
            System.out.println("7.- Calcular preu-notícia.");
            System.out.println("8.- Sortir.");

            n = inputInt("Marqui el número de l'acció a realitzar:");

            switch (n) {
                case 1:
                    addRedactor(
                            new Redactor(
                                    inputString("Introdueixi el nom del redactor:"), inputString("Introdueixi el DNI del redactor:")));
                    break;
                case 2:
                    removeRedactor(inputString("Introdueixi el DNI del redactor a eliminar:"));
                    break;
                case 3:
                    creaNoticia(inputString("Introdueixi el DNI del redactor assignat a la notícia:"));
                    break;
                case 4:
                    eliminaNoticia(inputString("Introdueixi el DNI del redactor assignat a la notícia:"));
                    break;
                case 5:
                    mostraNoticies(inputString("Introdueixi el DNI del redactor assignat a la notícia:"));
                    break;
                case 6:
                    System.out.println("La puntuació de la noticia és de " + calculaPuntuacioNoticia() + " punts.");
                    break;
                case 7:
                    System.out.println("La puntuació de la noticia és de " + calculaPreuNoticia() + " punts.");
                    break;
                case 8:
                    run = false;
                default:
                    //Error
            }

        }
        System.out.println("Tancant aplicació.");

    }

    //Utilitat i auxiliars
    static String inputString(String message) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    static int inputInt(String message) {
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    static int findRedactor (String DNI) {
        boolean found = false;
        int i = plantilla.size() - 1;

        while (!found && i >= 0) {
            if (plantilla.get(i).getDNI().equals(DNI)) {
                found = true;
            }
            else {
                i--;
            }
        }
        return i;
    }
/*    static int forceFindRedactor() {
        boolean found = false;
        int redactorIndex = 0;
        String dni;
        while (!found) {
            dni = inputString("Introdueixi el DNI del redactor:");
            redactorIndex = findRedactor(dni);
            if (redactorIndex != -1) {
                found = true;
            }
            else {
                //Error
            }
        }
        return redactorIndex;
     }*/

    //Errors


    //Crear redactor
    static void addRedactor(Redactor newRedactor) {
        if (findRedactor(newRedactor.getDNI()) == -1) {
            plantilla.add(newRedactor);
        }
        else {
            System.out.println("Ja existeix un redactor amb aquest DNI.");
        }

    }
    //Eliminar redactor
    static void removeRedactor(String DNI) {
        int i = findRedactor(DNI);
        if (i == -1) {
            System.out.println("No existeix cap redactor amb aquest DNI.");
        }
        else {
        plantilla.remove(i);
        }

    }

    //Crear noticia
    static Noticia newsMenu() {
        boolean validInput = false;
        Noticia novaNoticia = new Noticia();
        while (!validInput) {
            System.out.println("Tipus de notícies:");
            System.out.println("1.- Futbol.");
            System.out.println("2.- Bàsquet.");
            System.out.println("3.- Tenis.");
            System.out.println("4.- F1.");
            System.out.println("5.- Motociclisme.");

            switch (inputInt("Marqui el número corresponent al tipus de la notícia:")) {
                case 1:
                    novaNoticia = new NoticiaFutbol(
                            inputString("Introdueixi el titular:"),
                            inputString("Introdueixi el nom de la competició:"),
                            inputString("Introdueixi el nom del club:"),
                            inputString("Introdueixi el nom del jugador implicat:"));
                    validInput = true;
                    break;
                case 2:
                    novaNoticia = new NoticiaBasquet(
                            inputString("Introdueixi el titular:"),
                            inputString("Introdueixi el nom de la competició:"),
                            inputString("Introdueixi el nom del club:"));
                    validInput = true;
                    break;
                case 3:
                    novaNoticia = new NoticiaTenis(
                            inputString("Introdueixi el titular:"),
                            inputString("Introdueixi el nom de la competició:"),
                            inputString("Introdueixi el nom del tenista implicat:"));
                    validInput = true;
                    break;
                case 4:
                    novaNoticia = new NoticiaF1(
                            inputString("Introdueixi el titular:"),
                            inputString("Introdueixi el nom de l'escuderia implicada:"));
                    validInput = true;
                    break;
                case 5:
                    novaNoticia = new NoticiaMoto(
                            inputString("Introdueixi el titular:"),
                            inputString("Introdueixi el nom de l'equip implicat:"));
                    validInput = true;
                    break;
                default:
                    //Manage error
                    break;
            }
        }
        return novaNoticia;
    }
    static void creaNoticia(String redactorDNI) {
        int i = findRedactor(redactorDNI);
        if (i == -1) {
            System.out.println("No existeix cap redactor amb aquest DNI.");
        }
        else {
            plantilla.get(i).addNoticia(newsMenu());
            System.out.println("Noticia afegida.");
        }
    }
    //Elimina notícia
    static void eliminaNoticia(String redactorDNI) {
        int i = findRedactor(redactorDNI);
        if (i == -1) {
            System.out.println("No existeix cap redactor amb aquest DNI.");
        }
        else {
            while(!plantilla.get(i).removeNoticia(inputString("Introdueixi el titular de la notícia a eliminar."))) {
                System.out.println("Titular no reconegut.");
            }
            System.out.println("Noticia eliminada.");
        }
    }

    //Mostrar notícies
    static void mostraNoticies(String redactorDNI) {
        int i = findRedactor(redactorDNI);
        if (i == -1) {
            System.out.println("No existeix cap redactor amb aquest DNI.");
        }
        else {
            mostraNoticiesMenu(plantilla.get(i));
        }
    }

    static void mostraNoticiesMenu(Redactor redactor) {
        int index;
        ArrayList<Noticia> noticies = redactor.getNoticiesAssignades();
        int s = noticies.size();
        for (int i = 0; i < s; i++) {
            System.out.println(i +1 + ".- " + noticies.get(i).getTitular());
        }
        index = inputInt("Introdueixi el número de la notícia que vol veure:") - 1;
        while (index < 0 || index >= s) {
            System.out.println("Ordre no reconeguda.");
            index = inputInt("Introdueixi el número de la notícia que vol veure:");
        }
        System.out.println(noticies.get(index).toString());
    }

    static int calculaPuntuacioNoticia() {
        return newsMenu().getPunts();
    }

    static float calculaPreuNoticia() {
        return newsMenu().getPreu();
    }

}

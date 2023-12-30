package TD1;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'heure (format 24 heures) : ");
        int hour = scanner.nextInt();

        System.out.print("Choisissez la langue (f pour français, a pour anglais) : ");
        char langChoice = scanner.next().charAt(0);

        String mot="";

        if (langChoice == 'f') {
            if (hour >= 0 && hour < 18) {
                mot = "Bonjour";
            } else if (hour >= 18 && hour < 22) {
                mot = "Bonsoir";
            } else {
                mot = "Bonne nuit";
            }
        } else if (langChoice == 'a') {
            if (hour >= 0 && hour < 18) {
                mot = "Good Morning";
            } else if (hour >= 18 && hour < 22) {
                mot = "Good Evening";
            } else {
                mot = "Good Night";
            }
        } else {
            System.out.println("Choix de langue non reconnu.");
            System.exit(0);
        }

        System.out.println(mot);


    }
}

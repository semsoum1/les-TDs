package TD1;
import java.util.Scanner;
public class Ex8 {
    public static boolean estBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une année entre 1900 et 2100 : ");
        int annee = scanner.nextInt();

        if (annee < 1900 || annee > 2100) {
            System.out.println("L'année doit être comprise entre 1900 et 2100.");
        } else {
            System.out.print("Entrez le numéro du mois (1 pour janvier, 2 pour février, etc.) : ");
            int mois = scanner.nextInt();

            if (mois < 1 || mois > 12) {
                System.out.println("Le numéro du mois doit être entre 1 et 12.");
            } else {
                int jours = 0;

                if (mois == 2) {
                    jours = estBissextile(annee) ? 29 : 28;
                    System.out.println("Février " + annee + " a " + jours + " jours.");
                } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                    jours = 30;
                    System.out.println("Le mois " + mois + " de l'année " + annee + " a " + jours + " jours.");
                } else {
                    jours = 31;
                    System.out.println("Le mois " + mois + " de l'année " + annee + " a " + jours + " jours.");
                }
            }
        }
    }
}

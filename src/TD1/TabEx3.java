package TD1;
import java.util.Scanner;
public class TabEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'étudiants : ");
        int nombreEtudiants = scanner.nextInt();

        double[] moyennes = new double[nombreEtudiants];

        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.print("Entrez la moyenne de l'étudiant " + (i + 1) + " : ");
            moyennes[i] = scanner.nextDouble();
        }

        System.out.print("Entrez le seuil de moyenne : ");
        double seuil = scanner.nextDouble();

        int nombreMoyennesSuperieures;
        int compteur = 0;

        for (double moyenne : moyennes) {
            if (moyenne >= seuil) {
                compteur++;
            }
        }
        System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale à " + seuil + " est : " + compteur);

    }
}

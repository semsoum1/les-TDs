package TD1;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.print("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        double delta =  Math.pow(b,2) - 4 * a * c;

        if (delta > 0) {
            double sol1 = (-b + Math.sqrt(delta)) / (2 * a);
            double sol2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Les racines de l'équation sont : " + sol1 + " et " + sol2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("La racine double de l'équation est : " + root);
        } else {
            System.out.println("erreur");
        }


    }
}

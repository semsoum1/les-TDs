package TD1;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de A : ");
        int A = scanner.nextInt();

        System.out.print("Entrez la valeur de B : ");
        int B = scanner.nextInt();

        String signe;

        if (A > 0 && B > 0 || A < 0 && B < 0) {
            signe = "positive";
        } else if (A == 0 || B == 0) {
            signe = "nul";
        } else {
            signe = "negative";
        }

        System.out.println("Le signe du produit de A et B est : " + signe);

    }
}

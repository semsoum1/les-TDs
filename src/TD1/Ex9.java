package TD1;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première variable : ");
        int nb1 = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int nb2 = scanner.nextInt();

        if (nb1 > nb2) {
            int temp = nb1;
            nb1 = nb2;
            nb2 = temp;
        }

        System.out.println("Les variables dans l'ordre croissant sont : " + nb1 + ", " + nb2);

        scanner.close();
    }
}

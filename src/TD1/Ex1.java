package TD1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        int nbr1 = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int nbr2 = scanner.nextInt();

        System.out.print("Entrez le troisième nombre : ");
        int nbr3 = scanner.nextInt();

        int max = nbr1;

        if (nbr2 > max) {
            max = nbr2;
        }

        if (nbr3 > max) {
            max = nbr3;
        }

        System.out.println("Le maximum des trois nombres est : " + max);
    }
}

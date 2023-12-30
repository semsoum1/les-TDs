package TD1;
import java.util.Scanner;
public class LoopEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier positif non nul a : ");
        int a = scanner.nextInt();

        System.out.print("Entrez un entier positif non nul b : ");
        int b = scanner.nextInt();

        int pgcd=a ;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);


    }
}

package TD1;
import java.util.Scanner;

public class LoopEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier naturel N : ");
        int N = scanner.nextInt();
        int fact=1;
        for (int i = 2; i <= N; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
package TD1;
import java.util.Scanner;

public class LoopEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier N : ");
        int N = scanner.nextInt();

        int somme = 0;
        System.out.println("La somme des entiers impairs inférieurs à " + N + " est : " + somme);
        for (int i = 1; i < N; i += 2) {
            somme += i;
        }
        System.out.println(somme);

    }
    }

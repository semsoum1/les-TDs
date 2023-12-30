package TD1;
import java.util.Scanner;
public class LoopEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

        int somme = 0;
        while (nombre != 0) {
            somme += nombre % 10;
            nombre /= 10;
        }
        System.out.println("La somme des chiffres de " + nombre + " est : " + somme);








    }
}

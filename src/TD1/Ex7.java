package TD1;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier de trois chiffres non nuls : ");
        int N = scanner.nextInt();

        if (N < 100 || N > 999) {
            System.out.println("Veuillez entrer un entier de trois chiffres non nuls.");


        int a = N / 100;
        int b = (N / 10) % 10;
        int c = N % 10;

        System.out.print(a * 100 + c * 10 + b + ", ");
        System.out.print(b * 100 + a * 10 + c + ", ");
        System.out.print(b * 100 + c * 10 + a + ", ");
        System.out.print(c * 100 + b * 10 + b + ", ");
        System.out.print(c * 100 + b * 10 + b);}
        else
            System.out.print(N + "nombre non compris dans l intervalle ");
        ;
    }
}

package TD1;
import java.util.Scanner;

public class LoopEx3 {
    public static void main(String[] args) {

Scanner sc =new Scanner(System.in);
int n,p=0,max=0;
       for (int i = 1; i <= 20; i++) {
            n = sc.nextInt();
            if (n>max) {
                max = n;
                p =i;
            }
        }
        System.out.println("Max = " + max + " P = " + p);



// dernier qst :
     do {
        System.out.print("Entrez un nombre (0 pour terminer) : ");
        n = sc.nextInt();

        if (n != 0 && n > max) {
            max = n;
        }
    } while (n != 0);

}
}
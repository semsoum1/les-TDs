package TD1;

public class LoopEx10 {
    public static void main(String[] args) {
        System.out.println("Les entiers cubiques de trois chiffres sont :");

        for (int i = 100; i <= 999; i++) {
            int A = i / 100;
            int B = (i / 10) % 10;
            int C = i % 10;

            if (i == (Math.pow(A, 3) + Math.pow(B, 3) + Math.pow(C, 3))) {
                System.out.println(i);
            }
        }
    }
}

package TD1;
import java.util.Random;

public class TabEx4 {
    public static void main(String[] args) {

        int n = 4, m=4;
        Random random = new Random();
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = random.nextInt(5);
                b[i][j] = random.nextInt(5);
            }
        }

        int[][] M = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                M[i][j] = a[i][j] + b[i][j];
                System.out.println(M[i][j]);
                                            }
                                    }


    }
}



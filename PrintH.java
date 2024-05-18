import java.util.Scanner;

public class PrintH {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz");
        int n = s.nextInt();

        int[][] h = new int[n][n];

        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i].length; j++) {
                if(j == 0 || i == n/2 || (i > n/2 && j == n-1)){
                    h[i][j] = 1;
                }else {
                    h[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i].length; j++) {
                System.out.print(h[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

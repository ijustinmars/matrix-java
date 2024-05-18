import java.util.Scanner;

public class PrintX {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz para imprimir una X");
        int n = s.nextInt();

        if (n == 0){
            System.out.println("ERROR");
            System.exit(0);
        }

        String[][] x = new String[n][n];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i == j || j == n - 1 - i){
                    x[i][j] = "x";
                }else {
                    x[i][j] = "_";
                }
            }
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

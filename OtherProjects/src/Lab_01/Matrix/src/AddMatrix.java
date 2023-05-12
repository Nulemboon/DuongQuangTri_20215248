import java.util.Scanner;
public class AddMatrix {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int row = sc.nextInt();
        System.out.println("Input number of column");
        int col = sc.nextInt();
        int[][] m1 = new int[row][col];
        int[][] m2 = new int[row][col];
        
        System.out.println("Input first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("position " + (i + 1) + (j + 1) + ": ");
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("position " + (i + 1) + (j + 1) + ": ");
                m2[i][j] = sc.nextInt();
            }
        }

        int[][] m3 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("Result: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println("");
        }

        sc.close();
    }   
}

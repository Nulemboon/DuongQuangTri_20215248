import java.util.Scanner;
import java.lang.Math;

public class SolveEquations {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        int n = 0;
        while (true) {
            System.out.println("-----Menu-----\n1. Solve linear equation\n2. Solve linear system with 2 variables\n3. Solve second degree equation\n4. Exit\nChoose: ");
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1: {
                    solveLinearEquation();
                    break;
                }
                case 2: {
                    solveLinearSystem();
                    break;
                }
                case 3: {
                    solveSecondDegree();
                    break;
                }
                case 4: {
                    sc.close();
                    return;
                }
                default: System.out.println("Invalid input! Re-enter please: ");
            }
            
        }
    }

    public static void solveLinearEquation() {
        double x, a, b;

        System.out.println("Input a: ");
        a = sc.nextDouble();
        System.out.println("Input b: ");
        b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) System.out.println("Infinite solution");
            else System.out.println("No solution");
        } else {
            x = b / a;
            System.out.println("The solution is: x = " + x);
        }
    }

    public static void solveLinearSystem() {
        double x1, x2;
        double[][] a = new double[2][2];
        double[] b = new double[2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Input a" + (i + 1) + (j + 1) + ": ");
                a[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Input b" + (i + 1) + ": ");
            b[i] = sc.nextDouble();
        }
        
        double det = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        double det1 = b[0] * a[1][1] - b[1] * a[0][1];
        double det2 = a[0][0] * b[1] - a[1][0] * b[0];
        if (det == 0) {
            if (det1 == 0 && det2 == 0) System.out.println("Infinite solution");
            else System.out.println("No solution");
        } else {
            x1 = det1 / det;
            x2 = det2 / det;
            System.out.println("The solution is: x1 = " + x1 + "\n\t\tx2 = " + x2);
        }
    }

    public static void solveSecondDegree() {
        double x1, x2, a, b, c;

        System.out.println("Input a: ");
        a = sc.nextDouble();
        System.out.println("Input b: ");
        b = sc.nextDouble();
        System.out.println("Input c: ");
        c = sc.nextDouble();
        
        if (a == 0) {    
            if (b == 0) {
                if (c == 0) System.out.println("Infinite solution");
                else System.out.println("No solution");
            } else {
                x1 = -c / b;
                System.out.println("The solution is: x = " + x1);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Double roots x1 = x2 = " + x1);
            } else if (delta < 0) {
                System.out.println("No real solution");
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Distinct root: x1 = " + x1 + " x2 = " + x2);
            }
        }   
    }
}

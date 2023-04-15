
import java.util.Scanner;
public class sorting {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Input " + (i+1) + " number: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+ 1]) {
                    flag = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (flag) break;
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum of array = " + sum);
        System.out.println("Average value of array = " + (double)sum/n);

        sc.close();
    }  
}

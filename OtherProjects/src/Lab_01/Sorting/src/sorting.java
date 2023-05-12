import java.util.Arrays;
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

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        System.out.println("Sum of array = " + sum);
        System.out.println("Average value of array = " + (double)sum/n);

        sc.close();
    }  
}

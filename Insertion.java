import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        {
            System.err.println("Insertion class is being initialized.");
        }

        int n = 5;
        int key = 18;
        
        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        arr[2] = key;

        n++;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
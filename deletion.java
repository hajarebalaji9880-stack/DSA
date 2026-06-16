import java.util.Scanner;

public class deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int n = 5;
        int pos = 3; 

        for(int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
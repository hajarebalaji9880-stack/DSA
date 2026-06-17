import java.util.Scanner;
public class prob1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int sum = 0;
        for(int i=0;i<7;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int avg = sum/arr.length;
        int count = 0;
        for(int i=0;i<7;i++){
            if(arr[i]>avg){
                count++;
            }
        }
        System.out.println(count);
        
    }
}

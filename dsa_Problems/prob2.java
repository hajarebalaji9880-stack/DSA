package dsa_Problems;

public class prob2 {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        prob2 obj = new prob2();

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        System.out.print("Original String: ");
        System.out.println(s);

        obj.reverseString(s);

        System.out.print("Reversed String: ");
        System.out.println(s);
    }
}
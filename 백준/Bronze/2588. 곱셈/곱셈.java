import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String temp = Integer.toString(B);
        int[] temp1 = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            temp1[i] = Character.getNumericValue(temp.charAt(i));
        }

        for (int i = 2; -1 < i; i--) {
            System.out.println(A * temp1[i]);
        }

        System.out.println(A * B);

    }
}
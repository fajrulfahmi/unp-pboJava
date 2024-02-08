import java.util.Scanner;

public class _0546 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Banyaknya : ");
        int n = input.nextInt();
        //segitiga atas
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (i == 0 || j == 0 || j == 2 * i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //segitiga bawah
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (i == n / 2 || j == 0 || j == 2 * i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

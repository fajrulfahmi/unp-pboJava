import java.util.Scanner;

public class _0551_for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;

        do {
            System.out.println("*Minimal kedua sisi 3");
            System.out.print("Sisi 1 : ");
            m = input.nextInt();
            System.out.print("Sisi 2 : ");
            n = input.nextInt();
        } while (n < 3 || m < 3);

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

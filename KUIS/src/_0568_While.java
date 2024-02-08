import java.util.Scanner;

public class _0568_While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;
        System.out.print("Masukkan bilangan genap pertama : ");
        n = input.nextInt();
        System.out.print("Masukkan bilangan genap terakhir : ");
        m = input.nextInt();

        while (n <= m) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            n++;
        }
    }
}

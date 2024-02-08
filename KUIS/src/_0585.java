import java.util.Scanner;

public class _0585 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, count2,  N, sabunGratis = 0, temp;

        System.out.print("Jumlah botol sabun yang dibeli : ");
        N = input.nextInt();

        count = N;
        count2 = N;

        for (int i = 0; i < count; i++) {
            if (count2 >= 12) {
                sabunGratis += 1;
                temp = count2 - 12;
                count2 = temp;
            }
        }


        System.out.println("======================================");
        System.out.println("*Mendapatkan " + sabunGratis + " botol sabun gratis.");
        System.out.println("Jadi botol sabun yang didapatkan \n" + (N + sabunGratis) + " botol");
        System.out.println("======================================");
    }
}

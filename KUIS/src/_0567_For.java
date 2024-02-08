import java.util.Scanner;

public class _0567_For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;

        do {
            System.out.println("*Angka pertama harus lebih besar dari yang terakhir");
            System.out.print("Masukkan bilangan genap pertama : ");
            n = input.nextInt();
            System.out.print("Masukkan bilangan genap terakhir : ");
            m = input.nextInt();
        }while (n > m);

        for(int i = 0; n <= m; i++){
            if(n%2 == 0){
                System.out.print(n + " ");
            }
            n++;
        }
    }
}

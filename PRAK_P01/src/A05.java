import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ru = 14, luas, hAkhir, PANJANG, LEBAR, HARGA;

        System.out.print("Masukkan Panjang      : ");
        PANJANG = input.nextInt();
        System.out.print("Masukkan Lebar        : ");
        LEBAR = input.nextInt();
        System.out.print("Masukkan Harga per Ru : ");
        HARGA = input.nextInt();

        luas = (PANJANG * LEBAR) / ru;
        hAkhir = luas * HARGA;

        System.out.println("Harga : " + hAkhir);

    }
}

import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int HARGA, BANYAK, disc1, disc2, hasil, hAkhir;

        System.out.print("Masukkan harga barang  : ");
        HARGA = input.nextInt();
        System.out.print("Masukkan jumlah barang : ");
        BANYAK = input.nextInt();

        disc1 = HARGA * 25 / 100;
        hasil = HARGA - disc1;
        disc2 = hasil * 10 / 100;
        hAkhir = (hasil - disc2) * BANYAK ;


        System.out.println("Hasil : " + hAkhir);
    }
}

import java.util.Scanner;

public class A04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int BANYAK, BAYAR, disc, hSatuan ;

        System.out.print("Masukkan Harga barang  : ");
        BAYAR = input.nextInt();
        System.out.print("Masukkan Banyak barang : ");
        BANYAK = input.nextInt();

        disc = (BAYAR * 100) / 75;
        hSatuan = ((disc * 100) / 90) / BANYAK;

        System.out.println("Harga satuan barang : " + hSatuan);

    }
}

/*
TUGAS PERTEMUAN KE-02
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM : 2113020008
Nama : Muhammad Fajrul Fahmi
Kelompok : Kelompok6_0008(Fahmi)_nomor1
Kelas : 2A
*/

/*
1. Toko Bunda membuat promo, setiap pembelian susu Miliku 5 kotak,  dapat gratis 1 kotak. Harga 1 kotak susu
Miliku Rp. 5.000. Berapakah yang dibayarkan oleh mas Kholil ke kasir Toko Bunda untuk membawa pulang N
kotak susu Miliku ?
Input :N
*/

import java.util.Scanner;

public class _0201 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, count2,  N, susuGratis = 0, temp, hasil;

        System.out.print("Jumlah Susu Miliku yang dibeli : ");
        N = input.nextInt();

        count = N;
        count2 = N;

        for (int i = 0; i < count; i++) {
            if (count2 >= 5) {
                susuGratis = susuGratis + 1;
                temp = count2 - 5;
                count2 = temp;
            }
        }

        hasil = (N - susuGratis) * 5000;

        System.out.println("======================================");
        System.out.println("Mendapatkan " + susuGratis + " susu Gratis,");
        System.out.println("jadi susu yang perlu dibayar hanya \n" + (N - susuGratis) + " kotak");
        System.out.println("======================================");
        System.out.println("Harga : Rp." + hasil);
    }
}

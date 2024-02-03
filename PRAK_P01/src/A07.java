/*
TUGAS PRAKTIKUM PERTEMUAN KE-01
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM : 2113020008
Nama : Muhammad Fajrul Fahmi
Kelas : 2A
*/

import java.util.Scanner;

public class A07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double v, r, r2, TINGGI, DIAMETER, HEIGHT, SISA, BELI, awal, akhir, harga, laba, hAkhir, kulakan;

        System.out.print("Masukkan Diameter(inch)           : ");
        DIAMETER = input.nextDouble();
        System.out.print("Masukkan Tinggi(inch)             : ");
        TINGGI = input.nextDouble();
        System.out.print("Tandon Diisi setinggi(cm)         : ");
        HEIGHT = input.nextDouble();
        System.out.print("Sisa isi Tandon(cm)               : ");
        SISA = input.nextDouble();
        System.out.print("Harga kulakan Minyak per Liter    : Rp.");
        BELI = input.nextDouble();

        r = DIAMETER/2;
        r2 = r * 2.54;
        v = ((3.14 * r * r) * TINGGI);
        awal = ((3.14 * r2 * r2) * HEIGHT);
        akhir = ((3.14 * r2 * r2) * SISA);
        harga = ((awal - akhir) * 0.001) * BELI;
        kulakan = (awal * 0.001) * BELI;
        laba = harga * 5 / 100;
        hAkhir = harga + laba;

        System.out.println("====================================================");
        System.out.println("Volume Silinder                   : " + v + " Inch3");
        System.out.println("Volume diisi                      : " + awal + " cm3");
        System.out.println("Volume sisa                       : " + akhir + " cm3");
        System.out.println("Biaya Kulakan                     : Rp." + kulakan);
        System.out.println("laba                              : Rp." + hAkhir);


    }
}

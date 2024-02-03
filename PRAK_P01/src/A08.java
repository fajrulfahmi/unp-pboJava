/*
TUGAS PRAKTIKUM PERTEMUAN KE-01
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM : 2113020008
Nama : Muhammad Fajrul Fahmi
Kelas : 2A
*/

import java.util.Scanner;

public class A08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int AWAL, SETOR, N, bunga = 0, bulan;

        System.out.print("Masukkan Setoran Awal : ");
        AWAL = input.nextInt();

        if(AWAL >= 10000000){
            System.out.print("Masukkan Setoran per-Bulan : ");
            SETOR = input.nextInt();
            if(SETOR >= 100000) {
                System.out.print("Masukkan tahun lama menabung : ");
                N = input.nextInt();

                if (AWAL >= 10000000 && AWAL < 20000000) {
                    System.out.println("Mendapatkan hadiah Semsang Galaksih S21 FE 5G 128GB");
                } else if (AWAL >= 20000000 && AWAL < 30000000) {
                    System.out.println("Mendapatkan hadiah Semsang Galaksih S22 Ultra 256GB");
                } else if (AWAL >= 30000000 && AWAL < 50000000) {
                    System.out.println("Mendapatkan hadiah ELG OLED 55G1PTA OLED EVO 55 INCH");
                } else if (AWAL >= 50000000) {
                    System.out.println("Mendapatkan Sonny XR-77A80K 4K HDR OLED 77 INCH");
                }

                bulan = N * 12;
                for (int i = 0; i < bulan; i++) {
                    bunga = (AWAL * 5 / 100) * 30 / 365;
                    AWAL += bunga + SETOR;
                }
                System.out.println("Total Tabungan = " + AWAL);
            }else{
                System.out.println("Setoran per-bulan minimal Rp.100000");
            }

        }else{
            System.out.println("Setoran awal minimal Rp.10000000");
        }
        System.out.println("\n================================================");
    }
}

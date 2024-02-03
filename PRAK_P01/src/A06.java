/*
TUGAS PRAKTIKUM PERTEMUAN KE-01
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM : 2113020008
Nama : Muhammad Fajrul Fahmi
Kelas : 2A
*/

import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int HARGA, bunga, cicilan;

        System.out.print("Masukkan Harga : ");
        HARGA = input.nextInt();

        bunga = HARGA * 2 / 100;
        cicilan = (HARGA + bunga) / 12;

        System.out.println("Besar bunga : " + bunga);
        System.out.println("Cicilan per bulan selama 12 bulan : " + cicilan);
    }
}

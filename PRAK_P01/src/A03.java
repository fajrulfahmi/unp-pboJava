/*
TUGAS PRAKTIKUM PERTEMUAN KE-01
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM : 2113020008
Nama : Muhammad Fajrul Fahmi
Kelas : 2A
*/

import java.util.Scanner;

public class A03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int BAYAR, disc;

        System.out.print("Masukkan harga Barang : ");
        BAYAR = input.nextInt();

        if(BAYAR >= 475000){
            disc = (BAYAR * 100) / 95;
            System.out.println("Harga sebelum diskon : " + disc);
        }else{
            System.out.println("Harga : " + BAYAR + ", tidak mendapatkan diskon");
        }
    }
}

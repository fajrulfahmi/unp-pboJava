/*
TUGAS PERTEMUAN KE-01
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM : 2113020008
Nama : Muhammad Fajrul Fahmi
Kelas : 2A
Kategori : Mudah
Soal : Buatlah program untuk mencari nilai genap dan ganjil
       menggunakan looping.

 */
import java.util.Scanner;

public class Mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        System.out.print("Masukkan nilai = ");
        nilai = input.nextInt();

        for(int i = 1; i <= nilai; i++) {
            if (i % 2 == 0) {
                System.out.println("Nilai " + i + " adalah Genap");
            } else {
                System.out.println("Nilai " + i + " adalah Ganjil");
            }
        }
    }
}

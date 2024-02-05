/*
TUGAS PERTEMUAN KE-01
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM : 2113020008
Nama : Muhammad Fajrul Fahmi
Kelas : 2A
Kategori : Sulit
Soal : Hitung perkalian dari kedua matriks berikut :
       {1,2} x {5,6}
       {3,4}   {7,8}
*/


public class Sulit {
    public static void main(String[] args) {
        int[][] matriks1 = {
                {1,2},
                {3,4}
        };
        int[][] matriks2 = {
                {5,6},
                {7,8}
        };
        int hasil[][] = new int[2][2];
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
        for(int baris = 0; baris < 2; baris++){
            for(int kolom = 0; kolom < 2; kolom++){
                System.out.print(hasil[baris][kolom]+ " ");
            }
            System.out.println();
        }
    }
}

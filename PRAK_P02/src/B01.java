/*
TUGAS PRAKTIKUM PERTEMUAN KE-02
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM : 2113020008
Nama : Muhammad Fajrul Fahmi
Kelas : 2A
*/

import java.util.Scanner;
import java.util.ArrayList;

public class B01 {
    Scanner input = new Scanner(System.in);
    String[] namaBarang = {"Sepatu Niken    ", "Tas Punggung Altos", "Celana Jeans Lepis", "Kemeja Cardinal xi", "Dasi Platinum Class", "Jas Basic Suit     ", "Kaos Cottonology", "Celana Jogger Jumbo", "Topi Stone Island", "Jam Tangan Biden"};
    int[] hargaBarang = {200000, 150000, 250000, 416000, 200000, 300000, 150000, 150000, 129000, 520000};
    int[] stokBarang = {10, 10, 10, 20, 45, 35, 22, 80, 0, 10};

    private String getNamaBarang(int i) {
        return namaBarang[i];
    }

    private int getHargaBarang(int i) {
        return hargaBarang[i];
    }

    private int getStokBarang(int i) {
        return stokBarang[i];
    }

    private void ubahStokBarang(int i, int banyak) {
        stokBarang[i] = stokBarang[i]-banyak;
    }

    private void showInfoBarang(int i) {
        System.out.println("=============================");
        System.out.println("Nama  : " + getNamaBarang(i));
        System.out.println("Harga : " + getHargaBarang(i));
        System.out.println("Stok  : " + getStokBarang(i));
        System.out.println("=============================");
    }


    private void showMenu() {
        System.out.println("=======================");
        System.out.print("   = TOKO MATAHERI = " + "\n=======================" + "\n1. " + getNamaBarang(0) + "\n2. " + getNamaBarang(1) + "\n3. " + getNamaBarang(2) + "\n4. " + getNamaBarang(3) + "\n5. " + getNamaBarang(4) + "\n6. " + getNamaBarang(5) + "\n7. " + getNamaBarang(6) + "\n8. " + getNamaBarang(7) + "\n9. " + getNamaBarang(8) + "\n10. " + getNamaBarang(9) + "\n");
        System.out.println("Lainnya keluar");
        System.out.println("=======================");
        System.out.print("\n*Maksimal barang \nyang dibeli adalah 3");
    }


    private int jualan(int i, int banyak) {
        int total = (banyak * getHargaBarang(i));
        ubahStokBarang(i, banyak);
        return total;
    }

    private void hitung(int total) {
        int uang, disc;
        System.out.println("\nTotal\t\t\t\t\t\t: Rp. " + total);
        if (total > 1000000) {
            disc = total * 5 / 100;
            total -= disc;
            System.out.println("Mendapatkan diskon 5%\t\t: Rp. " + disc);
            System.out.println("Total transaksi\t\t\t\t: Rp. " + total);
        }
        System.out.print("Uang yang dibayarkan \t\t: Rp. ");
        uang = input.nextInt();
        if (uang < total) {
            System.out.println("*Uang yang dibayarkan tidak mencukupi");
        } else {
            if (uang == total) {
                System.out.println();
            } else {
                System.out.println("Uang kembalian\t\t\t\t: Rp. " + (uang - total));
            }
        }
    }

    public B01() {
        ArrayList<Integer> bBarang = new ArrayList<Integer>();
        ArrayList<String> nBarang = new ArrayList<String>();
        ArrayList<Integer> jumBarang = new ArrayList<Integer>();
        ArrayList<Integer> pill = new ArrayList<Integer>();
        int pil, banyak, jBarang, total = 0;

        showMenu();
        do {
            System.out.print("\nMasukkan Jumlah barang : ");
            jBarang = input.nextInt();
        }while(jBarang > 3);

            for (int j = 0; j < jBarang; j++) {
                do {
                    System.out.println("\n*Maksimal nomor barang 10");
                    System.out.print("Masukkan nomor Barang : ");
                    pil = input.nextInt();
                } while (pil > 10);
                pil--;
                if (stokBarang[pil] == 0) {
                    System.out.println("*Maaf, barang sudah habis.");
                    showInfoBarang(pil);

                } else {
                    showInfoBarang(pil);
                    System.out.print("Beli berapa :  ");
                    banyak = input.nextInt();

                    if (banyak < 0) {
                        System.out.println("*Stok barang tidak boleh kurang dari 0.");
                        break;

                    } else if (banyak > getStokBarang(pil)) {
                        System.out.println("*Stok barang tidak mencukupi.");

                    } else {
                        total += jualan(pil, banyak);
                        bBarang.add(banyak);
                        nBarang.add(getNamaBarang(pil));
                        jumBarang.add(total);
                        pill.add(pil);
                    }
                }
            }

        if (total > 0) {
            System.out.println("=============================");
            System.out.println("\nJUMLAH     NAMA BARANG\t\t   HARGA SATUAN     HARGA TOTAL \t\t");
            for (int i = 0; i < bBarang.size(); i++) {
                System.out.print(" " + bBarang.get(i) + "\t\t");
                System.out.print(nBarang.get(i) + "\t\t");
                System.out.print("Rp. " + getHargaBarang(pill.get(i)) + "\t\t");
                System.out.print("Rp. " + (bBarang.get(i) * getHargaBarang(pill.get(i))) + "\t\t\n");
            }
            hitung(total);
        }
        System.out.println("\n = Toko Tutup = ");
    }

    public static void main(String[] args) {
        new B01();
    }
}

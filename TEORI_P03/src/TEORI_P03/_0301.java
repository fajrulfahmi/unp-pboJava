/*
TUGAS PERTEMUAN KE-03
PEMROGRAMAN BERORIENTASI OBJEK, GANJIL 2022/2023
NPM : 2113020008
Nama : Muhammad Fajrul Fahmi
Kelompok : 6
Kelas : 2A
*/

package TEORI_P03;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _0301 {
    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            System.out.println("\n==========================");
            System.out.println("      DATA HANDPHONE");
            System.out.println("==========================");
            System.out.println("1.\tTAMBAH DATA HANDPHONE");
            System.out.println("2.\tLIHAT DATA HANDPHONE");
            System.out.println("==========================");

            System.out.print("Pilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n===================");
                    System.out.println("TAMBAH DATA HANDPHONE");
                    System.out.println("=====================");
                    createData();
                    break;
                case "2":
                    System.out.println("\n===============================================================================================");
                    System.out.println("                                    LIST DATA HANDPHONE");
                    System.out.println("===============================================================================================");
                    readData();
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-2]");
            }
            isLanjutkan = choice("Apakah Anda ingin melanjutkan");
        }
    }

    private static void readData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("databases.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan menambahkan data terlebih dahulu");
            return;
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("| No |\t Kode Handphone |\t  Nama Handphone    |\tSize(RAM/ROM)  |\t  Harga      |\tStok  |");
        System.out.println("-----------------------------------------------------------------------------------------------");
        String data = bufferInput.readLine();
        int nomorData = 0;
        while (data != null) {
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            System.out.printf("| %d  ", nomorData);
            System.out.printf("|\t\t %s \t\t", stringToken.nextToken());
            System.out.printf("|\t%-20s", stringToken.nextToken());
            System.out.printf("|\t  %-13s", stringToken.nextToken());
            System.out.printf("|\t%s      ", stringToken.nextToken());
            System.out.printf("|\t%s    ", stringToken.nextToken());
            System.out.print("|\n");

            data = bufferInput.readLine();
        }

        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    private static void createData() throws IOException {

        FileWriter fileOutput = new FileWriter("databases.txt", true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);


        // mengambil input dari user
        Scanner Input = new Scanner(System.in);
        String kode, nama, size, harga, stok;

        System.out.print("Masukkan kode Handphone: ");
        kode = Input.nextLine();
        System.out.print("Masukkan nama Handphone: ");
        nama = Input.nextLine();
        System.out.print("Masukkan size(RAM/ROM) Handphone: ");
        size = Input.nextLine();
        System.out.print("Masukkan harga Handphone: ");
        harga = Input.nextLine();
        System.out.print("Masukkan stok Handphone : ");
        stok = Input.nextLine();


        String ckode = kode.replaceAll("\\s+", "");

        bufferOutput.write("," + kode + "," + nama + "," + size + "," + harga + "," + stok);
        bufferOutput.newLine();
        bufferOutput.flush();
    }

    private static boolean choice(String message) {
        Scanner Input = new Scanner(System.in);
        System.out.print("\n" + message + " (y/n)? ");
        String pilihan = Input.next();

        while (!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n" + message + " (y/n)? ");
            pilihan = Input.next();
        }

        return pilihan.equalsIgnoreCase("y");
    }
}

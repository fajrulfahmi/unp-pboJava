import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TOTAL, disc, hasil;

        System.out.print("Masukkan total harga : ");
        TOTAL = input.nextInt();
        if(TOTAL >= 500000){
            disc = TOTAL * 5 / 100;
            hasil = TOTAL - disc;
            System.out.println("Harga Awal   : " + TOTAL);
            System.out.println("Total Diskon : " + disc);
            System.out.println("Total Harga  : " + hasil);
        }else{
            System.out.println("Total Harga  : " + TOTAL);
        }
    }
}

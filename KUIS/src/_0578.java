import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _0578 {
    public static void main(String[] args) {
        ArrayList<Integer> com = new ArrayList<Integer>();
        ArrayList<Integer> player = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //Komputer
        for (int i = 0; i < 3; i++) {
            com.add(random.nextInt(3) + 1);
        }

        //Player
        System.out.println("*Tebak Kombinasi 3 digit angka 1, 2, 3.");
        System.out.print("Player   : ");
        int m = input.nextInt();
        String number = String.valueOf(m);

        for (int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            player.add(j);
        }

        //Tampilkan hasil Komputer
        System.out.print("Komputer : ");
        for (int i = 0; i < 3; i++) {
            System.out.print(com.get(i));
        }

        //Hasil
        System.out.print("\nHasil    : ");
        for (int k = 0; k < 3; k++) {
            if(com.get(k) == player.get(k)){
                System.out.print("V");
            }else{
                System.out.print("X");
            }
        }
    }
}

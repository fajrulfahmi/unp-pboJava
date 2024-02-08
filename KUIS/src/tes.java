import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class tes {
    public static void main(String[] args) throws IOException {
        int tinggi, setengahTinggi;
        String input;
        System.out.println("Masukkan tinggi:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        tinggi = Integer.parseInt(input);
        int l = 1;
        if (tinggi%2 == 0) {
            setengahTinggi = tinggi/2;
            for (int i = 0; i < setengahTinggi; i++) {
                for (int j = setengahTinggi; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= l; k++) {
                    if (k == 1 || k == l) {
                        System.out.print("o");
                    } else {
                        System.out.print(" ");
                    }
                }
                l += 2;
                System.out.println();
            }
            l -= 2;
            for (int i = 0; i < setengahTinggi; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = l; j > 0; j--) {
                    if (j == 1 || j == l) {
                        System.out.print("o");
                    } else {
                        System.out.print(" ");
                    }
                }
                l -= 2;
                System.out.println();
            }
        } else {
            setengahTinggi = (tinggi / 2);
            for (int i = 0; i < setengahTinggi; i++) {
                for (int j = setengahTinggi; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= l; k++) {
                    if (k == 1 || k == l) {
                        System.out.print("o");
                    } else {
                        System.out.print(" ");
                    }
                }
                l += 2;
                System.out.println();
            }
            for (int i = 0; i < tinggi-setengahTinggi; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = l; j > 0; j--) {
                    if (j == l || j == 1) {
                        System.out.print("o");
                    } else {
                        System.out.print(" ");
                    }
                }
                l -= 2;
                System.out.println();
            }
        }
    }
}

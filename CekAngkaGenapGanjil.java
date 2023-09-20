import java.util.Scanner;

public class CekAngkaGenapGanjil {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int angka;
            
            while (true) {
                System.out.print("Masukkan angka bulat (0 untuk keluar): ");
                angka = input.nextInt();
                
                if (angka == 0) {
                    System.out.println("Terima kasih! Program berakhir.");
                    break; // Keluar dari loop jika pengguna memasukkan 0
                } else if (angka % 2 == 0) {
                    System.out.println("Angka genap.");
                } else {
                    System.out.println("Angka ganjil.");
                }
            }
        }
    }
}

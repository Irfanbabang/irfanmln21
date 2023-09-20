import java.util.Scanner;

public class HitungLuasSegitiga {
    public static void main(String[] args) {
        // Deklarasi variabel untuk panjang alas dan tinggi segitiga
        double alas, tinggi;

        // Meminta pengguna memasukkan panjang alas
        try ( // Membuat objek Scanner untuk menerima input dari pengguna
                Scanner input = new Scanner(System.in)) {
            // Meminta pengguna memasukkan panjang alas
            System.out.print("Masukkan panjang alas segitiga: ");
            alas = input.nextDouble();
            
            // Meminta pengguna memasukkan tinggi segitiga
            System.out.print("Masukkan tinggi segitiga: ");
            tinggi = input.nextDouble();
            
            // Menghitung luas segitiga
            double luas = 0.5 * alas * tinggi;
            
            // Menampilkan hasil perhitungan
            System.out.println("Luas segitiga adalah: " + luas);
            
            // Menutup objek Scanner
        }
    }
}

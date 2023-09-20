import java.util.Scanner;

public class OperasiAritmatika {
    public static void main(String[] args) {
        // Meminta pengguna memasukkan dua angka bulat
        try ( // Membuat objek Scanner untuk menerima input dari pengguna
                Scanner input = new Scanner(System.in)) {
            // Meminta pengguna memasukkan dua angka bulat
            System.out.print("Masukkan angka pertama: ");
            int angka1 = input.nextInt();
            
            System.out.print("Masukkan angka kedua: ");
            int angka2 = input.nextInt();
            
            // Melakukan operasi penjumlahan
            int hasilPenjumlahan = angka1 + angka2;
            System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
            
            // Melakukan operasi pengurangan
            int hasilPengurangan = angka1 - angka2;
            System.out.println("Hasil pengurangan: " + hasilPengurangan);
            
            // Melakukan operasi perkalian
            int hasilPerkalian = angka1 * angka2;
            System.out.println("Hasil perkalian: " + hasilPerkalian);
            
            // Melakukan operasi pembagian
            // Pastikan angka2 bukan nol untuk menghindari pembagian dengan nol
            if (angka2 != 0) {
                double hasilPembagian = (double) angka1 / angka2;
                System.out.println("Hasil pembagian: " + hasilPembagian);
            } else {
                System.out.println("Tidak dapat melakukan pembagian karena angka kedua adalah nol.");
            }
            
            // Menutup objek Scanner
        }
    }
}

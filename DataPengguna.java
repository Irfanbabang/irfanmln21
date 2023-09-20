import java.util.Scanner;

public class DataPengguna {
    public static void main(String[] args) {
        // Meminta pengguna memasukkan nama
        try ( // Membuat objek Scanner untuk menerima input dari pengguna
                Scanner input = new Scanner(System.in)) {
            // Meminta pengguna memasukkan nama
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            
            // Meminta pengguna memasukkan usia
            System.out.print("Masukkan usia: ");
            int usia = input.nextInt();
            
            // Meminta pengguna memasukkan tinggi badan
            System.out.print("Masukkan tinggi badan (dalam cm): ");
            double tinggiBadan = input.nextDouble();
            
            // Menampilkan data yang dimasukkan oleh pengguna
            System.out.println("Data yang Anda masukkan:");
            System.out.println("Nama: " + nama);
            System.out.println("Usia: " + usia + " tahun");
            System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
            
            // Menutup objek Scanner
        }
    }
}


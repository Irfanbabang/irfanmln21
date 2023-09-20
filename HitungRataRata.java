import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            boolean lanjut = true;
            
            while (lanjut) {
                int total = 0;
                int jumlahAngka = 0;
                
                System.out.println("Masukkan serangkaian angka untuk dihitung rata-ratanya.");
                
                while (true) {
                    try {
                        System.out.print("Masukkan angka (0 untuk selesai): ");
                        int angka = input.nextInt();
                        
                        if (angka == 0) {
                            break; // Keluar dari loop jika pengguna memasukkan 0
                        }
                        
                        total += angka;
                        jumlahAngka++;
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Input tidak valid. Harap masukkan angka bulat.");
                        input.nextLine(); // Membersihkan buffer input
                    }
                }
                
                if (jumlahAngka > 0) {
                    double rataRata = (double) total / jumlahAngka;
                    System.out.println("Rata-rata dari angka-angka yang dimasukkan adalah: " + rataRata);
                } else {
                    System.out.println("Tidak ada angka yang dimasukkan.");
                }
                
                // Pilihan lanjut atau keluar
                System.out.print("Apakah Anda ingin melanjutkan (y/n)? ");
                String jawaban = input.next();
                if (!jawaban.toLowerCase().equals("y")) {
                    lanjut = false;
                }
            }
            
            System.out.println("Terima kasih! Program berakhir.");
        }
    }
}

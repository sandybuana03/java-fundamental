import java.util.Scanner;

public class NilaiSentinel {
    public static void main(String[] args) {
        // Membuat fungsi Scanner
        Scanner masukan = new Scanner(System.in);
        
        
        System.out.println("Program akan berhenti jika memasukkan angka integer = 0");
        System.out.println("--------------------------------");
        
        // Membaca data inisiasi
        System.out.print("Masukkan suatu angka integer = ");
        int angka = masukan.nextInt();
        
        int jumlah = 0;
        
        // Tetap menjalankan sampai masukkan adalah 0
        while (angka != 0) {
            jumlah += angka;
            
            // Menampilkan data selanjutnya
            System.out.print("Masukkan suatu angka integer = ");
            angka = masukan.nextInt();
        } // tutup while
        
        System.out.println("--------------------------------");
        System.out.println("Jumlah Keseluruhan = " + jumlah);
    }
}

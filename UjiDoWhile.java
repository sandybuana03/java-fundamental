import java.util.Scanner;

public class UjiDoWhile {
    public static void main(String[] args) {
        int angka;
        int jumlah = 0;
        
        // Membuat objek Scanner
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Program akan berhenti jika memasukkan angka integer = 0");
        System.out.println("--------------------------------");
        
        // Tetap menjalankan sampai masukkan adalah 0
        do {
            // Menampilkan data selanjutnya
            System.out.print("Masukkan suatu angka integer = ");
            angka = masukan.nextInt();
            
            jumlah += angka;
        } while (angka != 0);
        
        System.out.println("--------------------------------");
        System.out.println("Jumlah Keseluruhan = " + jumlah);
    }
}

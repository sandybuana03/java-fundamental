import java.util.Scanner;

public class TahunLeap {
    public static void main(String[] args) {
        // Menciptakan Scanner
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukkan suatu tahun = ");
        int tahun = masukan.nextInt(); //simpan nilai tahun
        
        // Memeriksa apakah tahun leap atau bukan
        // 1. Tahun leap dapat dibagi 4 tanpa sisa
        // 2. Tahun leap dapat dibagi 4 tanpa sisa tetapi bukan oleh 100
        // 3. Tahun leap dapat dibagi 4 tanpa sisa tetapi bukan oleh 100 atau bisa dibagi oleh 400
        boolean apaTahunLeap = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
        
        // Tampil hasil
        System.out.println(tahun + " apakah tahun leap? " + apaTahunLeap);
    }
}

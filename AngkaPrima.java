import java.util.Scanner;

public class AngkaPrima {
    public static void main(String[] args){
        // Menampilkan angka prima sebanyak 10 untuk satu baris
        final int JUMLAH_PRIMA_PER_BARIS = 10;
        
        // Menghitung jumlah angka prima untuk baris
        int hitung = 0;
        
        // angka yang akan diuji keprimaannya
        int angka = 2;
        
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan berapa angka prima yang ingin ditampilkan = ");
        final int JUMLAH_PRIMA = masukan.nextInt();
        
        // secara berulang mencari angka-angka prima
        while (hitung < JUMLAH_PRIMA) {
            // asumsikan angka adalah prima
            boolean apaPrima = true;
            
            // Menguji apakah suatu angka prima atau tidak
            for (int pembagi = 2; pembagi <= angka / 2; pembagi++) { 
                if (angka % pembagi == 0) { // jika angka tidak prima
                    apaPrima = false; // apaPrima bernilai false
                    break; // keluar loop
                }
            }
            
            // menampilkan angka prima dan menambah hitung
            if (apaPrima) { // jika true
                hitung++; // inkremen hitung
                
                if (hitung % JUMLAH_PRIMA_PER_BARIS == 0) {
                    // menampilkan angka prima dan ganti baris
                    System.out.println(angka);
                }
                
                else
                    System.out.print(angka + " ");
            }
            
            // periksa apakah angka berikutnya adalah prima
            angka++; // inkremen angka
            
        } // tutup while
    }
}

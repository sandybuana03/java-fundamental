import java.util.Scanner;

public class PanahSegitigaInput {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Bintang Tengah = ");
        int baris = masukan.nextInt();
        int baris2 = baris-1;
        
        // for pertama 
        for (int i = 1; i <= baris; i++) { //loop A, akan dieksekusi mengikuti nilai baris
             for (int j = 1; j <= i; j++) { // loop B, dieksekusi mengikuti kondisinya
                 System.out.print("*");     
             } // tutup loop B
             System.out.print("\n"); // ikut loop A
         }   // tutup loop A

        // for kedua
        for (int x = 1; x <= baris2; x++) { // loop C
             for (int y = baris2; y >= x; y--) { // loop D
                 System.out.print("*"); 
             } // tutup loop C
             System.out.print("\n");
         }  // tutup loop D
    }
}

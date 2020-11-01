import java.util.Scanner;

public class PanahSegitigaInput {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Baris Bintang = ");
        int baris = masukan.nextInt();
        
       
       for (int i = 1; i < baris; i++) { //loop A, akan dieksekusi mengikuti nilai baris
            for (int j = 1; j <= i; j++) { // loop B, dieksekusi mengikuti kondisinya
                System.out.print("*");     
            } // tutup loop B
            System.out.print("\n"); // ikut loop A
        }   // tutup loop A
       
    }
}

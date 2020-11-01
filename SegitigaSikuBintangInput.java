import java.util.Scanner;

public class SegitigaSikuBintangInput {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Bintang Tengah = ");
        int baris = masukan.nextInt();
        int baris2 = baris-1;
        
       
       for (int i = 1; i <= baris; i++) { //loop A, akan dieksekusi mengikuti nilai baris
            for (int j = 1; j <= i; j++) { // loop B, dieksekusi mengikuti kondisinya
                System.out.print("*");     
            } // tutup loop B
            System.out.print("\n"); // ikut loop A
        }   // tutup loop A
       

        for (int x = 1; x <= baris2; x++) { 
            for (int y = baris2; y >= x; y--) { 
                System.out.print("*"); 
            } // tutup loop B
            System.out.print("\n");
        }  // tutup loop A
        
    }
}

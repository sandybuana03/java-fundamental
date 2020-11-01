public class SegitigaSikuBintang {
    public static void main(String[] args) {
       // Bintang kecil ke besar (1 ke 5) Rata Kiri
       for (int i = 1; i < 6; i++) { //loop A, akan dieksekusi 5x (i < 6)
            for (int j = 1; j <= i; j++) { // loop B, dieksekusi mengikuti kondisinya
                System.out.print("*");     // eksekusi loop A 1x != eksekusi loop B
            } // tutup loop B
            System.out.print("\n"); // ikut loop A, eksekusi 5x
        }   // tutup loop A
    }
}

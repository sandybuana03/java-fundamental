public class LoopForNested {
    public static void main(String[] args) {
       // Bintang kecil ke besar (1 ke 5) Rata Kiri
       for (int i = 1; i < 6; i++) { //loop A, akan dieksekusi 5x (i < 6)
            for (int j = 1; j <= i; j++) { // loop B, dieksekusi mengikuti kondisinya
                System.out.print("*");     // eksekusi loop A 1x != eksekusi loop B
            } // tutup loop B
            System.out.print("\n"); // ikut loop A, eksekusi 5x
        }   // tutup loop A
       
       
        System.out.println("------");
       
        
        // Bintang besar ke kecil (5 ke 1) Rata Kiri
        for (int x = 1; x < 6; x++) { //loop A, akan dieksekusi 5x (i < 6)
            for (int y = 5; y >= x; y--) { // loop B, perulangan loop A pertama x bernilai 1 (y >= x) dan y =5
                System.out.print("*"); // perulangan loop A pertama jalan 5x kemudian turun
            } // tutup loop B
            System.out.print("\n"); // ikut loop A, eksekusi 5x
        }  // tutup loop A
       
        
        System.out.println("------"); 
       
        
        // Bintang kecil ke besar (1 ke 5) Rata Kanan
        for (int b = 1; b < 6; b++) { // loop A, eksekusi dilakukan 5x
            for (int c = 4; c >= b; c--) { // loop B, perulangan pertama, nilai b = 1 (c >= b) dan c = 4
                System.out.print(" "); // perulangan loop A pertama jalan 4x kemudian turun
            } // tutup loop B
            for (int d = 1; d <= b; d++) { // loop C, perulangan pertama, nilai b = 1 (d <= b) dan d = 1
                System.out.print("*"); // perulangan loop A pertama jalan 1x kemudian naik
            } // tutup loop C
            System.out.println(); // ikut loop A, eksekusi 5x
        } // tutup loop A
        
        
        System.out.println("------"); 
       
        
        // Bintang besar ke kecil (5 ke 1) Rata Kanan
        int k = 5;
        for (int l = 0; l < k; l++) { // loop A, eksekusi dilakukan 5x
            for (int m = 0; m < l; m++) { // loop B, perulangan pertama, nilai l = 0 tidak jalan
                System.out.print(" "); //
            } // tutup loop B
            int n = k - l;
            for (int o = 0; o < n; o++) { // loop C
                System.out.print("*"); 
            } // tutup loop C
            System.out.println(); 
        } // tutup loop A
    }
}

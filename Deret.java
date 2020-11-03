public class Deret {
    public static void main(String[] args) {
        // menginisialisasi jumlah
        double jumlah = 0;
        
        System.out.print("Diketahui Deret = ");
        //tampilkan deret dan tambahkan 1 2 3 4 5 6 7 8 9 10 ke jumlah
        for (double i = 1; i <= 10; i++) {
            System.out.print((int)i + " ");
            jumlah += i;
        } // tutup for
        
        //Tampilkan hasil
        System.out.println("\nJumlah dari deret = " + (int)jumlah);
    }
}

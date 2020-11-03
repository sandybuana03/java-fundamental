public class TabelPerkalian {
    public static void main(String[] args){
        // Kepala Tabel
        System.out.println("            Tabel Perkalian");
        
        // Judul Angka
        System.out.print("    ");
        for (int j = 1; j <= 9; j++)
            System.out.print("   " + j);
        
        System.out.println("\n_________________________________________");
        
        // Tubuh tabel
        for (int i = 1; i <= 9; i++) {
            System.out.print( i + " | ");
            for (int j = 1; j <= 9; j++) {
                // Tampil perkalian & ratakan
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

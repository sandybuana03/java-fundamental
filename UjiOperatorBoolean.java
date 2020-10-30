import java.util.Scanner;

public class UjiOperatorBoolean {
    public static void main(String[] args) {
        
        // Menciptakan suatu Scanner
        Scanner masukan = new Scanner(System.in);
        
        // Menerima masukan
        System.out.print("Masukkan suatu integer = ");
        int angka = masukan.nextInt();
        
        System.out.println("Apakah Angka " + angka);
        System.out.println("\tdapat dibagi oleh 2 dan 3 ? " + (angka % 2 == 0 && angka % 3 == 0));
        System.out.println("\tdapat dibagi oleh 2 atau 3 ? " + (angka % 2 == 0 || angka % 3 == 0));
        System.out.println("\tdapat dibagi oleh 2 atau 3, tetapi tidak keduanya? " + (angka % 2 == 0 ^ angka % 3 == 0));
        
    }
}

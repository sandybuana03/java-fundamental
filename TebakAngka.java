import java.util.Scanner;

public class TebakAngka {
    public static void main (String[] args) {
        // Mengatur angka acak untuk ditebak
        int angka = (int)(Math.random() * 101);
        
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Tebak suatu angka dari 0 sampai 100");
        
        int tebak = -1;
        while (tebak != angka) {
        
        // Meminta memasukkan tebakan
        System.out.print("Berikan Tebakan Anda = ");
        tebak = masukan.nextInt();
        
        if (tebak == angka)
            System.out.println("Tebakan Anda Benar, Angka Tebakan adalah " + angka);
        
        else if (tebak > angka)
            System.out.println("Tebakan Anda Terlalu Tinggi !");
        else
            System.out.println("Tebakan Anda Terlalu Rendah !");
        }// tutup while
    }
}

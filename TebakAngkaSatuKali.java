import java.util.Scanner;

public class TebakAngkaSatuKali {
    public static void main (String[] args) {
        // Mengatur angka acak untuk ditebak
        int angka = (int)(Math.random() * 101);
        
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Tebak suatu angka dari 0 sampai 100");
        
        // Meminta memasukkan tebakan
        System.out.print("Berikan Tebakan Anda = ");
        int tebak = masukan.nextInt();
        
        if (tebak == angka)
            System.out.println("Tebakan Anda Benar, Angka Tebakan adalah " + angka);
        
        else if (tebak > angka)
            System.out.println("Angka Tebakan = " + angka +"\nTebakan Anda Terlalu Tinggi !");
        else
            System.out.println("Angka Tebakan = " + angka +"\nTebakan Anda Terlalu Rendah !");
    }
}

import java.util.Scanner;

public class IfSederhana {
    public static void main (String[] args ) {
        
        Scanner masukkan = new Scanner(System.in); //membuat fungsi inputan
        
        System.out.print("Masukkan suatu angka = ");
        int angka = masukkan.nextInt(); //menyimpan nilai inputan
        
        if (angka % 2 != 0) //jika angka dibagi 2 sisa bukan 0
            System.out.println("Angka Tersebut Ganjil");
        
        if (angka % 2 == 0) //jika angka dibagi 2 sisa 0
            System.out.println("Angka Tersebut Genap");
        
    }
}

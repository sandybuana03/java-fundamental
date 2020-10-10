//Program menghitung nilai rata-rata
import java.util.Scanner; //mengimport scanner
public class HitungRataRata {
    public static void main(String[] args ) {
        //menciptakan objek scanner dengan nama input
        Scanner input = new Scanner(System.in);
        
        //Meminta pengguna memasukkan 3 angka
        System.out.println("Masukkan 3 angka");
        System.out.print("Masukkan angka 1 = ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka 2 = ");
        double angka2 = input.nextDouble();
        System.out.print("Masukkan angka 3 = ");
        double angka3 = input.nextDouble();
        
        //Rumus Hitung rata-rata
        double rata = (angka1 + angka2 + angka3)/3;
        
        //Tampilkan hasil
        System.out.println("Nilai rata-rata = " + rata);
    }
}

//Hitung luas lingkaran dengan inputan
//mengimport fungsi scanner dalam paket java.util
import java.util.Scanner;

public class LuasLingkaranInput {
    public static void main(String[] args) {
        
        //menciptakan objek scanner dengan nama simpaninput
        Scanner nyimpen = new Scanner(System.in);
        
        //Meminta untuk memasukkan nilai jari-jari
        System.out.print("Masukkan jari-jari = ");
        //menyimpan nilai masukan
        double r = nyimpen.nextDouble(); 
        
        //Rumus Hitung Luas Lingkaran
        double luas = 3.14 * r * r;
        
        //Tampilkan Hasil
        System.out.print("Luas lingkaran adalah = ");
        System.out.println(luas); //mengambil nilai luas
    }
}

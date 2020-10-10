import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);
        
        System.out.print("Masukkan Suhu Farenheit = ");
        double farenheit = simpan.nextDouble();
        
        //konversi menjadi celcius
        double celcius = (5.0 / 9) * (farenheit - 32);
        System.out.println("Farenheit " + farenheit + " adalah " + celcius + " dalam celcius");
    }
}

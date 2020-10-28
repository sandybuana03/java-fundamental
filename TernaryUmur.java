import java.util.Scanner;

public class TernaryUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Umur Anda = ");
        int umur = input.nextInt();
        
        System.out.println("-----------------------");
        
        String status = (umur < 5) ? "Balita" : (umur < 13) ? "Anak-Anak" : (umur < 18) ? "Remaja" : (umur < 35) ? "Dewasa" :"Tua";
        
        System.out.println("Umur Anda Adalah " + umur + " Tahun");
        System.out.println("Status Anda adalah " + status);
    }
}

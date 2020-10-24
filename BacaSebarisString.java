import java.util.Scanner;

public class BacaSebarisString {
    public static void main (String[] args ) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat : ");
        String kalimat = input.nextLine();
        
        System.out.println("------------------------------");
        System.out.println("Kalimat anda adalah : \n"  + kalimat);
    }
}

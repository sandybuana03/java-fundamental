import java.util.Scanner;

public class TampilString {
    public static void main (String[] args ) {
        int i = 1, j=2;
        System.out.println("hai " + i + j); //hai 12 karena string dieksekusi lebih dulu
        
        System.out.println("hai " +  (i + j)); //hai 3 karena (i + j) dieksekusi lebih dulu
        
        System.out.println("--------------------------------");
        
        Scanner masukkan = new Scanner(System.in);
        
        System.out.println("Masukkan 3 Kata !");
        
        System.out.print("Masukkan kata ke-1 = ");
        String k1 = masukkan.next();
        
        System.out.print("Masukkan kata ke-2 = ");
        String k2 = masukkan.next();
        
        System.out.print("Masukkan kata ke-3 = ");
        String k3 = masukkan.next();
        System.out.println("--------------------------------");
        System.out.println("Kata ke-1 adalah " + k1);
        System.out.println("Kata ke-2 adalah " + k2);
        System.out.println("Kata ke-3 adalah " + k3);
        System.out.println("--------------------------------");
        System.out.println(k1 + " " + k2 + " " + k3);
    }
}

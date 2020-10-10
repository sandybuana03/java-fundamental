import java.util.Scanner;
public class KonversiDetik {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        //meminta memasukkan nilai detik
        System.out.print("Masukkan nilai detik = ");
        int detik = input.nextInt();
        
        int menit = detik / 60;      //mencari nilai menit
        int sisaDetik = detik % 60;  //mencari sisa detik
        System.out.println(detik + " detik adalah " + menit + " menit dan " + sisaDetik + " detik");
    }
}

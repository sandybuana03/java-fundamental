import java.util.Scanner;

public class PajakPenjualan {
    public static void main(String[] args ){
        Scanner masukkan = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Pembelian = ");
        double jumlahBeli = masukkan.nextDouble();
        
        double pajak = jumlahBeli * 0.06;
        
        System.out.println("Pajak penjualan (6% dibulatkan) adalah " + (int)(pajak*100)/100);
    }
}
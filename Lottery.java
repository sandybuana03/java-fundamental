import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        // Menentukan suatu angka lottery acak
        int lottery = (int) (Math.random() * 100);
        
        // Meminta pengguna memasukkan tebakan
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan tebakan Anda (Dua digit) = ");
        int tebak = masukan.nextInt();
        
        // Mendapatkan Dua digit untuk lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;
        
        // Mendapatkan Digit dari tebakan
        int tebakDigit1 = tebak / 10;
        int tebakDigit2 = tebak % 10;
        
        System.out.println("Angka Lottery Adalah = " + lottery);
        
        // Periksa Tebakan
        if (tebak == lottery)
            System.out.println("Cocok dan Tepat : Anda Memenangkan Rp. 10.000");
        
        else if (tebakDigit1 == lotteryDigit1 && tebakDigit1 == lotteryDigit2)
            System.out.println("Digit Pertama Cocok dengan Semua Digit : Anda Memenangkan Rp. 7.500");
        
        else if (tebakDigit1 == lotteryDigit1 ||
                 tebakDigit1 == lotteryDigit2 ||
                 tebakDigit2 == lotteryDigit1 ||
                 tebakDigit2 == lotteryDigit2)
            System.out.println("Cocok Satu Digit : Anda Memenangkan Rp. 5.000");
        
        else
            System.out.println("Maaf, Tidak Ada yang Cocok");
    }
}

import java.util.Scanner;

public class TebakUltah {
    public static void main (String[] args) {
        
        //set 1
        String set1 =
                     " 1  3  5  7 \n" +
                     " 9 11 13 15 \n" +
                     "17 19 21 23 \n" +
                     "25 27 29 31 \n";
        
        //set 2
        String set2 =
                     " 2  3  6  7 \n" +
                     "10 11 14 15 \n" +
                     "15 19 22 23 \n" +
                     "26 27 30 31 \n";
        
        //set 3
        String set3 =
                     " 4  5  6  7 \n" +
                     "12 13 14 15 \n" +
                     "20 21 22 23 \n" +
                     "28 29 30 31 \n";
        
        //set 4
        String set4 =
                     " 8  9 10 11 \n" +
                     "12 13 14 15 \n" +
                     "24 25 26 27 \n" +
                     "28 29 30 31 \n";
        
        //set 5
        String set5 =
                     "16 17 18 19 \n" +
                     "20 21 22 23 \n" +
                     "24 25 26 27 \n" +
                     "28 29 30 31 \n";
        
        int tanggal = 0;
        
        //menciptakan Scanner
        Scanner masukan = new Scanner(System.in);
        
        //set 1
        //meminta pengguna memberikan jawaban
        System.out.print("Apakah Ultah Anda dalam Set 1 ?\n");
        System.out.print(set1);
        System.out.print("Masukkan 0 bila Tidak dan 1 bila Ya = ");
        int jawaban = masukan.nextInt();
        
        if (jawaban == 1)
            tanggal += 1;
        
        //set 2
        //meminta pengguna memberikan jawaban
        System.out.println("----------------------------------------");
        System.out.print("Apakah Ultah Anda dalam Set 2 ?\n");
        System.out.print(set2);
        System.out.print("Masukkan 0 bila Tidak dan 1 bila Ya = ");
        int jawaban2 = masukan.nextInt();
        
        if (jawaban2 == 1)
            tanggal += 2;
        
        //set 3
        //meminta pengguna memberikan jawaban
        System.out.println("----------------------------------------");
        System.out.print("Apakah Ultah Anda dalam Set 3 ?\n");
        System.out.print(set3);
        System.out.print("Masukkan 0 bila Tidak dan 1 bila Ya = ");
        int jawaban3 = masukan.nextInt();
        
        if (jawaban3 == 1)
            tanggal += 4;
        
        //set 4
        //meminta pengguna memberikan jawaban
        System.out.println("----------------------------------------");
        System.out.print("Apakah Ultah Anda dalam Set 4 ?\n");
        System.out.print(set4);
        System.out.print("Masukkan 0 bila Tidak dan 1 bila Ya = ");
        int jawaban4 = masukan.nextInt();
        
        if (jawaban4 == 1)
            tanggal += 8;
        
        //set 5
        //meminta pengguna memberikan jawaban
        System.out.println("----------------------------------------");
        System.out.print("Apakah Ultah Anda dalam Set 5 ?\n");
        System.out.print(set5);
        System.out.print("Masukkan 0 bila Tidak dan 1 bila Ya = ");
        int jawaban5 = masukan.nextInt();
        
        if (jawaban5 == 1)
            tanggal += 16;
        
        System.out.println("----------------------------------------");
        System.out.println("Tanggal Ulang Tahun Anda adalah " + tanggal);
    }
}

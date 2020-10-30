import java.util.Scanner;

public class HitungPajak {
    public static void main(String[] args) {
        
        // Membuat Scanner
        Scanner masukan = new Scanner(System.in);
        
        // Meminta pengguna memasukkan kategori
        System.out.print("Status Keluarga : \n" +
                           "0 = Belum Menikah \n" +
                           "1 = Menikah Tinggal Bersama Orangtua \n" +
                           "2 = Menikah Tinggal Terpisah Dengan Orangtua\n" +
                           "3 = Kepala Keluarga \n" +
                           "Masukkan Status Anda dalam Keluarga = ");
        
        // Menyimpan nilai status
        int status = masukan.nextInt();
        
        // Meminta memasukkan pendatapan pertahun
        System.out.print("Masukkan pendapatan anda dalam satu tahun (misal 100000000) = ");
        double pendapatan = masukan.nextDouble();
        
        // Hitung pajak
        double pajak = 0;
        
        // Menghitung Pajak Belum Menikah
        if (status == 0) {
            if (pendapatan <= 1000000)
                pajak = pendapatan * 0.10;
            else if(pendapatan <= 10000000)
                pajak = pendapatan * 0.12;
            else if(pendapatan <= 100000000)
                pajak = pendapatan * 0.15;
            else if(pendapatan <= 1000000000)
                pajak = pendapatan * 0.20;
            else
                pajak = pendapatan * 0.25;
        }
        
        // Menghitung Pajak Menikah Tinggal Bersama Orangtua
        else if (status == 1) {
            if (pendapatan <= 1000000)
                pajak = pendapatan * 0.07;
            else if(pendapatan <= 10000000)
                pajak = pendapatan * 0.09;
            else if(pendapatan <= 100000000)
                pajak = pendapatan * 0.11;
            else if(pendapatan <= 1000000000)
                pajak = pendapatan * 0.15;
            else
                pajak = pendapatan * 0.20;
        }
        
        // Menghitung Pajak Menikah Tinggal Terpisah
        else if (status == 2) {
            if (pendapatan <= 1000000)
                pajak = pendapatan * 0.11;
            else if(pendapatan <= 10000000)
                pajak = pendapatan * 0.13;
            else if(pendapatan <= 100000000)
                pajak = pendapatan * 0.16;
            else if(pendapatan <= 1000000000)
                pajak = pendapatan * 0.21;
            else
                pajak = pendapatan * 0.26;
        }
        
        // Menghitung Pajak Kepala Keluarga
        else if (status == 3) {
            if (pendapatan <= 1000000)
                pajak = pendapatan * 0.06;
            else if(pendapatan <= 10000000)
                pajak = pendapatan * 0.08;
            else if(pendapatan <= 100000000)
                pajak = pendapatan * 0.10;
            else if(pendapatan <= 1000000000)
                pajak = pendapatan * 0.14;
            else
                pajak = pendapatan * 0.18;
        }
        
        // Jika Memasukkan Pilihan Bukan 0 1 2 3
        else {
            System.out.println("-------------------------------------------------------");
            System.out.println("Maaf Anda Memasukkan Status Keluarga Yang Tidak Valid !");
            System.exit(0); // Menghentikan Program
        }
        
        // Tampilkan hasil
        System.out.println("-------------------------------------------------------");
        System.out.println("Pajak Anda Sebesar = Rp." + (int)(pajak * 100) / 100.0 + "/Tahun");
    }
}

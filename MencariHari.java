import java.util.Scanner;

public class MencariHari {
    public static void main (String [] args) {
        int hariIni, hariHitung, hariDepan;

        // Menciptakan Scanner
        Scanner simpanHari = new Scanner(System.in); 
        
        // Menampilkan pilihan hari
        System.out.println("Pilihan Hari :"); 
        System.out.println("1. Senin"); 
        System.out.println("2. Selasa"); 
        System.out.println("3. Rabu"); 
        System.out.println("4. Kamis"); 
        System.out.println("5. Jum'at"); 
        System.out.println("6. Sabtu"); 
        System.out.println("7. Minggu"); 
        System.out.println("------------------------------");
        
        // Meminta memasukkan pilihan hari
        System.out.print("Masukkan Hari Sekarang (Lihat Pilihan Angka 1 sampai 7) = "); 
        hariIni = simpanHari.nextInt(); // Simpan pilihan hari
        
        if (hariIni == 1 || 
            hariIni == 2 || 
            hariIni == 3 || 
            hariIni == 4 ||
            hariIni == 5 ||
            hariIni == 6 ||
            hariIni == 7) {
            
                // Meminta memasukkan jarak hari
                System.out.print("Masukkan Jarak Hari dari Hari Sekarang = "); 
                hariHitung = simpanHari.nextInt();  // Simpan jarak hari

                // Rumus mencari nama hari kedepan
                hariDepan = (hariIni+hariHitung)%7;

                // Berdasarkan rumus diatas :
                // 1. Cari tahu terlebih dahulu ada berapa total hari dari hari sekarang 
                //    total hari = hari ini + hari hitung 
                //    nilai dari hari ini sama dengan nilai angka yang ada pada pilihan 
                //    misal hari ini minggu maka hari ini bernilai 7
                // 2. dari total hari, lalu dibagi 7 (karena jumlah hari hanya ada 7) dan kemudian simpan sisanya
                //    dari sisa pembagian 7 itulah hari bisa ditentukan 
                // 3. Sisa pembagian 7 akan selalu menyisakan angka 0 1 2 3 4 5 6 (0 sebagai pengganti 7 karena [7 % 7] tidak ada sisa)
                // Dari sisa pembagian tersebut bisa diketahui harinya
                // Sisa 0 adalah hari minggu
                // Sisa 1 adalah hari senin
                // Sisa 2 adalah hari selasa
                // Sisa 3 adalah hari rabu
                // Sisa 4 adalah hari kamis
                // Sisa 5 adalah hari jum'at
                // Sisa 6 adalah hari sabtu

                switch (hariDepan) { 

                    case 0: //jika sisa hari 0
                        System.out.println(hariHitung + " Hari Kedepan adalah Minggu"); 
                        break; //pemisah

                    case 1: //jika sisa hari 1
                        System.out.println(hariHitung + " Hari Kedepan adalah Senin"); 
                        break; //pemisah

                    case 2: //jika sisa hari 2
                        System.out.println(hariHitung + " Hari Kedepan adalah Selasa"); 
                        break; //pemisah

                    case 3: //jika sisa hari 3
                        System.out.println(hariHitung + " Hari Kedepan adalah Rabu"); 
                        break; //pemisah

                    case 4: //jika sisa hari 4
                        System.out.println(hariHitung + " Hari Kedepan adalah Kamis"); 
                        break; //pemisah

                    case 5: //jika sisa hari 5
                        System.out.println(hariHitung + " Hari Kedepan adalah Jum'at"); 
                        break; //pemisah    

                    case 6: //jika sisa hari 6
                        System.out.println(hariHitung + " Hari Kedepan adalah Sabtu"); 
                        break; //pemisah

                    default: //jika sisa bukan 0 1 2 3 4 5 6
                        System.out.println("HARI TIDAK DIKETAHUI"); 
                } // tutup switch
        } // tutup if
        else
            System.out.println("ANGKA YANG DIMASUKKAN SALAH !!!");
    }
}

import java.util.Scanner;

public class LoopKuisPengurangan {
    public static void main(String[] args){
        int pertanyaan = 0; //hitung jumlah pertanyaan
        int jawabanBenar = 0; // hitung jumlah jawaban benar
        long waktuMulai = System.currentTimeMillis();
        String keluaran = "" ; //kosong
        
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Pertanyaan = ");
        final int JUMLAH_PERTANYAAN = masukan.nextInt();
        
        while (pertanyaan < JUMLAH_PERTANYAAN) {
            //1. Menentukan angka acak
            int angka1 = (int)(Math.random() * 101);
            int angka2 = (int)(Math.random() * 101);
            
            //2. jika angka1 < angka2 maka tukar angka
            if (angka1 < angka2) {
                int angkaTukar =angka1;
                angka1 = angka2;
                angka2 = angkaTukar;
            }
            
            //3. Meminta untuk menjawab
            System.out.println("\nBerapakah " + angka1 + " - " + angka2 + " ?");
            System.out.print("Jawab = ");
            int jawaban = masukan.nextInt();
            
            //4. Tampilkan hasil
            if (angka1 - angka2 == jawaban) {
                System.out.println("Anda Benar !");
                jawabanBenar++;
            }
            else {
                System.out.println("Jawaban Anda Salah !");
                System.out.println("Seharusnya " + (angka1-angka2));
            }
            
            //inkremen hitung
            pertanyaan++;
            
            keluaran += "\n" + angka1 + " - " + angka2 + " = " + jawaban +
                       ((angka1 - angka2 == jawaban) ? " Benar" : " Salah");
        } // tutup while
        
        long waktuAkhir = System.currentTimeMillis();
        long waktuUji = waktuAkhir - waktuMulai;
        
        System.out.println("------------------------------");
        System.out.println("Jumlah yang benar adalah " + jawabanBenar);
        System.out.println("Waktu Uji adalah " + waktuUji / 1000 + " detik");
        System.out.println(keluaran);
    }
}

import java.util.Scanner;

public class KuisPengurangan {
    public static void main(String[] args ) {
        // 1. Memunculkan dua integer satu digit, angka1 dan angka2
        int angka1 = (int)(Math.random() * 10);
        int angka2 = (int)(Math.random() * 10);
        
        // 2. jika angka1 < angka2, maka tukar angka1 dengan angka2
        if (angka1 < angka2) {
            int angkaSementara = angka1;
            angka1 = angka2;
            angka2 = angkaSementara;
        }
        
        // 3. Minta siswa untuk menjawab
        System.out.println("Berapakah " + angka1 + " - " + angka2 + " ?");
        System.out.print("Jawaban = ");
        Scanner masukkan = new Scanner(System.in);
        int jawaban = masukkan.nextInt();
        
        System.out.println("-------------------");
        
        // 4. Periksa jawaban dan tampilkan hasil
        if (angka1 - angka2 == jawaban)
            System.out.println("Jawaban Anda Benar !");
        
        else
            System.out.println("Jawaban Anda Salah !");
        
        // karena statemen if tidak memakai kurung kurawal, 
        // maka baris dibawah akan selalu muncul
            System.out.println(angka1 + " - " + angka2 + " = " + (angka1-angka2));
    }
}

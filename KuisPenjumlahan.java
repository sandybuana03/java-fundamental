import java.util.Scanner;

public class KuisPenjumlahan {
    public static void main (String[] args) {
        int angka1 = (int)(System.currentTimeMillis() % 10); //menentukan angka acak
        int angka2 = (int)(System.currentTimeMillis() * 7 % 10); //menentukan angka acak
        
        Scanner masukkanJawaban = new Scanner(System.in);
        
        System.out.println("Berapakah " + angka1 + " + " + angka2 + " ?");
        System.out.print("Jawaban Anda = ");
        int jawaban = masukkanJawaban.nextInt(); //menyimpan jawaban
        
        System.out.println("----------------------");
        
        //menampilkan jawaban yang benar
        System.out.println(angka1 + " + " + angka2 + " = " + (angka1+angka2));
        
        //jika jawaban benar
        if(angka1 + angka2 == jawaban){ 
            System.out.println("Jawaban Anda Benar !"); 
        } 
        
        //jika bukan / tidak benar
        else { 
            System.out.println("Jawaban Anda Salah !");
        }
    }
}

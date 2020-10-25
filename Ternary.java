import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        //contoh 1
        System.out.println("contoh 1");
        int suka = 10;
        String jawaban = (suka > 5) ? "iya" : "tidak";
        System.out.println(jawaban); //iya karena bernilai benar
        System.out.println("-----------------------------");
        
        //contoh 2
        System.out.println("contoh 2");
        int suka2 = 5;
        int jawaban2 = (suka2 > 5) ? suka+suka2 : suka-suka2;
        System.out.println(jawaban2); //5 karena bernilai salah
        System.out.println("-----------------------------");
        
        //contoh 3
        System.out.println("contoh 3");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");
        int bilangan = input.nextInt();
        String hasil = (bilangan % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(hasil);
    }
}

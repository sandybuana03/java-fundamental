import java.util.Scanner;

public class PilihJurusan {
    public static void main (String [] args) {
        int jurusan; //deklarasi variabel

        Scanner simpanPilihan = new Scanner(System.in); //membuat fungsi scanner dengan nama simpanPilihan
        
        System.out.println("Pilihan Jurusan :"); //output tulisan
        System.out.println("1. Rekayasa Perangkat Lunak"); //output tulisan
        System.out.println("2. Teknik Komputer & Jaringan"); //output tulisan
        System.out.println("3. Akutansi & Keuangan Lembaga"); //output tulisan
        System.out.println("------------------------------");
        
        System.out.print("Masukkan Pilihan Jurusan (Angka 1 2 3) = "); //meminta memasukkan angka
        jurusan = simpanPilihan.nextInt(); //menyimpan input pada variabel jurusan
        
        //tampil tulisan dan nilai inputan jurusan
        System.out.println("Anda memilih jurusan ke-" + jurusan);
       
        switch (jurusan) { //mencocokan nilai inputan jurusan dengan pilihan yang ada
            
            case 1: //jika inputan 1
                System.out.println("RPL"); //tampil RPL
                break; //pemisah
                
            case 2: //jika inputan 2
                System.out.println("TKJ"); //tampil TKJ
                break; //pemisah
                
            case 3: //jika inputan 3
                System.out.println("AKL"); //tampil AKL
                break; //pemisah
                
            default: //jika inputan bukan 1 / 2 / 3
                System.out.println("PILIHANMU TIDAK ADA !");
        }
    }
}

### PBO 11 RPL Senin 26-10-2020 sampai Jum'at 30.10.2020
## Ulangan Harian

- Baca buku paket halaman 50 tentang <b>Kontrol Switch</b>
- Cobalah koding java berikut pada aplikasi jedona / jvdroid

Kemudian dari kodingan dibawah sebagai contoh, tugas kalian adalah membuat program untuk menampilkan pilihan menu masakan
- pilihan 1 = Ayam Bakar
- pilihan 2 = Ayam Goreng
- pilihan 3 = Ayam Geprek

Misal :
<b><br>Anda memilih menu ke-1
<br>Ayam Bakar</b>

Upload screenshot kodingan ke google classroom 

Berikut contoh program untuk memilih jurusan :

```java

import java.util.Scanner;

public class cabanganSwitch {
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
        
        //tampil tulisankan dan nilai inputan jurusan
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
                System.out.println("PILIHANMU TIDAK ADA !"); //tampil jika input bukan 1 2 3
        }
    }
}

```

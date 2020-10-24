## Error Pemrograman

Error pemrograman tak bisa dihindari, meski untuk programmer yang berpengalaman. 
<br>error dapat dikategorikan menjadi tiga antara lain :

### 1. Error Sintaks

Error yang terjadi selama kompilasi disebut dengan error sintaks atau error kompilasi. Error sintaks berasal dari kesalahan selama kontruksi kode.
seperti kesalahan ketik, pengabaian beberapa tanda baca, atau kesalahan penggunaan kurung.
Error ini biasanya mudah dideteksi, karena kompiler akan memberitahu dimana dan apa yang menyebabkannya.
<br>
sebagai contoh, program berikut ini memiliki error kompilasi karena tidak menuliskan tipe data dari i :

```java

public class Error {
    public static void main (String[] args) {
        i = 30; //tidak menuliskan tipe data
        System.out.println(i + 4);
    }
}

```

### 2. Error Runtime

Error Runtime merupakan kesalahan yang menyebabkan program berhenti secara abnormal.
Hal ini terjadi pada saat program sedang berjalan dan kompiler mendeteksi suatu operasi yang tidak mungkin dilakukan.

Suatu error masukan terjadi ketika pengguna memasukkan nilai masukan yang tidak terduga dan tidak bisa diatasi oleh program.
Misalnya, jika program mengharapkan masukan suatu angka, tetapi pengguna malah memasukkan string, maka hal ini menyebabkan error masukkan.

Salah satu sumber error runtime adalah pembagian oleh nol.
hal ini terjadi bila divisor atau pembagi adalah nol. 
<br>
misalnya, program berikut akan menyebabkan error runtime :

```java

public class Error {
    public static void main (String[] args) {
        int i = 1/0;
        System.out.println(i);
    }
}

```

### 3. Error Logika

Error Logika terjadi bila suatu program tidak mengerjakan apa yang diperintahkan.
Error jenis ini terjadi karena berbagai alasan.
<br>
Sebagai contoh, dimisalkan anda menuliskan program untuk menambahkan angka1 dan angka2 :

```java

public class Error {
    public static void main (String[] args) {
        int angka1 = 3;
        int angka2 = 3;
        angka2 += angka1 + angka2;
        System.out.println("angka2 adalah " + angka2); //output 9
    }
}

```

program diatas tidak mempunyai error runtime maupun error sintaks, tetapi keluaran untuk angka2 sama sekali tidak tepat, karena seharusnya yang tampil adalah 6, bukan 9

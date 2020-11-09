# Statemen Switch

Pernyataan switch digunakan untuk memilih salah satu dari banyak blok kode yang akan dieksekusi..

Contoh Kodingan :

```java

switch(ekspresi) {
  case x:
    // blok kode
    break;
    
  case y:
    // blok kode
    break;
    
  default:
    // blok kode
}


```

Cara kerjanya:

- Ekspresi switch dievaluasi satu kali.
- Nilai ekspresi dibandingkan dengan nilai masing-masing case.
- Jika ada kecocokan, blok kode terkait dijalankan.
- Kata kunci break dan default bersifat opsional, dan akan dijelaskan nanti di bab ini


Contoh di bawah ini menggunakan angka dari hari untuk menampilkan nama hari :

```java

int hari = 4;
switch (hari) {
  case 1:
    System.out.println("Senin");
    break;
    
  case 2:
    System.out.println("Selasa");
    break;
    
  case 3:
    System.out.println("Rabu");
    break;
    
  case 4:
    System.out.println("Kamis");
    break;
    
  case 5:
    System.out.println("Jum'at");
    break;
    
  case 6:
    System.out.println("Sabtu");
    break;
    
  case 7:
    System.out.println("Minggu");
    break;
}
// Outputs "Kamis" (hari 4)

```

## Kata Kunci break

- Ketika Java mencapai kata kunci break, itu menghentikan jalannya blok switch.
- Ini akan menghentikan eksekusi.
- Ketika kecocokan ditemukan, dan pekerjaan selesai, saatnya break (berhenti). Tidak perlu eksekusi lebih lanjut.

## Kata Kunci default

- Kata kunci default menentukan beberapa kode untuk dijalankan jika tidak ada case yang cocok

contoh :

```java

int hari = 4;
switch (hari) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Hari ini tidak ada!");
}
// Outputs "Hari ini tidak ada!"

```



Perhatikan bahwa jika pernyataan default digunakan sebagai pernyataan terakhir dalam blok switch, itu tidak perlu menggunakan break.

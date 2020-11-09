# Perulangan For

- Saat Anda tahu persis berapa kali Anda ingin mengulang melalui satu blok kode, gunakanlah perulangan for sebagai ganti perulangan while.

Sintaks :

```java

for (pernyataan 1; pernyataan 2; pernyataan 3) {
  // kode blok untuk dieksekusi
}

```

- Pernyataan 1 dieksekusi (satu kali) sebelum eksekusi kode blok.
- Pernyataan 2 mendefinisikan kondisi untuk mengeksekusi kode blok.
- Pernyataan 3 dieksekusi (setiap kali) setelah kode blok dijalankan.

Contoh di bawah ini akan mencetak angka 0 sampai 4 :

```java

for (int i = 0; i < 5; i++) {
  System.out.println(i);
}

```

Penjelasan Contoh :

- Pernyataan 1 menetapkan variabel sebelum pengulangan dimulai (int i = 0).
- Pernyataan 2 mendefinisikan kondisi untuk menjalankan perulangan (i harus kurang dari 5). Jika kondisinya benar, perulangan akan dieksekusi lagi, jika salah, perulangan akan berakhir.
- Pernyataan 3 meningkatkan nilai (i ++) setiap kali kode blok dalam perulangan telah dijalankan.


Contoh lain

Contoh ini hanya akan mencetak nilai genap antara 0 dan 10 :

```java

for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}

```


## Perulangan For-Each

- Digunakan secara eksklusif untuk melakukan perulangan melalui elemen dalam larik (Array)

Sintaks :

```java

for (tipeData namaVariabel : namaArray) {
  // kode blok untuk dijalankan
}

```

Contoh berikut mengeluarkan semua elemen dalam larik mobil , menggunakan perulangan "For-Each":

```java

String[] mobil = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : mobil) {
  System.out.println(i);
}

```

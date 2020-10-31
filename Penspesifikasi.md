## Keluaran Konsol Terformat / Penspesifikasi

Jika ingin menampilkan hanya dua digit angka setelah titik desimal dari suatu nilai pecahan, mungkin biasa menuliskan kode seperti ini :

```java

double x = 2.0 / 3;
System.out.println("x sama dengan " + (int)(x * 100) / 100.0);

```

Akan tetapi, cara yang lebih baik untuk melakukan ini adalah dengan memformat keluaran menggunakan metode **printf**.
<br>
Sintaks untuk memanggil metode ini adalah :

```java

System.out.prinf(format, item1, item2, ..., itemN);

```

- di mana format adalah suatu string yang memuat substring dan penspesifikasi format.
- suatu penspesifikasi format menentukan bagaimana suatu item ditampilkan.
- suatu item bisa jadi suatu nilai numerik, karakter, boolean, atau string.
- suatu penspesifikasi sederhana mengandung suatu tanda persen (%) yang diikuti dengan suatu kode konvensi.
- berikut penspesifikasi sederhana yang sering dipakai :

| Penspesifikasi | Keluaran                 | Contoh       |
|----------------|--------------------------|--------------|
| %b             | Nilai Boolean            | true / false |
| %c             | Karakter                 | 'a'          |
| %d             | Integer                  | 210          |
| %f             | Pecahan                  | 34.569000    |
| %e             | Notasi Saintifik Standar | 3.4569e+01   |
| %s             | String                   | "AKU & KAMU" |


Contoh :

```java

int hitung = 5;
double jumlah = 45.56;
System.out.ptinf("hitung adalah %d dan jumlah adalah %f", hitung, jumlah); //%d = integer | %f = double

```

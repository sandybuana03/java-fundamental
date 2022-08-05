# Operator Java

- Secara singkat operator adalah sebuah perintah untuk melakukan aksi atau tindakan tertentu dalam pemrograman untuk menghasilkan sebuah nilai.

---

## Jenis Operator

### 1. Operator Aritmetika

- digunakan untuk operasi perhitungan matematika.
<table style="width:100%" border="1">
  <tr align="center">
    <th>Operator</th>
    <th>Pengertian</th> 
  </tr>
  <tr align="center">
    <td>+</td>
    <td>Penambahan</td>
  </tr>
  <tr align="center">
    <td>-</td>
    <td>Pengurangan</td>
  </tr>
   <tr align="center">
    <td>*</td>
    <td>Perkalian</td>
  </tr>
   <tr align="center">
    <td>/</td>
    <td>Pembagian</td>
  </tr>
   <tr align="center">
    <td>%</td>
    <td>Sisa Pembagian</td>
  </tr>
   <tr align="center">
    <td>++</td>
    <td>Penambahan 1 (increment)</td>
  </tr>
   <tr align="center">
    <td>--</td>
    <td>Pengurangan 1 (decrement)</td>
  </tr>
</table>

---

### 2. Operator Penugasan

- berfungsi memberikan tugas dalam menyimpan nilai pada variabel tertentu sebelum dioperasikan.
<table style="width:100%" border="1">
  <tr align="center">
    <th>Operator</th>
    <th>Pengertian</th> 
  </tr>
  <tr align="center">
    <td>=</td>
    <td>Pengisian nilai</td>
  </tr>
  <tr align="center">
    <td>+=</td>
    <td>Pengisian dan penambahan</td>
  </tr>
   <tr align="center">
    <td>-=</td>
    <td>Pengisian dan pengurangan</td>
  </tr>
   <tr align="center">
    <td>*=</td>
    <td>Pengisian dan perkalian</td>
  </tr>
   <tr align="center">
    <td>/=</td>
    <td>Pengisian dan pembagian</td>
  </tr>
   <tr align="center">
    <td>%=</td>
    <td>Pengisian dan sisa bagi</td>
  </tr>
</table>

---

### 3. Operator Pembanding

- dalam operator pembanding diperlukan dua variabel yang akan dibandingkan.
- nilai yang dibandingkan adalah angka, bukan huruf, dan hasil perbandingan tersebut bernilai boolean (true / false)
<table style="width:100%" border="1">
  <tr align="center">
    <th>Operator</th>
    <th>Pengertian</th> 
  </tr>
  <tr align="center">
    <td>></td>
    <td>Lebih besar</td>
  </tr>
  <tr align="center">
    <td><</td>
    <td>Lebih kecil</td>
  </tr>
   <tr align="center">
    <td>==</td>
    <td>Sama dengan</td>
  </tr>
   <tr align="center">
    <td>!=</td>
    <td>tidak sama dengan</td>
  </tr>
   <tr align="center">
    <td>>=</td>
    <td>Lebih besar sama dengan</td>
  </tr>
   <tr align="center">
    <td><=</td>
    <td>Kurang dari sama dengan</td>
  </tr>
</table>

---

### 4. Operator Logika / Boolean

- berfungsi hampir sama dengan operator pembanding, namun menggunakan 3 operator yaitu AND, OR, NOT.
<table style="width:100%" border="1">
  <tr align="center">
    <th>Operator</th>
    <th>Pengertian</th> 
  </tr>
  <tr align="center">
    <td>&&</td>
    <td>Logika AND</td>
  </tr>
  <tr align="center">
    <td>||</td>
    <td>Logika OR</td>
  </tr>
   <tr align="center">
    <td>!</td>
    <td>Negasi / Kebalikan</td>
  </tr>
</table>

---

### 5. Operator Bitwise

- digunakan untuk operasi bit (biner).
- dapat diterapkan pada tipe data integer, int, short, long, char, dan byte.
<table style="width:100%" border="1">
  <tr align="center">
    <th>Operator</th>
    <th>Pengertian</th> 
  </tr>
  <tr align="center">
    <td>&</td>
    <td>AND</td>
  </tr>
  <tr align="center">
    <td>|</td>
    <td>OR</td>
  </tr>
   <tr align="center">
    <td>^</td>
    <td>XOR</td>
  </tr>
  <tr align="center">
    <td>~</td>
    <td>Negasi / kebalikan</td>
  </tr>
  <tr align="center">
    <td><<</td>
    <td>Left Shift</td>
  </tr>
  <tr align="center">
    <td>>></td>
    <td>Right Shift</td>
  </tr>
  <tr align="center">
    <td>>>></td>
    <td>Right Shift dengan tambahan 0</td>
  </tr>
</table>

---

### 6. Operator Ternary

- operator yang memiliki 3 argumen.
- operator ini akan melakukan evaluasi boolean (true / false)
- evaluasi boolean akan menentukan nilai mana yang akan dikembalikan.
<br>
Berikut adalah cara penulisan operator ternary :

```java

Tipedata namaVariabel = (kondisi) ? nilai_jika_true : nilai_jika_false;

```

contoh :

```java

int suka = 10;

String jawaban = (suka > 5) ? "iya" : "tidak";

```

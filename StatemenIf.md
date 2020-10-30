# Statemen If

Java mempunyai beberapa tipe statemen seleksi :
- statemen if satu-arah
- statemen if dua-arah
- statemen if nested / bersarang
- statemen switch
- ekspresi kondisional

---

## Statemen If Satu-Arah

- Statemen if satu-arah mengeksekusi suatu aksi jika dan hanya jika kondisi adalah true.
- Sintaks statemen if satu-arah ditunjukkan seperti contoh berikut :

```java

if (ekspresi-boolean) {
    statemen-statemen;
   }

```

- Jika hasil terhadap ekspresi-boolean adalah true, maka statemen-statemen didalam blok dieksekusi
- Sebagai contoh perhatikan kode berikut :

```java

if (4 % 2 == 0) {
    System.out.println("Angka Tersebut Genap");
   }
   
```

---

## Statemen If Dua-Arah

- Suatu statemen if satu-arah melakukan aksi bila kondisi yang dispesifikasi bernilai true. jika kondisi tersebut bernilai false, tidak ada yang dilakukan.
- Tetapi bagaimana bila ada aksi alternatif bila kondisi bernilai false?
- Anda bisa menggunakan statemen if dua-arah.
- Aksi-aksi yang dispesifikasi oleh statemen if dua-arah berbeda berdasarkan nilai kondisi true atau false.
- Berikut adalah sintaks suatu statemen if dua-arah :

```java

if (ekspresi-boolean){ 
    statemen-statemen-untuk-kasus-true; 
   } 
   
else { 
      statemen-statemen-untuk-kasus-false; 
     }
     
```
- Jika hasil evaluasi terhadap ekspresi-boolean adalah true, maka statemen-statemen-untuk-kasus-true dieksekusi.
- Begitu pula sebaliknya, jika hasil evaluasi terhadap ekspresi-boolean adalah false, maka statemen-statemen-untuk-kasus-false dieksekusi
- Sebagai contoh perhatikan kode berikut :

```java
if (angka % 2 != 0){ 
    System.out.println("Angka Tersebut Ganjil"); 
   } 
        
else { 
      System.out.println("Angka Tersebut Genap");
     }
   
```

---

## Statemen If Nested / Bersarang

- Suatu statemen if dapat memuat if lainnya.
- Atau dengan kata lain, statemen if sebelah dalam dikatakan bersarang (Nested) di dalam statemen if sebelah luar.
- Sebagai contoh, berikut adalah suatu statemen if nested :

```java

if (i > k) {
   if (j > k)
      System.out.println("i dan j lebih besar dari k");
   }
   
else 
    System.out.println("i lebih rendah dari atau sama dengan k");

```

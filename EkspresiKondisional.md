## Ekspresi Kondisional / Ternary

Jika ingin menugaskan suatu nilai kepada suatu variabel yang dibatasi oleh beberapa batasan, misalnya statemen berikut ini menugaskan 1 kepada y jika x lebih besar dari 0, dan -1 kepada y jika x lebih dari atau sama dengan 0.

```java

if (x > 0)
    y = 1;
else
    y = -1;
    
```

Cara lain, bisa menggunakan suatu ekspresi kondisional / ternary untuk mendapatkan hasil yang sama;

```java

y = (x > 0) ? 1 : -1;

```

Ekspresi Kondisional dapat pula dipakai tanpa menggunakan statemen if secara eksplisit. Sintaksnya adalah sebagai berikut :

```java

ekspresi-boolean ? ekspresi1 : ekspresi2;

```

- Hasil dari ekspresi kondisional adalah ekspresi bila ekspresi-boolean bernilai true.
- Sebaliknya ekspresi2 bila ekspresi-boolean bernilai false


Dimisalkan jika ingin menugaskan suatu nilai yang lebih besar dengan rentang angka1 dan angka2 kepada maks. maka hanya perlu menuliskan suatu statemen menggunakan ekspresi berikut :

```java

maks = (angka1 > angka2) ? angka1 : angka2;

```


Contoh lain, statemen berikut ini menampilkan pesan "angka genap" bila angka adalah genap, dan sebaliknya menampilkan pesan "angka ganjil" :

```java

System.out.println((angka % 2 == 0) ? "angka genap" : "angka ganjil");

```

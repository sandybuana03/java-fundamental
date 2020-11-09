# Perulangan While

## Perulangan

- Perulangan dapat mengeksekusi satu blok kode selama kondisi tertentu tercapai.
- Perulangan berguna karena menghemat waktu, mengurangi kesalahan, dan membuat kode lebih mudah dibaca.

## Perulangan While

- Perulangan while menjalankan blok kode selama kondisi yang ditentukan bernilai true.

Sintaks :

```java

while (kondisi) {
  // blok kode untuk dieksekusi
}

```

Contoh :

```java

int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}

```

## Perulangan Do While

- Perulangan do while adalah varian dari perulangan while.
- perulangan ini akan mengeksekusi blok kode satu kali, sebelum memeriksa apakah kondisinya benar, maka akan mengulang loop selama kondisinya benar.


Sintaks :

```java

do {
  // kode blok untuk dieksekusi
}
while (kondisi);

```

- Contoh di bawah ini menggunakan perulangan do while.
- Perulangan akan selalu dijalankan setidaknya sekali, bahkan jika kondisinya salah, karena blok kode dijalankan sebelum kondisi diuji

```java

int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);


```


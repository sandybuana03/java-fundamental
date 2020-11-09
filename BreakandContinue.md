# Break dan Continue

## Break

- Anda telah mengetahui pernyataan break yang digunakan pada while. Itu digunakan untuk "menghentikan" sebuah pernyataan switch.
- Pernyataan break juga dapat digunakan untuk menghentikan perulangan.

Contoh berikut menghentikan perulangan ketika i sama dengan 4 :

```java

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}

```

## Continue

- Pernyataan continue menghancurkan satu iterasi (dalam perulangan), jika kondisi tertentu terjadi, dan berlanjut dengan iterasi berikutnya dalam lingkaran.

Contoh ini melewatkan nilai 4 :

```java

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}

```

## Break dan Continue pada Perulangan While

Anda dapat menggunakan break dan continue pada perulangan while :

Contoh Break :

```java

int i = 0;
while (i < 10) {
  System.out.println(i);
  i++;
  if (i == 4) {
    break;
  }
}

```

Contoh Continue :

```java

int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}

```

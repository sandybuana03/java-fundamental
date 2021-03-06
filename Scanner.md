#### Inputan (Scanner)

- Java menggunakan System.out untuk merujuk ke device output standar dan System.in ke device input standar.
- Secara default, device output adalah layar monitor, dan device input adalah keyboard.
- Untuk menghasilkan output pada konsol, hanya perlu menggunakan metode println untuk menampilkan suatu nilai primitif atau string.
- Masukkan (inputan) konsol tidak secara langsung didukung oleh java, tetapi bisa menggunakan kelas Scanner untuk menciptakan suatu objek dalam membaca masukkan dari System.in.

```java

import java.util.Scanner 

```

digunakan untuk mengimport method Scanner

---

```java

Scanner namaScanner = new Scanner(System.in);

```

digunakan untuk menciptakan objek Scanner

---

```java

tipeData namaVariabel = namaScanner.methodScanner();

```

digunakan untuk menggunakan objek Scanner

---

#### Berikut adalah metode-metode untuk objek scanner :

<table style="width:100%" border="1">
  <tr align="center">
    <th>Metode</th>
    <th>Penjelasan</th> 
  </tr>
  <tr align="center">
    <td>nextByte()</td>
    <td>Membaca suatu integer bertipe byte</td>
  </tr>
  <tr align="center">
    <td>nextShort()</td>
    <td>Membaca suatu integer bertipe short</td>
  </tr>
    <tr align="center">
    <td>nextInt()</td>
    <td>Membaca suatu integer bertipe int</td>
  </tr>
    <tr align="center">
    <td>nextLong()</td>
    <td>Membaca suatu integer bertipe long</td>
  </tr>
    <tr align="center">
    <td>nextFloat()</td>
    <td>Membaca suatu angka bertipe float</td>
  </tr>
    <tr align="center">
    <td>nextDouble()</td>
    <td>Membaca suatu angka bertipe double</td>
  </tr>
    <tr align="center">
    <td>next()</td>
    <td>Membaca suatu string yang berakhir dengan karakter spasi putih</td>
  </tr>
    <tr align="center">
    <td>nextLine()</td>
    <td>Membaca sebaris teks (suatu string yang berakhir dengan enter)</td>
  </tr>
</table>

---

#### Contoh

```java

import java.util.Scanner;

public class BacaSebarisString {
    public static void main (String[] args ) {

        // Menciptakan objek Scanner dengan nama simpan
        Scanner simpan = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat : ");

        // Menyimpan inputan pada variabel kalimat 
        String kalimat = simpan.nextLine(); 

        System.out.println("------------------------------");
        System.out.println("Kalimat anda adalah : \n"  + kalimat);
    }
}

```

## Tipe Data Java

Seperti yang dijelaskan pada pembahasan variabel, variabel di Java harus berupa tipe data yang ditentukan:

Contoh :

```java

int angka1 = 5;               // Integer (whole number)
float angka2 = 5.99f;         // Floating point number
char huruf = 'D';             // Character
boolean myBool = true;        // Boolean
String myText = "Hello";      // String

```

Tipe data dibagi menjadi dua kelompok:
- Tipe data primitif : byte, short, int, long, float, double, boolean, char
- Tipe data non-primitif : String , Array , Class


### Tipe Data Primitif

Tipe data primitif menentukan ukuran dan tipe nilai variabel, dan tidak memiliki metode tambahan.

Ada delapan tipe data primitif di Java:

<table>
<tbody>

<tr>
<th style="width:20%">Type Data</th>
<th style="width:17%">Ukuran</th>
<th style="width:63%">Keterangan</th>
</tr>

<tr>
<td>byte</td>
<td>1 byte</td>
<td>Menyimpan angka dari -128 ke 127</td>
</tr>

<tr>
<td>short</td>
<td>2 bytes</td>
<td>Menyimpan angka dari -32,768 ke 32,767</td>
</tr>

<tr>
<td>int</td>
<td>4 bytes</td>
<td>Menyimpan angka dari -2,147,483,648 ke 2,147,483,647</td>
</tr>

<tr>
<td>long</td>
<td>8 bytes</td>
<td>Menyimpan angka dari -9,223,372,036,854,775,808 ke 9,223,372,036,854,775,807</td>
</tr>

<tr>
<td>float</td>
<td>4 bytes</td>
<td>Menyimpan angka pecahan dari 6 ke 7 digit dalam desimal</td>
</tr>

<tr>
<td>double</td>
<td>8 bytes</td>
<td>Menyimpan angka pecahan sebanyak 15 digit dalam desimal</td>
</tr>

<tr>
<td>boolean</td>
<td>1 bit</td>
<td>Menyimpan nilai true atau false</td>
</tr>

<tr>
<td>char</td>
<td>2 bytes</td>
<td>Menyimpan satu karakter / huruf atau nilai ASCII</td>
</tr>

</tbody>
</table>

### Tipe Data Non-Primitif

Tipe data non-primitif disebut tipe referensi karena mereka merujuk ke objek.

Perbedaan utama antara tipe data primitif dan non-primitif adalah :
- Jenis primitif sudah ditentukan sebelumnya (sudah ditentukan) di Java. Tipe non-primitif dibuat oleh programmer dan tidak ditentukan oleh Java (kecuali untuk String).
- Tipe non-primitif bisa digunakan untuk memanggil metode untuk melakukan operasi tertentu, sedangkan tipe primitif tidak bisa.
- Tipe primitif selalu memiliki nilai, sedangkan tipe non-primitif bisa null.
- Tipe primitif dimulai dengan huruf kecil, sedangkan tipe non-primitif dimulai dengan huruf besar.
- Ukuran tipe primitif bergantung pada tipe datanya, sedangkan tipe non-primitif memiliki ukuran yang sama.

Contoh tipe non-primitif adalah String , Array , Class, Interface , dll.

### Casting

- Casting digunakan untuk mengubah tipe data dari suatu variabel ke bentuk yang lain.
- seperti mengubah double ke int.
- perlu berhati-hati dalam melakukan casting karena kehilangan informasi bisa mengakibatkan hasil tidak akurat.
- casting tidak mengubah variabel yang sedang dicast, sebagai contoh :
<br>
double d = 4.5;
<br>
int i = <b>(int)</b> d; 
<br>
//i menjadi 4, tetapi d tidak berubah, masih 4.5

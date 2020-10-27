//contoh program hitung luas lingkaran
public class LuasLingkaran {
    public static void main(String[]args) {
        
      //deklarasi variabel untuk jarijari & luas
      double jarijari;
      double luas;
        
      //menentukan nilai jarijari
      jarijari = 20;
        
      //menentukan rumus hitung luas lingkaran
      luas = 3.14*jarijari*jarijari;
        
      //tampilkan hasilnya
      //tampil kalimat
      System.out.print("Luas lingkaran dengan jari-jari = ");

      //mengambil nilai jari-jari dari variabel jarijari 
      System.out.println(jarijari);

      //tampil string dan mengambil nilai luas dari variabel luas
      System.out.println("adalah = " + luas);
    }
}

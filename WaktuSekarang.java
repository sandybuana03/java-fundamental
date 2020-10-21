public class WaktuSekarang {
    public static void main(String[] args) {
        
        //mendapatkan total milidetik sejak tengah malam 1 januari 1970
        long totalMilidetik = System.currentTimeMillis();
        
        //mendapatkan total detik sejak tengah malah 1 januari 1970
        long totalDetik = totalMilidetik / 1000;
        
        //menghitung detik saat ini
        long detikSekarang = (int) (totalDetik % 60);
        
        //mendapatkan total menit
        long totalMenit = totalDetik / 60;
        
        //menghitung menit saat ini
        long menitSekarang = totalMenit % 60;
        
        //mendapatkan total jam
        long totalJam = totalMenit / 60;
        
        //menghitung jam saat ini
        long jamSekarang = (totalJam % 24)+7;
        
        //menampilkan hasil
        System.out.println("Waktu saat ini adalah " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang + " GMT+7");
    }
}

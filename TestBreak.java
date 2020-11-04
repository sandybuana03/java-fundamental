public class TestBreak {
    public static void main(String[] args) {
        int jumlah = 0;
        int angka = 0;
        
        while (angka < 20) {
            angka++;
            jumlah += angka;
            System.out.print(angka + " ");
            if (angka >= 5)
                break;
        }
        System.out.println("\nPenjumlahan angka diatas adalah " + jumlah);
    }
}
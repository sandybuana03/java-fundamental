public class TestContinue {
    public static void main(String[] args){
        int jumlah = 0;
        int angka = 0;
        
        while (angka < 10){
            angka++;
            if (angka == 5 || angka == 6) // angka 5 & 5 hilang
                    continue;
            System.out.print(angka + " ");
            jumlah += angka;
        }
        System.out.println("\nJumlah angka diatas adalah " + jumlah);
    }
}

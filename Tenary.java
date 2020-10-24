public class Tenary {
    public static void main(String[] args) {
        int suka = 10;
        String jawaban = (suka > 5) ? "iya" : "tidak";
        
        System.out.println(jawaban); //iya karena bernilai benar
        
        
        
        int suka2 = 5;
        int jawaban2 = (suka2 > 5) ? suka+suka2 : suka-suka2;
        
        System.out.println(jawaban2); //5 karena bernilai salah
    }
}

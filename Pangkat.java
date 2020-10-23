public class Pangkat {
    public static void main (String[] args) {
        int a = 2;
        double b = Math.pow(a,3); 
        //secara default tipe data dari Math.pow adalah double
        
        System.out.println(b);
        System.out.println(Math.pow(3, 3));
        System.out.println((int)Math.pow(4, 2));
    }
}

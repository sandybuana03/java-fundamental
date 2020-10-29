import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args ){
        Scanner masukan = new Scanner(System.in);
        
        //Meminta pengguna memasukkan berat dalam kg
        System.out.print("Masukkan Berat Badan (Kg) = ");
        double berat = masukan.nextDouble();
        
        //Meminta pengguna memasukkan tinggi badan dalam cm
        System.out.print("Masukkan Tinggi Badan (cm) = ");
        double tinggi = masukan.nextDouble();
        
        final double CM_KE_METER = 0.01; //konstanta
        
        //Hitung IMT
        double tinggiMeter = tinggi * CM_KE_METER;
        double imt = berat / Math.pow(tinggiMeter, 2);
        
        //tampilhasil
        System.out.printf("IMT Anda adalah = %5.2f \n", imt);
        if (imt < 16)
            System.out.println("Anda Sangat Kurus");
        else if (imt < 18)
            System.out.println("Anda Kurus");
        else if (imt < 24)
            System.out.println("Anda Normal");
        else if (imt < 29)
            System.out.println("Anda Gemuk");
        else if (imt < 35)
            System.out.println("Anda Sangat Gemuk");
        else
            System.out.println("Anda Terlalu Gemuk (OBESITAS)");
    }
}

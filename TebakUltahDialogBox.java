import javax.swing.JOptionPane;

public class TebakUltahDialogBox {
    public static void main (String[] args) {
        
        //set 1
        String set1 =
                     "  1    3    5     7 \n" +
                     "  9  11  13  15 \n" +
                     "17  19  21  23 \n" +
                     "25  27  29  31 \n";
        
        //set 2
        String set2 =
                     "  2    3     6    7 \n" +
                     "10  11  14  15 \n" +
                     "15  19  22  23 \n" +
                     "26  27  30  31 \n";
        
        //set 3
        String set3 =
                     "  4    5     6    7 \n" +
                     "12  13  14  15 \n" +
                     "20  21  22  23 \n" +
                     "28  29  30  31 \n";
        
        //set 4
        String set4 =
                     "  8    9   10  11 \n" +
                     "12  13  14  15 \n" +
                     "24  25  26  27 \n" +
                     "28  29  30  31 \n";
        
        //set 5
        String set5 =
                     "16  17  18  19 \n" +
                     "20  21  22  23 \n" +
                     "24  25  26  27 \n" +
                     "28  29  30  31 \n";
        
        int tanggal = 0;
        
        //set 1
        // Meminta Pengguna Memberikan Jawaban
        int jawaban = JOptionPane.showConfirmDialog(null, 
                "Apakah Tanggal Ulang Tahun Anda ada pada angka-angka berikut ?\n" + set1);
        
        if (jawaban == JOptionPane.YES_OPTION)
            tanggal += 1;
        
        //set 2
        // Meminta Pengguna Memberikan Jawaban
        jawaban = JOptionPane.showConfirmDialog(null, 
                "Apakah Tanggal Ulang Tahun Anda ada pada angka-angka berikut ?\n" + set2);
        
        if (jawaban == JOptionPane.YES_OPTION)
            tanggal += 2;
        
        //set 3
        // Meminta Pengguna Memberikan Jawaban
        jawaban = JOptionPane.showConfirmDialog(null, 
                "Apakah Tanggal Ulang Tahun Anda ada pada angka-angka berikut ?\n" + set3);
        
        if (jawaban == JOptionPane.YES_OPTION)
            tanggal += 4;
        
        //set 4
        // Meminta Pengguna Memberikan Jawaban
        jawaban = JOptionPane.showConfirmDialog(null, 
                "Apakah Tanggal Ulang Tahun Anda ada pada angka-angka berikut ?\n" + set4);
        
        if (jawaban == JOptionPane.YES_OPTION)
            tanggal += 8;
        
        //set 5
        // Meminta Pengguna Memberikan Jawaban
        jawaban = JOptionPane.showConfirmDialog(null, 
                "Apakah Tanggal Ulang Tahun Anda ada pada angka-angka berikut ?\n" + set5);
        
        if (jawaban == JOptionPane.YES_OPTION)
            tanggal += 16;
        
        JOptionPane.showMessageDialog(null, "Tanggal Ulang Tahun Anda adalah " + tanggal);
    }
}

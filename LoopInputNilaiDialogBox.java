import javax.swing.JOptionPane;

public class LoopInputNilaiDialogBox {
    public static void main(String[] args) {
        int jumlah = 0;
        
        // tetap mengulang sampai pengguna menjawab NO
        int opsi = JOptionPane.YES_OPTION;
        while (opsi == JOptionPane.YES_OPTION) {
            // membaca data berikutnya
            String dataString = JOptionPane.showInputDialog("Masukkan Suatu Nilai Int");
            int data = Integer.parseInt(dataString); // menyimpan nilai string ke numerik
            
            jumlah += data;
            
            opsi = JOptionPane.showConfirmDialog(null, "Lanjut?");
        }
        JOptionPane.showMessageDialog(null, "Penjumlahan seluruh angka = " + jumlah);
    }
}

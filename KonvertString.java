public class KonvertString {
    public static void main(String[] args) {
        String intString = "123";
        int intNilai = Integer.parseInt(intString); //ubah ke int
        
        System.out.println(intNilai); //123
        System.out.println(intString + 45); //12345 masih string
        System.out.println(intNilai + 45); //168
        System.out.println(Integer.parseInt(intString)); //123 ubah ke int
        System.out.println(Integer.parseInt(intString)+45); //168 ubah ke int
        
        System.out.println("--------------------------");
        
        String doubleString = "123.45";
        double doubleNilai = Double.parseDouble(doubleString); //ubah ke double
        
        System.out.println(doubleNilai); //123.45
        System.out.println(doubleString + 45); //123.4545 masih string
        System.out.println(doubleNilai + 45); //168.45
        System.out.println(Double.parseDouble(doubleString)); //123.45 ubah ke double
        System.out.println(Double.parseDouble(doubleString)+45); //168.45 ubah ke double
    }
}

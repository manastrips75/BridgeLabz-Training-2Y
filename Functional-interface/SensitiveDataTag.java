interface SensitiveData {}

class AadhaarDetails implements SensitiveData {
    String number = "XXXX-XXXX-1234";
}

public class SensitiveDataTag {
    public static void main(String[] args) {
        AadhaarDetails d = new AadhaarDetails();
        System.out.println("Sensitive: " + d.number);
    }
}

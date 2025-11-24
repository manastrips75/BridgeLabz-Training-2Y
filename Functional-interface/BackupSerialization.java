import java.io.Serializable;

class UserData implements Serializable {
    String name = "John";
}

public class BackupSerialization {
    public static void main(String[] args) {
        UserData u = new UserData();
        System.out.println("Ready for backup: " + u.name);
    }
}

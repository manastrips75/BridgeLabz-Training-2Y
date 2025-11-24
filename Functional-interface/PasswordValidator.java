interface SecurityUtils {
    static boolean isStrong(String pass) {
        return pass.length() >= 8 && pass.matches(".*[0-9].*")
                && pass.matches(".*[A-Z].*");
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrong("Abcd1234"));
    }
}

//Class task is to validate a mail

public class Validador {
    public static boolean validate(String mail) {
        return mail.contains("@") && mail.contains(".");
    }

    
}


import java.util.Scanner;

public class Lector {
    public static String pedirCorreo() {
        Scanner sc = new Scanner(System.in);
        String mail = sc.nextLine();

        //We check if the mail works
        if(mail.contains("@") && mail.contains(".")) {
            System.out.println("Mail registered successfully");   
            return mail;
        } else {
            return "Error";
        }

    }
    
}


import java.util.Scanner;

//Class task is to ask for a mail sent by the user

public class Lector {
    //Scanner is created
    static Scanner sc = new Scanner(System.in);

    public static void readMail(String msg) {
        //We ask for an Input
        System.out.print(msg);
        String mail = sc.nextLine();
        
        //We check if the mail works
        if(Validador.validate(mail)) {
            System.out.println("Mail registered successfully");   
        } else {
            System.out.println("Error, mail is invalid.");
        }

        //We close the scanner once finished
        sc.close();

    }
    
}

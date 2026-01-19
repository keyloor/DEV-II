public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        Person p = new Person("Keylor", emailService);
        p.notifyPerson();
    }
    
}

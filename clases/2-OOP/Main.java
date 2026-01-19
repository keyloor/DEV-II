public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Keylor", 10000);
        BankApp app = new BankApp(acc);

        app.showMenu();
        
    }
}

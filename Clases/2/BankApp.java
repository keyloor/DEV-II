
import java.util.Scanner;

public class BankApp {
    private BankAccount account;


    public BankApp(BankAccount account) {
        this.account = account;
    }

    public void showMenu() {
        boolean active = true;
        int option;
        Scanner sc = new Scanner(System.in);

        while(active) {

            System.out.println("""
                               - Select an option: \r
                               1. Deposit\r
                               2. Withdraw\r
                               3. Show Funds\r
                               4. Exit""");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Deposit amount: ");
                    account.depositFunds(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Withdraw amount: ");
                    account.withdrawFunds(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Funds total: " + account.seeFunds());
                    break;
                case 4:
                    active = false;
                    break;
                default:
                    throw new AssertionError();
            }
            
        }

    }

    


}

public class BankAccount {
    private String owner;
    private double funds;

    public BankAccount(String owner, double funds) {
        this.owner = owner;
        this.funds = funds;
    }

    public boolean depositFunds(int amount) {
        if(amount > 0) {
            funds += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdrawFunds(int amount) {
        if(amount >= funds) {
            funds -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double seeFunds() {
        return funds;
    }

    
}

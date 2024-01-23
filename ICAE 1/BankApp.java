/*
CODED BY - : @VIMALATHAS VITHUSAN
2020/2021 BATCH😊

LINKEDIN - https://www.linkedin.com/in/vimalathasvithusan/
GITHUB - https://github.com/thasvithu
YOUTUBE - https://www.youtube.com/@codewithvithu


ICAE 1
*/


class BankAccount {
    private String accountHolderName, nic;
    private double balance;

    public BankAccount(String accountHolderName, double balance, String nic) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.nic = nic;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double checkBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }

    public void printDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("NIC: " + nic);
        System.out.println("Balance: " + balance);
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 10.0;
    private String accountType;

    public SavingsAccount(String accountHolderName, double balance, String nic, String accountType) {
        super(accountHolderName, balance, nic);
        this.accountType = accountType;
    }

    public double withdraw(double amount) {
        if (getBalance() < amount) {
            System.out.println("Insufficient Balance!");
            return 0.0;
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Successfully Withdrawn!");
            return amount;
        }
    }

    public double calculateInterest() {
        double interestAmount = getBalance() * (INTEREST_RATE / 100);
        setBalance(getBalance() + interestAmount);
        return interestAmount;
    }
}

class CurrentAccount extends BankAccount {
    private static final double SERVICE_CHARGE = 150.00;
    private static final double MIN_BALANCE = 1500.00;

    public CurrentAccount(String accountHolderName, double balance, String nic) {
        super(accountHolderName, balance, nic);
    }

    public double checkMinimumBalance() {
        if (getBalance() < MIN_BALANCE) {
            setBalance(getBalance() - SERVICE_CHARGE);
        }
        return getBalance();
    }
}

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Kamal", 10000.0, "9820383672V", "Savings Account");
        System.out.println("Savings Account:");
        savingsAccount.checkBalance();
        savingsAccount.deposit(5000);
        savingsAccount.withdraw(1000);
        savingsAccount.calculateInterest();
        savingsAccount.checkBalance();

        System.out.println("-----------------------");
        System.out.println("Current Account:");
        CurrentAccount currentAccount = new CurrentAccount("Amal", 1000.0, "970982373V");
        currentAccount.checkBalance();
        currentAccount.deposit(500);
        currentAccount.checkMinimumBalance();
        currentAccount.checkBalance();
    }
}

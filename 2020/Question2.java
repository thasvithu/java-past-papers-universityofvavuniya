/*
CODED BY - : @VIMALATHAS VITHUSAN
2020/2021 BATCH😊

LINKEDIN - https://www.linkedin.com/in/vimalathasvithusan/
GITHUB - https://github.com/thasvithu
YOUTUBE - https://www.youtube.com/@codewithvithu


2020 JAVA(OOP) PRACTICAL PAPER - UNIVERSITY OF VAVUNIYA
SECOND SEMESTER - DECEMBER/JANUARY 2022/2023
SUBJECT CODE - TICT1234
*/


import java.util.Scanner;

class BankAccount {
	private String firstname, lastname, accountType, branch;
	private int accountNo;
	private double minBalance = 500, rate;
		
	BankAccount() {}
	
	BankAccount(String firstname, String lastname, String accountType, int accountNo, double rate, String branch) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountType = accountType;
		this.accountNo = accountNo;
		this.rate = rate;
		this.branch = branch;
	}
	
	// ***GETTERS***
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getRate() {
        return rate;
    }

    public String getBranch() {
        return branch;
    }

    // ***SETTERS***
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
	
	
	void findRate() {
		if (rate >= 75)
			System.out.println("Rate : Rate is Excellent");
		else if(rate >= 50)
			System.out.println("Rate : Rate is Good");
		else	
			System.out.println("Rate : Rate is Normal ");
	}
	
	void display() {
		// System.out.println("Name : " + firstname.concat(lastname));
		System.out.println("Name : " + firstname + " " + lastname);
		System.out.println("Account Type : " + accountType);
		System.out.println("Account No : " + accountNo);
		System.out.println("Minimum Account Balance : " + minBalance);
		System.out.println("Branch : " + branch);
	}
}

class SavingsAccount extends BankAccount {
	private double balance, interest;
	private final String accountName = "Singithi";
	
	SavingsAccount(String firstname, String lastname, String accountType, int accountNo, double rate, String branch, double balance) {
		super(firstname, lastname, accountType, accountNo, rate, branch);
		
		this.balance = balance;
	}
	
	SavingsAccount(double balance) {
		this.balance = balance;
	}
	
	void deposit (int depositAmount) {
		if (depositAmount < 0)
			System.out.println("Invalid Amount");
		else {
			balance = balance + depositAmount;
			System.out.println("Your balance after deposit : " + balance);
		}
	}
	
	void withdraw (int withdrawalAmount) {
		if (withdrawalAmount > balance)
			System.out.println("Not Sufficient balance");
		else if (withdrawalAmount < 0)
			System.out.println("Invalid balance");
		else {
			balance = balance - withdrawalAmount;
			System.out.println("Your balance after withdrawal : " + balance);
		}
	}
	
	double applyInterest() {
		System.out.print("\nYour interest is: ");
		
		if (balance <= 10000)
			return balance * 0.1;
		else
			return 100 + (balance * 0.2);
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("Account Name : " + accountName);
		System.out.println("Current Account Balance  : " + balance);
	}
	
}

class  CurrentAccount extends SavingsAccount {
	double balance;
	
	CurrentAccount(String firstname, String lastname, String accountType, int accountNo, double rate, String branch, double balance) {
		super(firstname, lastname, accountType, accountNo, rate, branch, balance);
		this.balance = balance;
	}
	
	@Override
	double applyInterest() {
		System.out.print("\nYour interest is: ");
		if (balance <= 10000)
			return balance * 0.5;
		else
			return balance * 0.9;
	}
}

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount bankACC = new BankAccount("Kamal", "Perera", "Joint Account", 87673542, 44, "Vavuniya");
		
		bankACC.display();
		bankACC.findRate();
		
		System.out.println("-----------------------\n");
		System.out.println("Savings Account Details");
		System.out.println("\n-----------------------");
		
		SavingsAccount savAcc = new SavingsAccount("Kasun", "De Soyza ", "Saving Account", 978394758, 50, "Vavuniya", 1000);
		
		savAcc.display();
		
		System.out.print("\nEnter the ammount you want to deposit: ");
		int depositAmount = sc.nextInt();
		savAcc.deposit(depositAmount);
		
		System.out.print("\nEnter the ammount you want to withdraw: ");
		int withdrawalAmount = sc.nextInt();
		savAcc.withdraw(withdrawalAmount);
		
		System.out.println(savAcc.applyInterest());
		
		// ***CLASS CURRENT ACCOUNT*** 
		System.out.println("-----------------------\n");
		System.out.println("Current  Account Details");
		System.out.println("\n-----------------------");
		
		CurrentAccount currentAcc = new CurrentAccount("Kasun", "De Soyza ", "Saving Account", 978394758, 50, "Vavuniya", 150000);
		System.out.println(currentAcc.applyInterest());
	}
}
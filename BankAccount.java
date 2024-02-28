/*
 Create an interface called "BankAccount" with methods called "deposit" and "withdraw".
 Create a class called "CheckingAccount" that implements the BankAccount interface and implements
 the "deposit" and "withdraw" methods.
 Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.
 */ 
package my_Own_bank;

import java.util.Scanner;

public interface BankAccount {

	Scanner sc =new Scanner(System.in);
	public void deposite();
	public void withdrow();
}

class CheckingAccount implements BankAccount{

	int balance;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	@Override
	public void deposite() {
		System.out.println("Enter the amount");
		int am=sc.nextInt();
		int final_bal=getBalance();
		setBalance(final_bal+am);
		System.out.println("DEP DONE");
	}

	@Override
	public void withdrow() {
		System.out.println("Enter the amount");
		int am=sc.nextInt();
		int final_bal=getBalance();
		setBalance(final_bal-am);
		System.out.println("WITHDROW DONE");
		System.out.println("Avilable Balance= "+balance);
	}
	
	
	public static void main(String arg[]) {
		CheckingAccount ob=new CheckingAccount();
		ob.deposite();
		ob.withdrow();
	}
}

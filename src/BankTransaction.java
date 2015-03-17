import java.util.Scanner;


//Aaron Satterfield
//013572648
//3/16/15
//printing arrays
//Bank Transaction Simulator

public class BankTransaction {
	public static void main (String[] args) {
		ATMControl atm = new ATMControl();
		atm.setBalances();
		Scanner input = new Scanner(System.in);
		System.out.print("*******************************\n*                             *\n*  How can I help you today?  *\n*                             * \n*******************************\n1. Deposit\n2.Withdraw\n3.Transfer\n\nEnter option number: ");
		switch(input.nextInt()) {
		 	case 1:  {
		 		System.out.print("\nFor what account?\n1.Checking\n2.Savings\nEnter option number: ");
		 		int account = input.nextInt();
		 		System.out.print("\nEnter deposit amount: ");
		 		double amount = input.nextDouble();
		 		atm.deposit(account, amount);
		 	}
         		break;
		 	case 2:  {
		 		System.out.print("\nFor what account?\n1.Checking\n2.Savings\nEnter option number: ");
		 		int account = input.nextInt();
		 		boolean success = false;
		 		while (!success) {
		 			System.out.print("\nEnter withdraw amount: ");
		 			double amount = input.nextDouble();
		 			success = atm.withdraw(account, amount);
		 		}
		 	}
		 		break;
		 	case 3:  {
		 		System.out.print("\nInto what account would you like to transfer to?\n1.Checking\n2.Savings\nEnter option number: ");
		 		int account = input.nextInt();
		 		boolean success = false;
		 		while (!success) {
			 		System.out.print("\nEnter transfer amount: ");
			 		double amount = input.nextDouble();
			 		success = atm.transfer(account, amount);
		 		}
		 	}
         		break;
		}
		atm.getBalances();
	}
}

class ATMControl {
	private double checkingBal = 0;
	private double savingsBal = 0;
	private double inDouble = 0;
	public ATMControl () {
		inDouble = -1;
	}
	public void setBalances() {
		Scanner input = new Scanner(System.in);
		while (inDouble < 0) {
			System.out.print("Enter the balance of the checking account: ");
			inDouble = input.nextDouble();
			if (inDouble >= 0) {
				checkingBal = inDouble;	
			} else {
				System.out.println("Balance must not be negative.");
			}
		}
		inDouble = -1;
		while (inDouble < 0) {
			System.out.print("Enter the balance of the savings account: ");
			inDouble = input.nextDouble();
			if (inDouble >= 0) {
				savingsBal = inDouble;
			} else {
				System.out.println("Balance must not be negative.");
			}
		}	
	}
	public void deposit(int account, double amount) {
		account--;
		checkingBal = (account == 0) ? checkingBal + amount : checkingBal;
		savingsBal = (account == 1) ? savingsBal + amount : savingsBal;
	}
	public boolean withdraw(int account, double amount) {
		account--;
		double currentAccount = (account == 0) ? checkingBal : savingsBal;
		if (amount > currentAccount) {
			System.out.println("You must not overdraft this account!");
			return false;
		}
		
		if (account == 0){
			checkingBal = currentAccount-amount;
		} else {
			savingsBal = currentAccount-amount;
		}
		return true;
	}
	public boolean transfer(int account, double amount) {
		account--;
		double currentAccount = (account == 0) ? savingsBal : checkingBal;
		if (amount > currentAccount) {
			System.out.println("You must not overdraft this account!");
			return false;
		}
		System.out.println(account +" this account");
		if (account == 0){
			checkingBal = checkingBal+amount;
			savingsBal = savingsBal-amount;
		} else {
			savingsBal = savingsBal+amount;
			checkingBal = checkingBal-amount;
		}
		return true;
		
	}
	public void getBalances(){
		System.out.print("Checking Balance: $"+checkingBal+" Savings Balance: $"+savingsBal);

	}

}

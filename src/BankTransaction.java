import java.util.Scanner;
<<<<<<< HEAD

public class BankTransaction {
	public static void main(String[] args){
		
	}
=======

//Aaron Satterfield
//013572648
//3/16/15
//printing arrays
//Bank Transaction Simulator

public class BankTransaction {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		double checkingBal = 0;
		double savingsBal = 0;
		double inDouble = -1;
		ATMControl atm = new ATMControl();
		atm.setBalances();
		
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
	
>>>>>>> origin/master
}

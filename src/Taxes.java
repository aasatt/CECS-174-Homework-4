import java.util.Scanner;

//Computing taxes according to the table


public class Taxes {
	public static void main (String[] args) {
		//init Scanner here - Scanner input = new Scanner(System.in);
		//ask user for marital status - something like enter 0 if single and 2 
		//set value of status - int
		//ask user for total income 
		//set value of income - double 
		//close scanner - input.closer();
		//init TaxTable class and pass the values of marital status and income - table
		//create new double tax and call the getTax method to set it equal to the tax owed - double tax = table.getTax();
		//print result to user 
	}
}

class TaxTable{
	//declare private vars here
	public TaxTable (int status, double income) {
		//set private vars to the ones passed in
	}
	public double getTax() {
		double calculatedTax = 0; // init var 
		
		return calculatedTax; //return the result
	}
}

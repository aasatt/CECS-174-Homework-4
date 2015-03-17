import java.util.Scanner;

public class Taxes {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 0 if single, or Enter 1 if married: ");
		int status = input.nextInt();
		
		System.out.print("What is your total income: ");
		double income = input.nextDouble();
		
		TaxTable first = new TaxTable();
		System.out.print("Your tax comes up to be $");
		System.out.println(first.getTax(status, income));
	}
}



class TaxTable{
	
	/**Initiated calculatedTax*/
	private double calculatedTax;
	
	public TaxTable(){
		calculatedTax = 0;	
	}
	
	public double getTax(int status, double income) {
		
		/**If single*/
		if(status == 0 && income >= 32000){
			calculatedTax = income*.25 + 4400;
		}
		else if(status == 0 && income >= 8000){
			calculatedTax = income*.15 + 800;
		}
		else if(status == 0 && income > 0){
			calculatedTax = income*.10;
		}
		
		
		/**If married*/
		if(status == 1 && income >= 64000){
			calculatedTax = income*.25 + 8800;
		}
		else if(status == 1 && income >= 16000){
			calculatedTax = income*.15 + 1600;
		}
		else if(status == 1 && income > 0){
			calculatedTax = income*.10;
		}
		return calculatedTax; 
	}
}

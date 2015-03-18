import java.util.Scanner;

public class LeapYearTester {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will check to see if the year is a leap year or not");
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		LeapYear first = new LeapYear();
		first.isLeapYear(year);
		
	}
}


class LeapYear {

	/**instance variable*/
	private int year;

	/**Constructor*/
	public LeapYear(){
		year = 0;
	}
	
	public void isLeapYear(int leapYear){
		year = leapYear;
		
		//check it now...
		if (year%4 == 0 && year%100 != 0) {
			System.out.print("This year is a leap year!");
		} else if (year%400 == 0){
			System.out.print("This year is a leap year!");
		} else {
			System.out.print("This year is not a leap year");
		}
	}
	
}

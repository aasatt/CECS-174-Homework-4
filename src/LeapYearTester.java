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

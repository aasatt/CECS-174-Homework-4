
public class LeapYear {

	/**instance variable*/
	private int year;

	/**Constructor*/
	public LeapYear(){
		year = 0;
	}
	
	public void isLeapYear(int leapYear){
		year = leapYear;
		
		//Still need to find the right algorithm for this. 
		//I'm getting logical errors.
		if(year%4 == 0 && year%100 != 0){
			System.out.print("This year is a leap year");
		}
		else if(year%400 ==0 && year%100 != 0){
			System.out.print("This year is a leap year");
		}
		else{
			System.out.print("This year is not a leap year");
		}
	}
	
}

import java.util.Scanner;

public class RomanNumbers {
	public static void main(String[] args){		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		
		toRoman first = new toRoman();
		System.out.print(first.integerToRoman(number));
	}
}




class toRoman{
	private int repeat;
	private String roman;
	
	public toRoman(){
		
		repeat = 0;
		roman = "";
	}
	
	public String integerToRoman(int number){
		
		repeat = number/1000;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "M";
		}
		number = number%1000;
		
		repeat = number/900;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "CM";
		}
		number = number%900;
		
		repeat = number/500;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "D";
		}
		number = number%500;
		
		repeat = number/400;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "CD";
		}
		number = number%400;
		
		repeat = number/100;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "C";
		}
		number = number%100;
		
		repeat = number/90;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "XC";
		}
		number = number%90;
		
		repeat = number/50;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "L";
		}
		number = number%50;
		
		repeat = number/40;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "XL";
		}
		number = number%40;
		
		repeat = number/10;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "X";
		}
		number = number%10;
		
		repeat = number/9;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "IX";
		}
		number = number%9;
		
		repeat = number/5;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "V";
		}
		number = number%5;
		
		repeat = number/4;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "IV";
		}
		number = number%4;
		
		repeat = number/1;
		for(int i = 1; i <= repeat; i++){
			roman = roman + "I";
		}
		return roman;
	}
		

}			
		

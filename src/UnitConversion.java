import java.util.Scanner;

/*
 * 
 * I feel like this is sorta a hacky solution to this problem if u can think of a better way please let me know and do it
 * to me its a little more complacted than it seems because of all the combos
 * 
 * 
 * in a program i would probably ask for value first that way u can covert it at the same time u check for compatibily, but for the sake of the hw assignment we are told to ask 
 * for the the value after we make sure the conversion is valid 
 * 
 * 
 * sorry this is so sloppy.... its honesly easier for me to just start codeing by trial and error than plan everything out fist 
 * 
 * 
 * if you have questions feel free to text me (714) 465-6287
 * 
 * 
 * 
 * 
 * 
 * 
 * ***UPDATE***
 * 	I was in the shower and had a though about how i could reduce the code by 1/3rd so here it is... still seem a little repetitive for me but better than
 * it was before 
 * 
 * 
 */




public class UnitConversion {
	public static void main (String[] args) {
		//ask user covert from? (fl.oz, gal, oz, lb, in, ft, mi)
		Scanner input = new Scanner(System.in);
		System.out.println("Covert from? Enter: fl.oz, gal, oz, lb, in, ft or mi");
		Converter convert = new  Converter(input.nextLine());
		//now i would init the Converter class with the first value
		// call secondValueValid from Converter class like this
		
		double result = -1;
		while (result == -1) {
			result = convert.getResult();//this will keep running until valid second value
			if (result == -1) {
				System.out.println("Invalid Units \n");
			}
		}
		System.out.print(result+" "+convert.getTo());
		//display result to user
	}
}


class Converter{
	private String from = "";
	private String to = "";
	public Converter (String fromMain) {
		from = fromMain;
	}
	public double getResult() {
		//double conversion.... this will be the multiplier you are using to actually do the conversion
		//ask user covert to? (ml, l, g, kg, mm, cm, m, km).
		System.out.println("Covert to? Enter: ml, l, g, kg, mm, cm, m or km");
		Scanner input = new Scanner(System.in);
		to = input.nextLine();
		double value = 0;
		double conversion = 0;
		//use if else statments to find a matching combo
		
		/*
		 * KEEP THIS COMMENT	
		 *Here all all the combos possible
						// 1 = floz -> ml
						// 2 = floz -> l
						// 3 = gal -> ml
						// 4 = gal -> l
						// 5 = oz -> g
						// 6 = oz -> kg
						// 7 = lb -> g
						// 8 = lb -> kg
						// 9 = in -> mm
						// 10 = in -> cm
						// 11 = in -> m
						// 12 = in -> km
						// 13 = ft -> mm
						// 14 = ft -> cm
						// 15 = ft -> m
						// 16 = ft -> km
						// 17 = mi -> mm
						// 18 = mi -> cm
						// 19 = mi -> m
						// 20 = mi -> km
		*/
		
		if (from.equalsIgnoreCase("fl.oz")) {
			System.out.println("here");
			if (to.equalsIgnoreCase("ml")) {
				conversion = 29.5735;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();
				return (value*conversion);
			} else if (to.equalsIgnoreCase("l")) {
				conversion = .0295735;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();
				return (value*conversion);
			}
		} else if (from.equalsIgnoreCase("gal")) {
			if (to.equalsIgnoreCase("ml")) {
				conversion = 3785.41;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("l")) {
				conversion = 3.78541;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			}	
		} else if (from.equalsIgnoreCase("oz")) {
			if (to.equalsIgnoreCase("g")) {
				conversion = 28.3495;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("kg")) {
				conversion = 0.0283495;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} 
		} else if (from.equalsIgnoreCase("lb")) {
			if (to.equalsIgnoreCase("g")) {
				conversion = 453.592;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("kg")) {
				conversion = 0.453592;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} 
		} else if (from.equalsIgnoreCase("in")) {
			if (to.equalsIgnoreCase("mm")) {
				conversion = 25.4;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("cm")) {
				conversion = 2.54;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("m")) {
				conversion = .0254;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("km")) {
				conversion = .0000245;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			}
		} else if (from.equalsIgnoreCase("ft")) {
			if (to.equalsIgnoreCase("mm")) {
				conversion = 304.8;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("cm")) {
				conversion = 30.48;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("m")) {
				conversion = 0.3048;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("km")) {
				conversion = .0003048;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			}
		} else if (from.equalsIgnoreCase("mi")) {
			if (to.equalsIgnoreCase("mm")) {
				conversion = 160934;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("cm")) {
				conversion = 160934;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("m")) {
				conversion = 1609.34;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			} else if (to.equalsIgnoreCase("km")) {
				conversion = 1.60934;
				System.out.println("Enter value to convert: ");
				value = input.nextDouble();				
				return (value*conversion);
			}
		}
		//if the combo never is valid it will eventually return -1 which will restart the while loop in main 
		return -1;
	}
	public String getTo(){
		return to; //returns proper units for output
	}

}

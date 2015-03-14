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
 */
public class UnitConversion {
	public static void main (String[] args) {
		//ask user covert from? (fl.oz, gal, oz, lb, in, ft, mi)
		//set string value - nextLine();
		
		//now i would init the Converter class with the first value
		// call secondValueValid from Converter class like this
		
//		boolean valid = false;
//		while (!valid) {
//			valid = secondValueValid();//this will keep running until valid second value
//		}

		//ask user for value to convert and pass it to getResult();
		//display result 
	}
}


class Converter{
	//declare private vars here
	//i would have a private int called 
	
	
/*
 * KEEP THIS COMMENT	
 * Combo will eventually be set with a value to represent this: 
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

	public Converter (String from) {
		//set private var to the one passed in
	}
	public boolean secondValueValid() {
		//ask user covert to? (ml, l, g, kg, mm, cm, m, km).
		//set string value - nextLine();
		//use if else statments to set the value of combo to the correct one and return true if valid 
		
//		if (from == "fl.oz") {
//			if (to == "ml") {
//				combo = 1;
//				return true;
//			} else if (to == "l") {
//				combo = 2;
//				return true;
//			}
//			
//			
//			
//		} else if (from == "gal") {
//			if (to == "ml") {
//				combo = 3;
//				return true;
//			} else if (to == "l") {
//				combo = 4;
//				return true;
//			}
//			
//			
//			
//		} else if (from == "oz") {
//			if (to == "g") {
//				combo = 1;
//				return true;
//			} else if (to == "kg") {
//				combo = 2;
//				return true;
//			}
//			
//			
//			
//		} else if (from == "lb") {
//			if (to == "g") {
//				combo = 3;
//				return true;
//			} else if (to == "kg") {
//				combo = 4;
//				return true;
//			}
//		}
//		
//		
		//..............and so on
		
		
		//if the combo never is valid it will eventually return false 
		
		return false; //return the result
	}
	public double getResult() {
		//check the combo and convert
//		if (combo == 1) {
//			//return (from*29.5735)
//		} else if (combo == 2) {
//			return conversion for fl.oz to l (from*.0295735)
//			
//		} //.....and so on for every combo
//		
//		
		return -1; //this should never get called
	}
}

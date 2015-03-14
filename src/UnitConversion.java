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
		//set string value - nextLine();
		
		//now i would init the Converter class with the first value
		// call secondValueValid from Converter class like this
		
//		int reult = -1;
//		while (result == -1) {
//			result = getResult();//this will keep running until valid second value
//		}

		//display result to user
	}
}


class Converter{
	//declare private vars here

	public Converter (String from) {
		//set private var to the one passed in
	}
	public double getResult() {
		//double conversion.... this will be the multiplier you are using to actually do the conversion
		//ask user covert to? (ml, l, g, kg, mm, cm, m, km).
		//set string value - nextLine();
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
		
		
		
//		if (from == "fl.oz") {
//			if (to == "ml") {
//				conversion = 29.5735;
//				//ask user for the value to convert
//				return (value*conversion);
//			} else if (to == "l") {
//				conversion = .0295735;
//				//ask user for the value to convert
//				return (value*conversion);
//			}
//			
//			
//			
//		} else if (from == "gal") {
//			if (to == "ml") {
//				conversion = 3785.41;
//				/ask user for the value to convert
//				return (value*conversion);
//			} else if (to == "l") {
//				conversion = 3.78541;
//				//ask user for the value to convert
//				return (value*conversion);
//			}
//			
//			
//			
//		} else if (from == "oz") {
//			if (to == "g") {
//				conversion = 28.3495;
//				//ask user for the value to convert
//				return (value*conversion);
//			} else if (to == "kg") {
//				conversion = 0.0283495;
//				//ask user for the value to convert
//				return (value*conversion);
//			} 
		
		
		//..............and so on
		
		
		//if the combo never is valid it will eventually return -1 which will restart the while loop in main 
		
		return -1; //return the result
	}

}

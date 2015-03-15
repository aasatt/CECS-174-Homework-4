//Minivan controller simulator 

/*
 * Wanna test this for me and make sure it all works? I've ran as many combos as i can think of.
 * 
 * its best to just keep pasting 
 * 									0 0 0 1 0 1 0 0 P
 * 			 in and change stuff around 
 * 
 * 
 */

import java.util.Scanner;


public class Minivan {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a controller input: ");
		Controller control = new Controller(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.next());
		System.out.println(control.checkDoors());
	
	}
}

class Controller {
	private int dashl = 0;
	private int dashr = 0;
	private int child = 0;
	private int master = 0;
	private int insidel = 0;
	private int insider = 0;
	private int outsidel = 0;
	private int outsider = 0;
	private String gear = "";
	public Controller(int one, int two, int three, int four, int five, int six, int seven, int eight, String nine) {
		//System.out.print(one + " " + two + " " + three + " " + four + " " + five + " " + six + " " + seven + " " + eight + " " + nine);
		this.dashl = one;
		this.dashr = two;
		this.child = three;
		this.master = four;
		this.insidel = five;
		this.insider = six;
		this.outsidel = seven;
		this.outsider = eight;
		this.gear = nine;
	}
	public String checkDoors() {
		if (gear.equals("P") && master == 1) {
			if (child == 0) {
				if (insidel == 1) {
					if (insider == 1) {
						return "Both doors open.";
					} else if (outsider == 1){
						return "Both doors open.";
					} else if (dashr == 1){
						return "Both doors open.";
					} else {
						return "Left door opens";
					}
				} else if (insider == 1) {
					if (outsidel == 1){
						return "Both doors open.";
					} else if (dashl == 1){
						return "Both doors open.";
					} else {
						return "Right door opens";
					}
				}
			} else if (outsidel == 1) {
				if (outsider == 1){
					return "Both doors open.";
				} else if (dashr == 1){
					return "Both doors open.";
				} else {
					return "Left door opens";
				}
			} else if (outsider == 1) {
				if (dashl == 1){
					return "Both doors open.";
				} else {
					return "Right door opens";
				}
			} else if (dashl == 1) {
				if (dashr == 1){
					return "Both doors open.";
				} else {
					return "Left door opens";
				} 
			} else if (dashl == 1) {
				return "Right door opens";
			}
		}
		
		return "Both doors stay closed.";
	}
}

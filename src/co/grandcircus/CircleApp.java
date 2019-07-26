package co.grandcircus;

import java.util.Scanner;

/*
 * @Atiba Franklin
 */
public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hey! Welcome to the Circle Tester!");
		System.out.println(" ");
		System.out.println("You ready for a little Math? Type Yes or No");
		String choice = scan.next();
	while (choice.equalsIgnoreCase("yes")) {
		System.out.println("Cool! Enter a positive number for a radius to get started.");
	  try {
		double input = scan.nextDouble();
		Circle meth = new Circle(input);
		System.out.println(" ");
		String area = meth.getFormattedArea();
		
		System.out.println("The Area: " + area);
		System.out.println(" ");
		
		String circ = meth.getFormattedCircumference();
		System.out.println("The Circumference: " + circ);
	  } catch (Exception e) {
	  	System.out.println("Unknown input! Enter a positive (preferably single digit) Number!!!");
	  	e.printStackTrace();
	  } finally {
	  		
	  		System.out.println("You wanna go again? Yes or No");
	  		choice = scan.next();
	  	}
		}	
		System.out.println("Goodbye!");
	}

}

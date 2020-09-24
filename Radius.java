import java.util.Scanner;

/*
 * 
 * Matthew Kim
 * 
 * Radius
 * Goal: Write a program that allows the user to input the radius of a circle and then calculate the area and the circumference of the circle
 * 
 * Sept 24, 2020
 * 
 */
public class Radius {
	public static void main(String [] args) {
		System.out.print("Enter the radius: ");
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		input.close();
		System.out.println("Radius of the circle: "+ r);
		System.out.println("Area of the circle: "+ r*r*Math.PI);
		System.out.println("Circumference of the circle: "+ 2*r*Math.PI);
	}
}

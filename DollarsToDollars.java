import java.util.Scanner;
/*
 * 
 * Matthew Kim
 * 
 * DollarsToDollars
 * Goal: Write a program that converts from US dollars to Euro dollars
 * Current Euro conversion is .85 as of 22 Sept 2020
 * 
 * Sept 22, 2020
 * 
 */
public class DollarsToDollars {
	public static void main(String [] args) {
		int usd = 0;
		double euro = 0.0;
		System.out.print("Input in USD: ");
		Scanner input = new Scanner(System.in);
		usd = input.nextInt();
		input.close();
		euro = (double) usd * 0.85;
		System.out.println("The Exchange Rate is "+ usd +" USD = "+ euro + " EUR");
	}
}

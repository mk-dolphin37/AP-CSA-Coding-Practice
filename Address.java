import java.util.Scanner;
/*
 * 
 * Matthew Kim
 * 
 * Address
 * Goal: Create a program that stores a contact name and address
 * 
 * Sept 24, 2020
 * 
 */
public class Address {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		print("Store Name: ");
		String name = input.nextLine();
		println();
		print("Street Address: ");
		String address = input.nextLine();
		println();
		print("City: ");
		String city = input.nextLine();
		println();
		print("State: ");
		String state = input.nextLine();
		println();
		print("ZIP Code: ");
		int zip = input.nextInt();
		println();
		println(name);
		println(address);
		println(city +", "+ state +", USA "+ zip);
	}
}

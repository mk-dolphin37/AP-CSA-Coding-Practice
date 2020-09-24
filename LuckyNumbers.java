import java.util.Scanner;
/*
 * 
 * Matthew Kim
 * 
 * LuckyNumbers
 * Goal: Write a program that takes user input and stores your two lucky numbers integer variables named num1 and num2
 * 
 * Sept 22, 2020
 * 
 */
public class LuckyNumbers {
	public static void main(String [] args) {
		int num1 = 0, num2 = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Number 1: ");
		num1 = input.nextInt();
		System.out.println();
		System.out.print("Number 2: ");
		num2 = input.nextInt();
		input.close();

		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println((num1 * num2) - (num1 + num2));
		System.out.println((int) (num1 / num2));
		System.out.println(((double) num1 / (double) num2) * 10);
	}
}

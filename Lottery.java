import java.lang.Math;
/*
 * 
 * Matthew Kim
 * 
 * Lottery
 * Goal: Create a program that will generate 6 random numbers from 0 to 50
 * 
 * Sept 24, 2020
 * 
 */
public class Lottery {
	public static void main(String [] args) {
		int i;
		for (i = 0; i < 6; i++)
			System.out.println((int) (Math.random()*50));
	}
}

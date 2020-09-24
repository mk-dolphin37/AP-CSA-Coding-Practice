/*
 * 
 * Matthew Kim
 * 
 * Goldilocks
 * 
 * Sept 22, 2020
 * 
 */
import java.lang.Math;
public class Goldilocks {
	public static void main(String [] args) {
		System.out.println("Goldilocks would like a cup of hot chocolate.");
		System.out.println("Please be sure that the temperature is just right,");
		System.out.println("or Goldie will reject it and ask for another cup.");
		int rand = 0;
		do {
			rand = (int) (Math.random()*168+32);
			System.out.println();
			System.out.println("The temperature is "+ rand);
			if (rand < 160)
				System.out.println("TOO COLD! Please bring another cup.");
			else if (rand > 180)
				System.out.println("TOO HOT! Please bring another cup.");
			else
				System.out.println("Just Right! Thank you.");
		} while (rand < 160 || rand > 180);
	}
}

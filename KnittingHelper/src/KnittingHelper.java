
/*
 * Author: Rachel Keenan
 * Date: 4/7/2025
 * Info: Program to help convert knitting patterns to the user's preferences
 * Future:	Add a skein calculator
 * 			Throw an error for invalid inputs
 * 			Add a loop to continually ask the user if they need any more help, then end the loop after the user is finished
 */

import java.util.Scanner;

public class KnittingHelper {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What do you need help with?"
				+ "\nA - Change my gauge"
				+ "\nB - Change from 'in the round' to 'flat'"
				+ "\nC - Change from 'flat' to 'in the round'");
		
		String s = scan.next();
		
		if((s.compareTo("A") == 0) || (s.compareTo("a") == 0)){
			
			System.out.println("Enter the number of cast on stitches in original pattern: ");
			int onco = scan.nextInt();
			
			while(onco <= 0) {
				System.out.println("Please enter a value greater than zero: ");
				onco = scan.nextInt();
			}
			
			System.out.println("Enter the number of stitches in original gauge: ");
			int ons = scan.nextInt();
			
			while(ons <= 0) {
				System.out.println("Please enter a value greater than zero: ");
				ons = scan.nextInt();
			}
			
			System.out.println("Enter the length of the stitches in original gauge: ");
			double ol = scan.nextDouble();
			
			while(ol <= 0) {
				System.out.println("Please enter a value greater than zero: ");
				ol = scan.nextDouble();
			}
			
			System.out.println("Enter the number of stitches in your new gauge: ");
			int nns = scan.nextInt();
			
			while(nns <= 0) {
				System.out.println("Please enter a value greater than zero: ");
				nns = scan.nextInt();
			}
			
			
			GaugeChanger.gaugeChanger(onco, ons, ol, nns);
			
			
		}
		else if((s.compareTo("B") == 0) || (s.compareTo("b") == 0)) {
			System.out.println("B");
			ToFlat.toFlat();
		}
		else if((s.compareTo("C") == 0) || (s.compareTo("c") == 0)) {
			System.out.println("C");
			ToRound.toRound();
		}
		else {
			System.out.println("Void");
			scan.close();
			return;
		}
		
		scan.close();
		
	}

}

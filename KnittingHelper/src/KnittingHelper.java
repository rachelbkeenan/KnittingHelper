
/*
 * Author: Rachel Keenan
 * Date: 4/8/2025
 * Info: Program to help convert knitting patterns to the user's preferences
 * Future:	Add a skein calculator
 * 			Throw an error for invalid inputs
 */

import java.util.Scanner;

public class KnittingHelper {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean help = true;
		String answer;
		
		while(help) {
		
			System.out.println("What do you need help with?"
					+ "\nA - Change my gauge"
					+ "\nB - Change from 'in the round' to 'flat'"
					+ "\nC - Change from 'flat' to 'in the round'");
			
			String s = scan.next();
		
			if((s.compareTo("A") == 0) || (s.compareTo("a") == 0)){
				
				System.out.println("Enter the number of cast on stitches in original pattern:");
				int onco = scan.nextInt();
				
				while(onco <= 0) {
					System.out.println("Please enter a value greater than zero:");
					onco = scan.nextInt();
				}
				
				System.out.println("Enter the number of stitches in original gauge:");
				int ons = scan.nextInt();
				
				while(ons <= 0) {
					System.out.println("Please enter a value greater than zero:");
					ons = scan.nextInt();
				}
				
				System.out.println("Enter the length of the stitches in original gauge:");
				double ol = scan.nextDouble();
				
				while(ol <= 0) {
					System.out.println("Please enter a value greater than zero:");
					ol = scan.nextDouble();
				}
				
				System.out.println("Enter the number of stitches in your new gauge:");
				int nns = scan.nextInt();
				
				while(nns <= 0) {
					System.out.println("Please enter a value greater than zero:");
					nns = scan.nextInt();
				}
				
				
				GaugeChanger.gaugeChanger(onco, ons, ol, nns);
				
				System.out.println("Do you need more help? Y/N");
				answer = scan.next();
				
				if((answer.compareTo("N") == 0) || (answer.compareTo("n") == 0)) {
					help = false;
				}
				
				
			}
			else{
				
				System.out.println("Enter the number of cast on stitches in the original pattern: ");
				int col = scan.nextInt();
				
				while(col <= 0) {
					System.out.println("Please enter a value greater than zero: ");
					col = scan.nextInt();
				}
				
				System.out.println("Enter the number of rows that repeat in the original pattern: ");
				int row = scan.nextInt();
				
				while(row <= 0) {
					System.out.println("Please enter a value greater than zero: ");
					row = scan.nextInt();
				}
				
				String[][] matrix = new String[row][col];
				
				System.out.println("Enter your pattern with spaces between each stitch type: ");
				
				for(int i = 0; i < row; i++) {
					for(int j = 0; j < col; j++) {
						matrix[i][j] = scan.next();
					}
				}
				
				if((s.compareTo("B") == 0) || (s.compareTo("b") == 0)) {
					ToFlat.toFlat(row, col, matrix);
					
					
					System.out.println("Do you need more help? Y/N");
					answer = scan.next();
					
					if((answer.compareTo("N") == 0) || (answer.compareTo("n") == 0)) {
						help = false;
					}
				}
				else if((s.compareTo("C") == 0) || (s.compareTo("c") == 0)) {
					ToRound.toRound(row, col, matrix);
					
					
					System.out.println("Do you need more help? Y/N");
					answer = scan.next();
					
					if((answer.compareTo("N") == 0) || (answer.compareTo("n") == 0)) {
						help = false;
					}
				}
			}
		
		}
		
		System.out.println("I hope your knitting goes well!");
		scan.close();
		
	}

}

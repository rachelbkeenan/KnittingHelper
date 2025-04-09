/*
 * Author: Rachel Keenan
 * Date: 4/8/2025
 * Info: Method to change pattern from "flat" to "in the round"
 * Based on: https://nimble-needles.com/tutorials/how-to-convert-a-knitting-pattern-from-in-the-round-to-flat-knitting/
 * Future: 	Should add more user-friendly instructions, like the different stitch types and their acronyms
 * 			Could use switch statements to clean up code.
 */

public class ToRound {

	public static void toRound(int rows, int cols, String[][] ogPattern){
		System.out.println("to round");
		
		
		String[][] newPattern = new String[rows][cols-2];
		
		
		//converting the pattern
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols-2; j++) {
				
				
				if(i%2 == 0) {								//the "right side" of the pattern
					newPattern[i][j] = ogPattern[i][j+1];
				}
				else {										//the "wrong side" of the pattern					
					String stitch = ogPattern[i][cols-j-2]; //for simplicity
					
					if(stitch.compareTo("k") == 0) {
						newPattern[i][j] = "p";
					}
					else if(stitch.compareTo("p") == 0) {
						newPattern[i][j] = "k";
					}
					else if(stitch.compareTo("ktbl") == 0) {
						newPattern[i][j] = "ptbl";
					}
					else if(stitch.compareTo("ptbl") == 0) {
						newPattern[i][j] = "ktbl";
					}
					else if(stitch.compareTo("k2tog") == 0) {
						newPattern[i][j] = "p2tog";
					}
					else if(stitch.compareTo("p2tog") == 0) {
						newPattern[i][j] = "k2tog";
					}
					else if(stitch.compareTo("ssk") == 0) {
						newPattern[i][j] = "ssp";
					}
					else if(stitch.compareTo("ssp") == 0) {
						newPattern[i][j] = "ssk";
					}
					else if(stitch.compareTo("m1r") == 0) {
						newPattern[i][j] = "m1pr";
					}
					else if(stitch.compareTo("m1pr") == 0) {
						newPattern[i][j] = "m1r";
					}
					else if(stitch.compareTo("m1l") == 0) {
						newPattern[i][j] = "m1pl";
					}
					else if(stitch.compareTo("m1pl") == 0) {
						newPattern[i][j] = "m1l";
					}
					else {
						newPattern[i][j] = "0";
					}
				}
				
			}
		}
		
		
		System.out.println("Your new pattern in the round is: ");
		
		//print new pattern
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols-2; j++) {
				System.out.print(newPattern[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
}

/*
 * Author: Rachel Keenan
 * Date: 4/8/2025
 * Info: Method to change pattern from "in the round" to "flat"
 * Based on: https://nimble-needles.com/tutorials/how-to-convert-a-knitting-pattern-from-in-the-round-to-flat-knitting/
 * Notes: Should add more user-friendly instructions, like the different stitch types and their acronyms
 */

public class ToFlat {

	public static void toFlat(int rows, int cols, String[][] ogPattern){
		
		String[][] newPattern = new String[rows][cols+2];
		
		
		//adding knits to the boarder for the seam of the garment
		for(int i = 0; i < rows; i++) {
			newPattern[i][0] = "k";
			newPattern[i][cols+1] = "k";
		}
		
		//converting the pattern
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				
				
				if(i%2 == 0) {								//the "right side" of the pattern
					newPattern[i][j+1] = ogPattern[i][j];
				}
				else {										//the "wrong side" of the pattern
					String stitch = ogPattern[i][cols-j-1]; //for simplicity
					
					if(stitch.compareTo("k") == 0) {
						newPattern[i][j+1] = "p";
					}
					else if(stitch.compareTo("p") == 0) {
						newPattern[i][j+1] = "k";
					}
					else if(stitch.compareTo("ktbl") == 0) {
						newPattern[i][j+1] = "ptbl";
					}
					else if(stitch.compareTo("ptbl") == 0) {
						newPattern[i][j+1] = "ktbl";
					}
					else if(stitch.compareTo("k2tog") == 0) {
						newPattern[i][j+1] = "p2tog";
					}
					else if(stitch.compareTo("p2tog") == 0) {
						newPattern[i][j+1] = "k2tog";
					}
					else if(stitch.compareTo("ssk") == 0) {
						newPattern[i][j+1] = "ssp";
					}
					else if(stitch.compareTo("ssp") == 0) {
						newPattern[i][j+1] = "ssk";
					}
					else if(stitch.compareTo("m1r") == 0) {
						newPattern[i][j+1] = "m1pr";
					}
					else if(stitch.compareTo("m1pr") == 0) {
						newPattern[i][j+1] = "m1r";
					}
					else if(stitch.compareTo("m1l") == 0) {
						newPattern[i][j+1] = "m1pl";
					}
					else if(stitch.compareTo("m1pl") == 0) {
						newPattern[i][j+1] = "m1l";
					}
					else {
						newPattern[i][j+1] = "0";
					}
				}
				
			}
		}
		
		
		System.out.println("Your new pattern is: ");
		
		//print new pattern
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols+2; j++) {
				System.out.print(newPattern[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}

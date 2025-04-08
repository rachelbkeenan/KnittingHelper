/*
 * Author: Rachel Keenan
 * Date: 4/7/2025
 * Info: Method to change gauge in pattern to preferred gauge
 * Based on: https://www.ashleylillis.com/blog/2021/4/14/how-to-change-knitting-gauge-in-a-pattern
 * 
 */

public class GaugeChanger {

	public static void gaugeChanger(int onco, int ons, double ol, int nns){
		
		//given 
		int ogNoCastOn = onco;		//number of cast on stitches in original pattern
		
		int ogNoStitches = ons;		//number of stitches in original gauge
		double ogLength = ol;		//length of stitches in original gauge
		
		int newNoStitches = nns;	//number of stitches in new gauge
		
		//calculated
		double castOnLength;		//length of cast on stitches in original pattern
		int newNoCastOn;			//number of cast on stitches in new pattern
		
		
		
		castOnLength = ogNoCastOn * ogLength / ogNoStitches;	//find cast on length the original pattern calls for
		
		newNoCastOn = (int) Math.round(newNoStitches * castOnLength / ogLength); 	//find number of cast on stitches needed (rounded)
		
		
		System.out.println("You should cast on " + newNoCastOn + " stitches to match the original pattern");
	}
	
	
}

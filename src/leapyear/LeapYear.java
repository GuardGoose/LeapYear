/**
 * 
 */
package leapyear;

import java.util.Arrays;

/**
 * @author User
 *
 */
public class LeapYear {
	
	public static void main(String[] args) {
		LeapYear.calcYear(2019);
	
	}
	
	public static void calcYear(int year) {
		int[] yArray;
		yArray = new int[20];
		int i = 0;
		int y = 0;
		year = y;
		
		while (i < 20) {
			if(y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) {
				yArray[i] = y;
				i++;
			} else {
				i++;
			} if (i == 20) {
					for (int a = 0; a < yArray.length; a++) {
						System.out.print(yArray[a]+" ");
					} 
			}
		}
		
	}
	

}

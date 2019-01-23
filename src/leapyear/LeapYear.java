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
		int[] yArray;
		yArray = new int[20];
		int year = 2019;
		int i = 0;
		
		if (i < 20) {
			if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				yArray[i] = year;
				System.out.println(Arrays.toString(yArray));
				i++;
			} else {
				i++;
			}
		} else {
			System.out.println(Arrays.toString(yArray));
		}
		
	
	}

}

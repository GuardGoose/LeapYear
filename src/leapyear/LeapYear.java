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
	
	private static void printArray(int[] anArray) {
		
		System.out.println(anArray.toString());
		
	}	
	public static void calcYear(int year) {
		int[] yArray;
		yArray = new int[20];
		int i = 0;
		int y = 0;
		y = year ;
		
		while (i <= 19) 
		{
			if((y % 4 == 0) && (y % 100 != 0)) 
			{
				System.out.println(y);
				i++;
				y++;
			}	
			else 
			{
				i++;
				y++;
			} 
		}
		
	}
	

}
	


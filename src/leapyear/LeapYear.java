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
		int i = 0;
		int y = 0;
		y = year ;
		
		while (i != 20) 
		{
			if((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
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
	


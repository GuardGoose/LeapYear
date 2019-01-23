/**
 * 
 */
package leapyear;

import java.util.Scanner;
/**
 * @author User
 *
 */
public class LeapYear {
	
	public static void main(String[] args) {
		
		// inits
		
		Scanner sc = new Scanner(System.in);
		int year;
		
		// prompt for year
		System.out.println("Enter your year: ");
		year = sc.nextInt();
		sc.close();
		
		// Calls function to calculate leap year
		
		LeapYear.calcYear(year);
	
	}

	public static void calcYear(int year) {
		
		// inits
		
		int i = 0;
		int y = 0;
		y = year ;
		
		// Main body
		// Opens while loop and then checks
		// if a leap year and then prints if true
		while (i != 20)
		{
			if((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
			{
				System.out.println(y);
				// Increments year and counter
				i++;
				y++;
			}	
			else // If not a leap year then just increment
			{
				i++;
				y++;
			} 
		}	
	}	
}
	


package programming1CriticalThinking5;

import java.util.Scanner;

/**This is a program that will calculate the total, average, maximum, minimum, and
 * interest of 20% of the total of five floating point values provided by the user. Thus, meeting the 
 * requirements for Option 1 of the Module 4 Critical Thinking exercise.

 * @author Shayna Almond
 *
 *			Code adapted from:
 * 			Figure 4.3.3 Programming in Java  
 * 			Challenge Activity 4.3.3 Programming in Java
 * 			Figure 4.4.3 Programming in Java 
 * 			Figure 4.7.2 Programming in Java 
 * 			Figure 4.9.2 Programming in Java 
 * 			Table 4.10.1 Programming in Java 
 * 			Video CSC 320 CT4
 * 			Example 1 7 Ways To Format Double To 2 Decimal Places In Java
 */

public class Programming1CT5 {
	
	/**
	 * Initialize scanner
	 * Initialize variables for calculations
	 * Use a while loop to iterate 5 times
	 * Request user to input values
	 * Calculate the total, average, maximum, minimum, and 20% interest
	 * Print results for user on separate lines
	 */

	public static void main(String[] args) {
		
		//Initialize scanner for input
		Scanner scanner = new Scanner(System.in);
		
		//Initialize variables needed for calculations
		float maxNum = 0.0f;
		float minNum = 999999999.9f;
		float currValue;
		float sumTotal = 0.0f;
		double interest = 0;
		double average = 0;
				
		{
			int i = 0;
			
			//While loop to iterate 5 times
			while (i < 5) {							
				System.out.println("Enter floating-point value #" + (i + 1) + ": ");  //Prompt user to input numbers
				++i;
				currValue = scanner.nextFloat(); 	//Assign entered value for each iteration
				
				sumTotal += currValue;				//Calculate total sum of all numbers
				average = sumTotal / i;				//Calculate average
				interest = (sumTotal * 0.2);		//Calculate interest at 20%
			 				
				if (i == 0) {						//Calculate maximum
					maxNum = currValue;
				} else if (currValue > maxNum) {
					maxNum = currValue;
				}
				if (i == 0) {						//Calculate minimum
					minNum = currValue;
				} else if (currValue < minNum) {
					minNum = currValue;
				}
			}
						
		scanner.close();							//Close scanner
		
		System.out.println("Total: " + String.format("%.2f", sumTotal));		//Print total
		System.out.format("Average: %.2f%n", average);							//Print average
		System.out.format("Max: %.2f%n", maxNum);								//Print maximum
		System.out.format("Min: %.2f%n", minNum);								//Print minimum
		System.out.println("20% interest: " + String.format("%.2f", interest));	//Print 20% interest of total
	
		}
	}
}

import java.util.Scanner;  // Scanner is in the java.util package
import java.lang.Math; ; // Math functions are in the java.util package

/* Name: Jonathan Fink  
   Assignment: Project 1
   
   This program was created to calculate and display future investment value 
   based on initial investment amount, annual interest rate, and number of years. 
   The user will be asked to input initial investment amount, annual interest
   rate, and number of years the investment is held. The calculation is done using 
   those user inputs. The calculation formula: futureInvestmentValue = investmentAmount
    x (1 + monthlyInterestRate) numberOfYears * 12*/


public class FutureValue {
	
	private static Scanner input; //Scanner visible to the current class - that is main())

	public static void main(String[] args) {
		input = new Scanner (System.in);
		
		//prompt user to input investment amount
		System.out.println("Please enter your investment amount");
		//set up variable for investment
		double inv_amnt = input.nextDouble(); 
		
		//prompt user to input investment rate
		System.out.println("Please enter your annual interest rate on the investment");
		//set up variable for annual interest rate 
		double interest_rate = input.nextDouble();
		
		//prompt user to input total number of years amount is invested
		System.out.println("Please enter the total number of years of your investment");
		//set up variable for number of years
		double num_years = input.nextDouble();
		
		//set up future value calculation variables
		double rate = (interest_rate / 100);
		double monthly_rate = (rate / 12);
		double total_time_invested = (num_years * 12);
				
		//compute future value
		double futurevalue = inv_amnt * Math.pow(( 1.0 + monthly_rate), total_time_invested);
		
		
		//display result rounded to the nearest 100th decimal place
		System.out.println("The future value of your investment is " + (double) Math.round(futurevalue * 100.0) / 100.0);
		 
		}
}
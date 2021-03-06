import java.util.Scanner;
/**
This program demonstrates how numeric types and operators behave in Java
Do Task #1 before adding Task#2 where indicated.
*/
public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		Scanner object = new Scanner(System.in);
		//identifier declarations
		final double numberOfScores = 2 ; // number of scores
		//double score1 = 100; // first test score
		//double score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		int fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		int temp;
		double score1, score2;
		//Task #2 prompt user to input score1
		System.out.println("Enter first score: ");
		//Task #2 read score1 
		score1 = object.nextInt();
		//Task #2 prompt user to input score2
		System.out.println("Enter second score: ");
		//Task #2 read score2 
		score2 = object.nextInt();
		// Find an arithmetic average
		average = (score1+score2)/numberOfScores;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (BOILING_IN_F - 32)*5/9;
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		System.out.println("Enter your temperature: ");
		//Task #2 read the user’s temperature in Fahrenheit
		temp = object.nextInt();
		//Task #2 convert the user’s temperature to Celsius
		int convertFtoC;
		convertFtoC = (temp - 32)*5/9;
		//Task #2 print the user’s temperature in Celsius
		System.out.println(temp + " in Fahrenheit is " + convertFtoC + " in Celsius.");
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
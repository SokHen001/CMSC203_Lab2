import java.util.Scanner;

public class SphereVolume 
{ 
	public static void main(String[] args) 
	{
		System.out.println("If you need help with calculating the" +
							"volume of a sphere, you're in the right place.");
		Scanner object = new Scanner(System.in);
		System.out.println("\nEnter the diameter of a sphere:");
		double diam;
		diam = object.nextDouble();
		double rad = diam/2;
		
		double vol;
		vol = 4/3*Math.PI*Math.pow(rad, 3);
		System.out.println("The volume of the sphere is " + vol);
	}
	
}
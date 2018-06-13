import java.lang.Math;
import java.util.Scanner;

public class travelTime {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int miles;
		int milesPerHour;
		int hours;
		int minutes;
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("Enter miles: ");
			miles = (int) sc.nextDouble();
			hours = miles/12;
			minutes = miles/60;
			
			System.out.print("Enter miles per hour: ");
			milesPerHour = (int) sc.nextDouble();
			hours = milesPerHour/12;
			minutes = milesPerHour/60;
			
			System.out.println("Estimated travel time \n" + 
			                    "Hours : " + hours + "\n" +
					            "Minutes: " + minutes);
			System.out.println();
			
			System.out.print("Continue: (y/n): ");
			choice = sc.next();
			System.out.println();
			
		}

	}

}

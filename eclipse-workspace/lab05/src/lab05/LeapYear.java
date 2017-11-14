package lab05;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Leap Year Calculation");
		System.out.print("Enter the year: ");
		int y = sc.nextInt();
		int y2 = y%4;
		
			switch(y2) {
			
			case 0:
				System.out.println(y+" is a leap year");
				System.out.println("The number of days in "+y+" is 366");
				
				break;
				
			case  1: case 2: case 3:
				System.out.println(y+" is NOT a leap year");
				System.out.println("The number of days in "+y+" is 365");
				
				break;
				
			default:
				System.out.println("Invalid input");
				}
			}
}
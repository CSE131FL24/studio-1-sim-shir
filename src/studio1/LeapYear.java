package studio1;
import java.util.Scanner;

public class LeapYear {

public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Please enter a year: ");
		int year = in.nextInt();
		boolean leapyr = false;
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			leapyr = true;
		}
		
		System.out.println(year + " is a leap year: " + leapyr);
			

}
}
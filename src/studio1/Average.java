package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in n1, the first of two integers to be averaged:");
		int n1 = in.nextInt();
		System.out.println("Enter in n2, the second of two integers to be averaged:");
		int n2 = in.nextInt();
		double average;
		average = (n1+n2)/2;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + average);
	}

}

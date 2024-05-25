package Project1;
import java.util.Scanner;
public class Leap_year {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year:");
		int n=sc.nextInt();
		if(n%400==0 || n%4==0) {
			System.out.print("Leap Year");
		}
		else {
			System.out.print("Not a leap year");
		}
	}

}

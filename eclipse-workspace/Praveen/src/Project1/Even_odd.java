package Project1;

import java.util.Scanner;
public class Even_odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n=sc.nextInt();
		if(n%2==0 ) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
	}

}
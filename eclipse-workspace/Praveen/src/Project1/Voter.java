package Project1;

import java.util.Scanner;
public class Voter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your age:");
		int n=sc.nextInt();

		if(n>=18&&n<59) {
			System.out.print("Eligble");
		}
		else if(n>=60){
			System.out.print("Citizen");
		}
		else {
			System.out.print("not eligble");
		}
	}
		
}

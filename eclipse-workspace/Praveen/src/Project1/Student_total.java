package Project1;

import java.util.Scanner;
public class Student_total {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st sub");
		String s1=sc.nextLine();
		System.out.println("Enter the 1st sub mark" );
		int a=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the 2nd sub");
		String s2=sc.nextLine();
		System.out.println("Enter the 2nd sub mark" );
		int b=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the 3rd sub");
		String s3=sc.nextLine();
		System.out.println("Enter the 3rd sub mark" );
		int c=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the 4th sub");
		String s4=sc.nextLine();
		System.out.println("Enter the 4th sub mark" );
		int d=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the 5th sub");
		String s5=sc.nextLine();
		System.out.println("Enter the 5th sub mark" );
		int e=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Total = ");
		System.out.println(a+b+c+d+e);
		
		System.out.println("Average = ");
		System.out.println((a+b+c+d+e)/2);
		
		
		
	}

}

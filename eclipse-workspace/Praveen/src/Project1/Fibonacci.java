package Project1;

import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int i=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(i<=n) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			i++;
		}
		
	}

}

package Project1;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c=0;
		if(n<=1) {
			System.out.println("Not a prime number");
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}

}

package Project1;
import java.util.Scanner;
public class Withdraw {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
			int n=1000;
			System.out.println("Enter your pin:");
			int a=sc.nextInt();
			int pin=1234;
			if(pin==a) {
				System.out.println("Enter your amount:");
				int m=sc.nextInt();
				if(m>=1000) {
					System.out.println("Insufficient balance");
				}
				else{
					n=n-m;
					System.out.println("Remaining balance");
					System.out.println(n);
				}
			}
			else{
				System.out.println("Error");
			}
			
		}
}

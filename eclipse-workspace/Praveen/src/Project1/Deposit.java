package Project1;
import java.util.Scanner;
public class Deposit {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int pin=1234;
        int balance = 1000;
        
        System.out.println("Enter your pin:");
        int ep = sc.nextInt();
        
        if(ep == pin) {
            System.out.println("Enter deposit amount:");
            int da = sc.nextInt();
            
            int total = 0;
            System.out.println("Select number of denomination for each notes");
            System.out.print("Number of 2000 notes:");
            int a=sc.nextInt();
            total+=a*2000;
            System.out.print("Number of 1000 notes:");
            int b=sc.nextInt();
            total+=b*1000;
            System.out.print("Number of 500 notes:");
            int c=sc.nextInt();
            total+=c*500;
            System.out.print("Number of 200 notes:");
            int d=sc.nextInt();
            total+=d*200;
            System.out.print("Number of 100 notes:");
            int e=sc.nextInt();
            total+=e*100;
            
            if(total==da) {
            	System.out.print("Successfully deposited");
            }
            else {
            	System.out.print("Incorrect denomination total");
            }
        }
	}
		
}

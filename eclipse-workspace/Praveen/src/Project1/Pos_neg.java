package Project1;
import java.util.Scanner;
public class Pos_neg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative number");
		}
	}

}

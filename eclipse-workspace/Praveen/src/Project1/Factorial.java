package Project1;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int fac=1;
        int i=1;
        while(i<=n) {
        	fac=fac*i;
        	i++;
        }
        System.out.println(fac);
    }

}

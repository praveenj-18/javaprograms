package Project1;
import java.util.Scanner;
public class Eq1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int i=1;
        int a=9;
        int b=a;
        while(i<=n){
            System.out.println(a);
            a=a*10+b;
            i++;
        }
	}

}

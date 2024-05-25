package Project1;
import java.util.Scanner;
public class Eq2 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int i=1;
        int a=1;
        int j=i;
        while(i<=n){
            System.out.println(j);
            a++;
            j=j*10+a;
            i++;
        }
    }

}

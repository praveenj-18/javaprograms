
package Project1;

import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print("9");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}

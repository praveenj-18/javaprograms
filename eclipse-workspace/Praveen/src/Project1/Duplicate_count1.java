package Project1;

import java.util.Scanner;

public class Duplicate_count1 {
	public static void main(String[] args) {
		System.out.print("Enter array size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count;
		System.out.println("Enter array values one by one:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && a[i]!=0) {
					a[j]=0;
					count++;
				}
			}
			if(count>0) {
				System.out.println(a[i]+" "+count);	
			}
		}
	}

}

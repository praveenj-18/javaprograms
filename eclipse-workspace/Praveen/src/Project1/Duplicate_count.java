package Project1;

import java.util.Scanner;

public class Duplicate_count {
	public static void main(String[] args) {
		System.out.print("Enter array size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		boolean counted[]=new boolean[n];
		System.out.println("Enter array values one by one:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(!counted[i]) {
				int count=1;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
						counted[j]=true;
					}
				
				}
				if(count>1) {
					System.out.println(a[i]+" "+count);
				}
			}
		}
	}

}

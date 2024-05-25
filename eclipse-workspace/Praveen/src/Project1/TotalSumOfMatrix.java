package Project1;

import java.util.Scanner;

public class TotalSumOfMatrix {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[][]= new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int Total=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                Total+=a[i][j];
            }
        }
        System.out.println("Sum of all the values inside the matrix :"+Total);
    }

}

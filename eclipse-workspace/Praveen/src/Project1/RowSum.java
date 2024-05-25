package Project1;

import java.util.Scanner;
public class RowSum {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[][]= new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            int row=0;
            for(int j=0;j<a[i].length;j++){
                row+=a[i][j];
            }
            System.out.println("Sum of "+(i+1)+" "+"row is "+row);
        }
    }

}

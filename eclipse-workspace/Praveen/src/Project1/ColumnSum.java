package Project1;

import java.util.Scanner;
public class ColumnSum {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[][]= new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<a.length;j++){
            int column=0;
            for(int i=0;i<a.length;i++){
                column+=a[i][j];
            }
            System.out.println("Sum of "+(j+1)+" "+"column is "+column);
        }
    }

}

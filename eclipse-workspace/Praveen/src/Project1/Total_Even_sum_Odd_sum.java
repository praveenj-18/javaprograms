package Project1;
import java.util.Scanner;
public class Total_Even_sum_Odd_sum {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int total=0;
        int even_sum=0;
        int odd_sum=0;
        System.out.println("Enter array values one by one:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            total=total+arr[i];
        }
        for(int i=0;i<arr.length;i+=2){
            even_sum=even_sum+arr[i];
        }
        for(int i=1;i<arr.length;i+=2){
            odd_sum=odd_sum+arr[i];
        }
        System.out.println("total="+total);
        System.out.println("even_sum="+even_sum);
        System.out.println("odd_sum="+odd_sum);
    }
}


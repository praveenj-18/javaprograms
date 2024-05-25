package Project1;

public class Pattern1 {
	public static void main(String[] args) {
        int n=4;
        int space=n-1;
        int num1=1;
        int num2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=num1;j++){
                System.out.print(j);
            }
            for(int j=num2;j>=1;j--){
                System.out.print(j);
            }
            space--;
            num1++;
            num2++;
            System.out.println("");
            
        }
    }

}

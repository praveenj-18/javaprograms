package Project1;

public class Pattern2 {
	public static void main(String[] args) {
        int n=4;
        int space=n-1;
        int num1=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            System.out.print(1);
            if(i==0){
                System.out.print("");
            }
            else if(i==1){
                System.out.print(0);
            }
            else{
                for(int j=0;j<num1;j++){
                System.out.print(0);
                }
                num1=num1+2;
            }
            if(i>0){
                System.out.print(1);
            }
            space--;
            System.out.println("");
        }
    }
}



package Project1;

public class Pattern5 {
	public static void main(String[] args) {
        int line=4;
        int space=line-1;
        int k=3;
        int n=5;
        for(int i=1;i<=line;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            if(i==1){
                System.out.print(1);
            }
            else if(i%2==0){
                for(int j=1;j<=k;j++){
                    System.out.print(0);
                }
                k=k+4;
            }
            else{
                for(int j=1;j<=n;j++){
                    System.out.print(1);
                }
                n=n+4;
            }
            space--;
            System.out.println("");
        }
    }

}

package Project1;

public class Pattern4 {
	public static void main(String[] args) {
        int line=4;
	        int n=3;
	        int k=2;
	        int space=line-1;
	        for(int i=0;i<line;i++){
	            for(int j=0;j<space;j++){
	                System.out.print(" ");
	            }
	            if(i==0) {
	            	System.out.print(1);
	            }
	            else {
	            	for(int j=0;j<n;j++){
		                System.out.print(k);
		                k++;
		            }
		            n=n+2;
	            }
	            System.out.println("");
	            space--;
	        }
   }

}

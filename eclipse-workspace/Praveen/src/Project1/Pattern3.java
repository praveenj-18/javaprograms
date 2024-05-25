package Project1;

public class Pattern3 {
	 public static void main(String[] args) {
	        int line=4;
	        int star=line+line-1;
	        int space=0;
	        for(int i=0;i<line;i++){
	            for(int j=0;j<space;j++){
	                System.out.print(" ");
	            }
	            for(int j=star;j>=1;j--){
	                System.out.print(j);
	            }
	            System.out.println("");
	            space++;
	            star=star-2;
	        }
	    }
}

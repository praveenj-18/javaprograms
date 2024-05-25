package Project1;

public class Pattern_reverse {
	 public static void main(String[] args) {
	        int line=5;
	        int star=line+line-1;
	        int space=0;
	        for(int i=0;i<line;i++){
	            for(int j=0;j<space;j++){
	                System.out.print(" ");
	            }
	            for(int j=0;j<star;j++){
	                System.out.print("*");
	            }
	            System.out.println("");
	            space++;
	            star=star-2;
	        }
	    }

}

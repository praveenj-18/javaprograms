package Project1;

public class Squarepattern {
	public static void main(String[] args) {
        int line=4;
        int space=0;
        int star=line+line-1;
        for(int i=0;i<line;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            space++;
            star=star-2;
            System.out.println("");
            
        }
    }

}

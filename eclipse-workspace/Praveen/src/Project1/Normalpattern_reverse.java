package Project1;

public class Normalpattern_reverse {
	public static void main(String[] args) {
        int line=4;
        int space=0;
        int star=line;
        for(int i=0;i<line;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            space++;
            star--;
            System.out.println("");
        }
    }

}

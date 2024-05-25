package Project1;

public class Reverse_string {
	public static void main(String[] args) {
        String a="hello";
        char c[]=a.toCharArray();
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(c[i]);
        }
        
}

}

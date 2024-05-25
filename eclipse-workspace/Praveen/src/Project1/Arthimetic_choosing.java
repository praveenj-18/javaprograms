package Project1;

import java.util.Scanner;

class Add{
	
	static int add(int num1,int num2) {
		return num1 + num2;
	}
}
class Sub{
	static int sub(int num1,int num2) {
		return num1-num2;
	}
}
class Mul{
	static int mul(int num1,int num2) {
		return num1*num2;
	}
}
class Div{
	static int div(int num1,int num2) {
		return num1/num2;
	}
}
public class Arthimetic_choosing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choose = scanner.nextInt();

        System.out.print("Enter two numbers:");
        int num1 = scanner.nextInt();
        int	num2 = scanner.nextInt();
        
        int result;
        switch(choose) {
        	case 1:
        		result=Add.add(num1,num2);
        		System.out.println("Result="+result);
        		break;
        	case 2:
        		result=Sub.sub(num1, num2);
        		System.out.println("Result="+result);
        		break;
        	case 3:
        		result=Mul.mul(num1,num2);
        		System.out.println("Result="+result);
        		break;
        	case 4:
        		result=Div.div(num1,num2);
        		System.out.println("Result="+result);
        		break;
        	default:
        		System.out.println("Invalid choice");
        		break;
        	
        }
	}
	
}

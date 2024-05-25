package Project1;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.LinkedHashSet;

/*n=input().split()
//list1=[int(x) for x in n]
//unique_value=set(list1)
//list1=list(unique_value)
print(list1)*/
/*Set<Integer>: This declares a variable named set of type Set<Integer>. 
 In Java, Set is an interface that represents an unordered collection of unique elements.
 Integer specifies the type of elements that the set will hold, in this case, integers.
 new LinkedHashSet<>(): This part creates a new instance of the LinkedHashSet class.
 LinkedHashSet is a class in Java that implements the Set interface and maintains the insertion order of elements. 
 It ensures that the elements are stored in the order in which they were added to the set. 
 The angle brackets <> denote a generic type, and in this case, it indicates that the LinkedHashSet will contain integers.
 So, overall, this line of code creates a new LinkedHashSet object named set, which will store unique integers and maintain their insertion order. 
 This set will be used to store the unique elements from the input array later in the program.*/
public class Unique_elements {
	public static int[] removeDuplicate(int a[] ,int size){
		Set<Integer> set=new LinkedHashSet<>();
		for(int i:a) {
			set.add(i);
		}
		int result[]=new int[set.size()];
		int index=0;
		for(int i:set) {
			result[index++]=i;
		}
		System.out.println("Unique elementin the array:");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		return result;

	}
	public static void main(String[] args) {
		System.out.println("Enter array size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array values one bye one");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int[] unique=removeDuplicate(a,size);
		Arrays.sort(unique);
		System.out.println("\nArray after sorting:");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }
		
		
	}

}

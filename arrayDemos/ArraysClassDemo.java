package arrayDemos;

import java.util.Arrays;

public class ArraysClassDemo 
{
	public static void main(String[] args) 
	{
		
		int[] A={2,6,4,8,10};
		
		int[] B={7,3,9,5,1};
		
		System.out.println("Array A is:");
		for (int i : A)		
			System.out.print(i+" ");
			
		
		System.out.println("\n\nArray B is:");
		for (int i : B) 		
			System.out.print(i+" ");		
		
		//Sorting Operation
		Arrays.sort(A);
		
		System.out.println("\n\nAfter sorting, Array A is:");
		for (int i : A)		
			System.out.print(i+" ");
		
		Arrays.sort(B,1,4);//
		
		System.out.println("\n\nAfter sorting from index 1 to 3, Array B is:");
		for (int i : B)		
			System.out.print(i+" ");
		
		
		//Search operation
		int s1=Arrays.binarySearch(A, 4);
		int s2=Arrays.binarySearch(A, 1,3,6);
		int s3=Arrays.binarySearch(A, 1,3,7);//-(insertion point 3) -1)//key value within range
		int s4=Arrays.binarySearch(A, 1,3,9);//-(insertion point 4)//key value greater than range
		int s5=Arrays.binarySearch(A, 1,3,3);//-(insertion point 4)//key value greater than range
		int s6=Arrays.binarySearch(A, 0,2,3);//-(insertion point 1) -1)//key value within range
		int s7=Arrays.binarySearch(A, 0,2,1);//-(insertion point 0)//key value greater than range
				
		System.out.println("\n\nKey 4 is found in A at index "+s1);
		System.out.println("S2= "+s2);
		System.out.println("S3= "+s3);
		System.out.println("S4= "+s4);
		System.out.println("S5= "+s5);
		System.out.println("S6= "+s6);
		System.out.println("S7= "+s7);	
		
		
		//Compare Operation
		int[] C= {10,15,40,25};
		int[] D= {10,15,40,25};
		int[] E= {10,15,30,45};
		int[] F= {10,15,50,45};
		
		System.out.println("\nAre C and D equal?");
		System.out.println(Arrays.compare(C, D));
		
		System.out.println("\nAre C and E equal?");
		System.out.println(Arrays.compare(C, E));
		
		System.out.println("\nAre C and F equal?");
		System.out.println(Arrays.compare(C, F));
	
		System.out.println("\nAre C and D equal?");
		System.out.println(Arrays.compare(C,0,3,D,0,3));//ToIndex:Exclusive(3-1=2)
		
		System.out.println("\nAre C and E equal?");
		System.out.println(Arrays.compare(C,0,3, E,0,3));//ToIndex:Exclusive(3-1=2)
		
		//Equals Operation	
				
		System.out.println("\nAre C and D equal?");
		System.out.println(Arrays.equals(C, D));
				
		System.out.println("\nAre C and E equal?");
		System.out.println(Arrays.equals(C,0,2, E,0,2));//ToIndex:Exclusive(2-1=1)
		
		System.out.println("\nAre C and E equal?");
		System.out.println(Arrays.equals(C,0,3, E,0,3));//ToIndex:Exclusive(3-1=2)
		
		
		//Fill Operation
		//int[] A={2,4,6,8,10};
		
		System.out.println("Array A is:");
		for (int i : A)		
			System.out.print(i+" ");
		
		Arrays.fill(A, 10);	
		
		System.out.println("\n\nArray A after filling value 10 is:");
		for (int i : A)		
			System.out.print(i+" ");
		
		Arrays.fill(A,1,3, 20);//ToIndex:Exclusive(3-1=2)
		
		System.out.println("\n\nArray A after filling value 20 from index 1 to 3 is:");
		for (int i : A)		
			System.out.print(i+" ");
		
		
		//toString Operation		
	    //int[] A={2,6,4,8,10};
		
		System.out.println("\nArray A is:");
		for (int i : A)		
			System.out.print(i+" ");
		
		System.out.println("\nThe string representation of array is:");
	    System.out.println(Arrays.toString(A));  		
		
	}

}

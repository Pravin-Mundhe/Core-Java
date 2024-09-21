
public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		int a[];
		a=new int[2];	//or int[] a= new int[2];
		
		a[0]=10;
		a[1]=20;
		
		System.out.println("First element of array is: "+a[0]);
		System.out.println("second element of array is: "+a[1]);		
		System.out.println("Array length is:"+a.length);
		//System.out.println("second element of array is: "+a[2]);
				
		int[] b= new int[] {10,20};	
		System.out.println("b[0] is "+b[0]);
		
		//array clone- new array object will be created
		int[] c=a; 
		System.out.println(c[0]);		
	}

}

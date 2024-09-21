package arrayDemos;

public class OneDArrayDemo1 
{
	public static void main(String[] args) 
	{
		int a[];	//array declaration
		a=new int[5];	//or int[] a = new int[5];	// instantiation
		
		a[0]=10;	//initialization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;		
		
		System.out.println("First element of array is: "+a[0]);		
		System.out.println("Second element of array is: "+a[1]);
		System.out.println("Third element of array is: "+a[2]);		
		System.out.println("Fourth element of array is: "+a[3]);
		System.out.println("Second element of array is: "+a[4]);		
		//System.out.println(a[5]);
		
		System.out.println("Array length is: "+a.length);		
		/*		
		int[] b= new int[] {10,20};	
		System.out.println("b[0] is "+b[0]);
		
		boolean[] c= {false,true};	
		System.out.println("c[0] is "+c[0]);
		System.out.println("c[1] is "+c[1]);		
		*/
	}

}

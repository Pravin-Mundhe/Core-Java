package exceptionHandling;

public class EHDemo4 
{
	public static void main(String[] args) 
	{
		try 
		{
			int[] a= {1,2};
			System.out.println(a[3]);	
			int x=0,y=10;
			int z=y/x;						
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Division by zero.");						
		}	
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOOB");
		}
	}

}

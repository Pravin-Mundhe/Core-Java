package exceptionHandling;

public class EHDemo3 
{
	public static void main(String[] args) 
	{
		int x=0,y=10;
		for(int i=-2; i<3; i++) 
		{
			try 
			{
				x=y/i;
				System.out.println("x= " + x);
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("Division by zero.");
				i = 1;				
			}			
		}
	}
}

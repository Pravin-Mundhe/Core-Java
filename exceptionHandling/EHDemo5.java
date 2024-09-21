package exceptionHandling;

public class EHDemo5 
{
	static void show() 
	{
		try 
		{
			throw new NullPointerException("NPE");
		} 
		catch(NullPointerException e) 
		{
			System.out.println("Caught inside show()");
			throw e; // rethrow the exception
		}
	}
	public static void main(String args[]) 
	{
		try 
		{
			show();
		} 
		catch(NullPointerException e) 
		{
			System.out.println("Recaught: " + e);
		}
	}
}

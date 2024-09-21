package exceptionHandling;

public class EHDemo6 
{
	static void test() throws NullPointerException 
	{
		System.out.println("In test()");
		/*String str=null;
		System.out.println(str.length());*/
		throw new NullPointerException("NULL");		
	}
	public static void main(String args[]) 
	{	
		try 
		{
			test();
		} 
		catch (NullPointerException e) 
		{
			System.out.println("Caught " + e);
		}
	}
}

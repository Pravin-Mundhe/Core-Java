package exceptionHandling;

public class EHTDemo9 
{
	static void validate(int age) throws InvalidAge
	{
		if (age<18)
			throw new InvalidAge("Age is invalid");
		else
			System.out.println("Welcome");
	}
	public static void main(String[] args) 
	{
		try
		{
			validate(15);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

package inheritance;

public class FinalBlank 
{	
	final double pi;	//final blank or uninitialized variable
	FinalBlank()
	{
		pi=3.14;
		
	}
	final static double g;	//final blank static variable
	static
	{
		g=9.8;
	}
	public static void main(String[] args)
	{
		FinalBlank obj=new FinalBlank();
		System.out.println(obj.pi);
		System.out.println(g);
	}
}

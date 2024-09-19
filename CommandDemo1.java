
public class CommandDemo1 
{
	public static void main(String[] a) 
	{
		System.out.println("You entered the following arguments");
		int i=0;
		for (i = 0; i < a.length; i++) 
		{
			System.out.println("a["+i+"]: "+a[i]);
		}	
	}
}

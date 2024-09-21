package command;
//varargs method overloading can produce ambiguity
public class CommandDemo5 
{	
	static void varTest(int ... a ) 
	{
		System.out.print("Passed arguments are: ");		
		for(int i : a)
			System.out.print(i + " ");		
		System.out.println();
	}	
	
	static void varTest(boolean ... v ) 
	{
		System.out.print("Passed arguments are: ");
		for(boolean i : v)
			System.out.print(i + " ");		
		System.out.println();
	}
	
	public static void main(String args[])
	{				
		varTest(10, 20, 30); 
		varTest(true, false, true); 
		//varTest(); 		
	}
}

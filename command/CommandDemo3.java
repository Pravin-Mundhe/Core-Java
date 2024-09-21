package command;

public class CommandDemo3 
{
	void varTest(int ... a ) 
	{
		System.out.print("Number of arguments: "+a.length +" Contents are: ");
		for(int i : a)
			System.out.print(i + " ");		
		System.out.println();
	}
	public static void main(String args[])
	{
		CommandDemo3 obj=new CommandDemo3();	
		
		// Notice how vaTest() can be called with a 
		//variable number of arguments
		
		obj.varTest(10); // 1 argument
		obj.varTest(10, 20, 30); // 3 arguments
		obj.varTest(); // no argument
	}	
}

package command;

public class CommandDemo2 
{
	void varTest(int a[]) 
	{
		System.out.print("Number of arguments: "+a.length +" Contents are: ");
		for(int i : a)
			System.out.print(i + " ");		
		System.out.println();
	}
	public static void main(String args[])
	{
		CommandDemo2 obj=new CommandDemo2();
		// Notice how an array must be created to hold the arguments
		int n1[] = { 10 };
		int n2[] = { 10, 20, 30};
		int n3[] = { };
		
		obj.varTest(n1); // 1 argument
		obj.varTest(n2); // 3 arguments
		obj.varTest(n3); // no argument
	}	
}

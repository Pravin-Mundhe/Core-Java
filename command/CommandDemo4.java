package command;

public class CommandDemo4 
{
	void varTest(int ... a ) 
	{
		System.out.print("Passed arguments are: ");		
		for(int i : a)
			System.out.print(i + " ");		
		System.out.println();
	}
	
	void varTest(double ... a ) //write at last , int ... b
	{
		System.out.print("Passed arguments are: ");
		for(double i : a)
			System.out.print(i + " ");		
		System.out.println();
	}
	
	void varTest(double d, int ... a) //write , int b at last 
	{
		System.out.print("Passed arguments are: ");
		System.out.print(d+" ");
		for(int i : a)
			System.out.print(i + " ");		
		System.out.println();
	}
	
	public static void main(String args[])
	{
		CommandDemo4 obj=new CommandDemo4();	
				
		obj.varTest(10, 20, 30); 
		obj.varTest(10.5, 20.5, 30.5); 
		obj.varTest(10.5, 20, 30); 
		obj.varTest(10.5, 20, 30, 40.5);
	}

}

package recursionDemo;

public class RecursionDemo1 
{
	public void display(int i)	//recursive method
	{
		if(i==0)	//termination condition
				return;
		System.out.println("Current value of i is: "+i);
		display(i-1);	//recursive call
		//System.out.println("\nCurrent value of i is: "+i);
	}
	
	public static void main(String[] args) 
	{
		RecursionDemo1 obj=new RecursionDemo1();
		obj.display(5);	//call to recursive method
	}
}

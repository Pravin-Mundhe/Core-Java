package recursionDemo;

public class RecursionDemo2 
{
	//Recursion using static method
	static void display(int i)
	{
		if(i==0)
				return;
		System.out.println("Current value of i is: "+i);
		display(i-1);
	}
	
	public static void main(String[] args) 
	{
		display(5);
	}

}

package interface_demos;

public class IDemo10 implements Student, Employee
{
	public void display()
	{
		System.out.println("in display()");
	}
	public static void main(String[] args) 
	{
		new IDemo10().display();		
	}
}

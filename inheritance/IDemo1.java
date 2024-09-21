package inheritance;

public class IDemo1
{
	public static void main(String args[]) 
	{
		Demo1 obj1 = new Demo1();
		Demo2 obj2 = new Demo2();
		// The superclass may be used by itself.
		obj1.i = 10;	
		System.out.println("Using Super class object");
		obj1.show();
		
		/* The subclass has access to all public members of
		its superclass. */
		obj2.i = 20;		
		obj2.j = 30;
		System.out.println("Using Sub class object");
		obj2.show();
		obj2.display();		
		
		System.out.println("Sum of i and j is:");
		obj2.sum();
		}
}

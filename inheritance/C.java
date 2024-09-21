package inheritance;

public class C extends B
{
	C() 
	{
		System.out.println("Inside C's constructor.");
	}
	public static void main(String[] args) 
	{
		C c = new C();
	}

}

package inheritance;

abstract class A21 
{
	abstract void show();
	// concrete methods are still allowed in abstract classes
	void display() 
	{
		System.out.println("This is a concrete method.");
	}
}

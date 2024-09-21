package inheritance;

class B11 extends A11 
{
	int j;
	B11(int a, int b) 
	{
		super(a);
		j = b;
	}
	void show()
	{
		System.out.println("j: " + j);
		//super.show(); //calls the superclass method
	}
}

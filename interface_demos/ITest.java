package interface_demos;

class ITest implements Car
{
	public void drive()
	{
		System.out.println("in drive()");
	}
	public void brake()
	{
		System.out.println("in brake()");
	}
	public static void main(String[] args) 
	{
		new ITest().drive();
		new ITest().brake();
	}
}

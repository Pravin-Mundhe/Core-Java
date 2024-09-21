package staticdemo;

public class StaticDemo7 
{
	static String name;
	static int age;
	static
	{
		System.out.println("This is Static block");
		name="John";
		age=30;
	}
	public static void main(String[] args) 
	{
		System.out.println("This is main method");
		
		System.out.println("Printing values of static variables from main");
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);

	}

}

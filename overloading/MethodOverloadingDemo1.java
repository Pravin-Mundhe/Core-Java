package overloading;

public class MethodOverloadingDemo1 
{
	int sum()
	{
		System.out.println("No parameter passed");
		return 0;
	}	
	int sum(int a, int b)
	{
		System.out.println(a+b);
		return 0;
	}	
	int sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
		return 0;
	}	
	int sum(int a)
	{
		System.out.println(a);
		return 0;
	}
	
	/*int sum(float a)
	{
		System.out.println(a);
		return 0;
	}*/	
	
	void display(int age, String name)
	{
		System.out.println(age+" "+name);
	}
	
	void display(String name, int age)
	{
		System.out.println(name+" "+age);
	}
	
	public static void main(String[] args)
	{
		MethodOverloadingDemo1 obj1=new MethodOverloadingDemo1();
		obj1.sum();
		obj1.sum(10,20);
		obj1.sum(10,20,30);
		obj1.sum(10);	
		//obj1.sum(10.5d);	//Explicit type casting		
		obj1.display(10, "John");
		obj1.display("Tom", 20);
	}

}

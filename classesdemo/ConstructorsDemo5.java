package pravin.classesdemo;

public class ConstructorsDemo5 
{
	String name;
	double age;	
	
	ConstructorsDemo5(String name) 
	{		
		this.name = name;	
		System.out.println("Name is "+name);
	}
	
	ConstructorsDemo5(double age) 
	{			
		this.age = age;
		System.out.println("Age is: "+age);
	}

	public static void main(String[] args) 
	{
		ConstructorsDemo5 obj1= new ConstructorsDemo5("John");
		
		int i=10;		
		ConstructorsDemo5 obj2= new ConstructorsDemo5(i);	
		//There is no constructor with integer parameter. 
		//Hence, compiler can automatically convert 
		//an integer into a double.		
	}

}

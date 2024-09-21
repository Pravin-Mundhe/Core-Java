package pravin.classesdemo;

public class ConstructorsDemo3 
{
	String name;
	int age;
	
	ConstructorsDemo3(String name, int age) //initializing field variables
	{
		this.name=name;	//no need to use separate variable name
		this.age=age;
	}	
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public static void main(String[] args) 
	{
		ConstructorsDemo3 obj= new ConstructorsDemo3("John", 30);
		obj.display();	
	}

}

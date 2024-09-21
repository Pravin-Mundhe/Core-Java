package pravin.classesdemo;

public class ConstructorsDemo2 
{
	String name;
	int age;
	
	ConstructorsDemo2(String name, int age) //initializing field variables
	{
		this.name=name;	//no need to use separate variable name
		this.age=age;
	}
	
	public String toString()
	{
		return ("Name is: "+name+", Age is: "+age);
		//return ("Name is: "+this.name+", Age is: "+this.age);
	}	
	
	public static void main(String[] args) 
	{
		ConstructorsDemo2 obj= new ConstructorsDemo2("John", 30);
		System.out.println(obj.toString());		
	}

}

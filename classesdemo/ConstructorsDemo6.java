package pravin.classesdemo;

public class ConstructorsDemo6 
{
	String name;	
	int mark;
	
	ConstructorsDemo6(String name) 
	{		
		this.name = name;	
		System.out.println("Name is "+name);
	}	
	
	ConstructorsDemo6(int mark) 
	{			
		this.mark=mark;
		System.out.println("Mark is: "+mark);
	}

	public static void main(String[] args) 
	{
		ConstructorsDemo6 obj1= new ConstructorsDemo6("John");		
		
		float j=20.45f;
		
		//ConstructorsDemo6 obj2= new ConstructorsDemo6(j);	
		//This will give a compiler error "The constructor 
		//ConstructorsDemo6(float) is undefined" as compiler can not perform 
		//explicit type casting
		
	}

}

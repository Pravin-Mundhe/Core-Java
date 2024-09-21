package pravin.classesdemo;

public class ConstructorsDemo7 
{
	String name;
	int age;	
	
	/**
	 * @param name
	 * @param age
	 */
	public ConstructorsDemo7(String name, int age) 
	{		
		this.name = name;
		this.age = age;		
	}
	
	public ConstructorsDemo7(int age, String name) 
	{			
		this.age = age;	
		this.name = name;
	}


	@Override
	public String toString() 
	{
		return ("name=" + name + ", age=" + age) ;
	}


	public static void main(String[] args) 
	{
		ConstructorsDemo7 obj1= new ConstructorsDemo7("John",30);	
		System.out.println(obj1.toString());
		
		ConstructorsDemo7 obj2= new ConstructorsDemo7(25,"Tom");	
		System.out.println(obj2.toString());
		//comment second constructor and observe the output
	}

}

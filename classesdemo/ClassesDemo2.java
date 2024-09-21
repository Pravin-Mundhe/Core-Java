package pravin.classesdemo;

public class ClassesDemo2 
{
	String name;
	int age;
	
	public void setName(String s) //it can be modifyName()
	{
		name=s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int n)
	{
		age=n;
	}	
	
	public int getAge()	//it can be fetchAge()
	{
		return age;
	}
	
	public static void main(String[] args) 
	{
		ClassesDemo2 obj1=new ClassesDemo2();
		
		obj1.setName("John");
		System.out.println("Hello "+obj1.getName());
		
		obj1.setAge(30);
		System.out.println("Your age is "+obj1.getAge());

	}

}

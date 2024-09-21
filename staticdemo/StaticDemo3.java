package staticdemo;

public class StaticDemo3 
{
	String name;
	int empid;	
	static String company="TCS";
	
	public StaticDemo3(String name, int empid) 
	{		
		this.name = name;
		this.empid = empid;		
	}

	public void display()
	{
		System.out.println(name+" "+empid+" "+company);		
	}

	public static void main(String[] args) 
	{
		StaticDemo3 obj1= new StaticDemo3("John",100);
		StaticDemo3 obj2= new StaticDemo3("Tom",200);
		
		obj1.display();
		obj2.display();
		
		StaticDemo3.company="Infosys";
		//company="Infosys"; //this is also allowed
		obj1.display();
		obj2.display();

	}

}

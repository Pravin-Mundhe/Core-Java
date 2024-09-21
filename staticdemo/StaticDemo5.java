package staticdemo;

public class StaticDemo5 
{
	String name;
	int empid;	
	static String company="TCS";
	
	public StaticDemo5(String name, int empid) 
	{		
		this.name = name;
		this.empid = empid;		
	}
	
	static void update()
	{		
		company="Infosys";
	}
	
	public void display()
	{
		System.out.println(name+" "+empid+" "+company);
	}
	
	public static void main(String[] args) 
	{				
		StaticDemo5 obj1= new StaticDemo5("John",100);
		StaticDemo5 obj2= new StaticDemo5("Tom",200);
		
		obj1.display();
		obj2.display();
		
		StaticDemo5.update();
		
		obj1.display();
		obj2.display();				

	}

}

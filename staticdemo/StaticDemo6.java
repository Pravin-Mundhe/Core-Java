package staticdemo;

public class StaticDemo6 
{
	String name;
	int empid;	
	static String company="TCS";
	
	public StaticDemo6(String name, int empid) 
	{		
		this.name = name;
		this.empid = empid;		
	}
	
	static void update()
	{
		//System.out.println(name);//Compile time error "Cannot make a static reference to the non-static field name"
		company="Infosys";		
	}
	
	public void display()
	{
		System.out.println(name+" "+empid+" "+company);
	}
	
	public static void main(String[] args) 
	{				
		StaticDemo6 obj1= new StaticDemo6("John",100);		
		
		obj1.display();		
		
		StaticDemo6.update();
		
		obj1.display();	
	}
	

}

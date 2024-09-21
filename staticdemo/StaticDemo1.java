package staticdemo;

public class StaticDemo1 
{
	int count=0;	
	public void display() 
	{
		count=count+1;
		System.out.println("Count="+count);
	}
	public static void main(String[] args) 
	{
		StaticDemo1 obj1=new StaticDemo1();
		StaticDemo1 obj2=new StaticDemo1();
		StaticDemo1 obj3=new StaticDemo1();
		
		obj1.display();//value of count is not getting increased 
		obj2.display();
		obj3.display();
	}
}

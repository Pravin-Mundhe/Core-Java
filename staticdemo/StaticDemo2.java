package staticdemo;

public class StaticDemo2 
{
	static int count=0;	//because of static property, count became italic
	public void display() 
	{
		count=count+1;
		System.out.println("Count="+count);
	}
	public static void main(String[] args) 
	{
		StaticDemo2 obj1= new StaticDemo2();
		StaticDemo2 obj2= new StaticDemo2();
		StaticDemo2 obj3= new StaticDemo2();
		
		obj1.display();//now the value of count will increase 
		obj2.display();//because of static
		obj3.display();
	}

}

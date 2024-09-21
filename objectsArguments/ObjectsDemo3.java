package objectsArguments;

public class ObjectsDemo3 
{
	int num1;
	int num2;
	
	ObjectsDemo3(int num1, int num2) 
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	void calculate(ObjectsDemo3 obj1)
	{
		num1=num1+30;
		num2=num2+40;
	}	

	public static void main(String[] args) 
	{
		ObjectsDemo3 obj1=new ObjectsDemo3(10,20);
		
		System.out.println("num1="+obj1.num1+" num2="+obj1.num2);
		
		obj1.calculate(obj1);
		
		System.out.println("After executing calculate method");
		System.out.println("num1="+obj1.num1+" num2="+obj1.num2);

	}

}

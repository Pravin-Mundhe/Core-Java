package objectsArguments;

public class ObjectsDemo4 
{
	int num1;
	int num2;
	
	ObjectsDemo4(int num1, int num2) 
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	ObjectsDemo4 calculate()
	{		
		ObjectsDemo4 obj=new ObjectsDemo4(num1+30,num2+40);
		return obj;
	}	

	public static void main(String[] args) 
	{
		ObjectsDemo4 obj1=new ObjectsDemo4(10,20);
		
		System.out.println("num1="+obj1.num1+" num2="+obj1.num2);
		
		ObjectsDemo4 obj2=obj1.calculate();
		
		System.out.println("After executing calculate method");
		System.out.println("num1="+obj2.num1+" num2="+obj2.num2);

	}

}

package objectsArguments;

public class ObjectsDemo1 
{
	int num1;
	int num2;
	
	ObjectsDemo1(int num1, int num2) 
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	void display(ObjectsDemo1 obj)
	{
		System.out.println(obj.num1+" "+obj.num2);
	}
	
	int equals(ObjectsDemo1 obj)
	{
		if(obj.num1==num1 && obj.num2==num2)
			return 1;
		return 0;
	}

	public static void main(String[] args) 
	{
		ObjectsDemo1 obj1=new ObjectsDemo1(10,20);
		ObjectsDemo1 obj2=new ObjectsDemo1(10,20);
		
		obj1.display(obj1);
		
		int result=obj1.equals(obj2);
		if(result==1)
			System.out.println("Objects are rqual");
		else
			System.out.println("Objects are not rqual");

	}

}

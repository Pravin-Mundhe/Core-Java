package interface_demos;

public class IDemo8 implements MyList
{
	public void show(int i)	//here public is compulsory	
	{
		System.out.println("in Show()");	
		System.out.println(i);
	}
	void display()
	{
		System.out.println("In display()");
	}
	public static void main(String[] args) 
	{
		MyList obj;
		IDemo8 obj1=new IDemo8();	
		
		obj=obj1;
		
		obj.show(i);
		//obj.display(i);
	}
}

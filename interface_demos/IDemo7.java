package interface_demos;

public class IDemo7 implements MyList
{
	public void show(int i)	//here public is compulsory	
	{
		System.out.println("in Show()");
		System.out.println(i);
	}
	void display()
	{
		System.out.println("in Display()");
	}
	public static void main(String[] args) 
	{
		IDemo7 obj=new IDemo7();
		obj.show(i);
		obj.display();
	}
}

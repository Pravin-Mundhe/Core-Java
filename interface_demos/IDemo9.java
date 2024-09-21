package interface_demos;

public class IDemo9 implements MyList
{
	public void show(int i)	
	{
		System.out.println("in Another Show()");	
		System.out.println("square is: "+i*i);
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
		
		IDemo9 obj2=new IDemo9();
				
		obj=obj2;
		obj.show(i);
	}
}

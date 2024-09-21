package packageA;

public class PublicDemo2 //remove public for class and field at end
{	
	public int num21;	
	public void display21(int a)
	{
		System.out.println("Number is: "+a);
	}
	
	public static void main(String[] args) 
	{			
		PublicDemo2 obj21=new PublicDemo2();
		obj21.num21=20;
		obj21.display21(obj21.num21);		
		
		/*
		PublicDemo1 obj12=new PublicDemo1();
		obj12.num11=10;
		obj12.display11(obj12.num11);
		*/
		/*
		PublicDemo2 obj22=new PublicDemo2();
		obj22.num11=10;
		obj22.display11(10);		
		*/		
	}
}

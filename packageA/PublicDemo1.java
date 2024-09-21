package packageA;

public class PublicDemo1 
{	
	public int num11;	
	public void display11(int a)
	{
		System.out.println("Number is: "+a);
	}
	
	public static void main(String[] args) 
	{				
		PublicDemo1 obj11=new PublicDemo1();
		obj11.num11=10;
		obj11.display11(obj11.num11);			
		
		/*
		PublicDemo2 obj22=new PublicDemo2();
		obj22.num21=20;
		obj22.display21(obj22.num21);	
		*/
	}

}

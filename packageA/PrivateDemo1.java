package packageA;

public class PrivateDemo1 //declare this as private
{
	private int p11;	
	private void displayp11(int a)
	{
		System.out.println("Number is: "+a);
	}
	
	public static void main(String[] args) 
	{		
		PrivateDemo1 objp11= new PrivateDemo1();
		objp11.p11=10;
		objp11.displayp11(20);
		
		/*
		PrivateDemo2 objp21= new PrivateDemo2();
		objp21.p21=10;
		objp21.displayp21(20);
		*/
	}
}

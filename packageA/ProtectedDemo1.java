package packageA;

public class ProtectedDemo1 
{
	protected int pro11;	
	protected void displaypro11(int a)
	{
		System.out.println("Number is: "+a);
	}
	
	public static void main(String[] args) 
	{		
		ProtectedDemo2 objpro21= new ProtectedDemo2();
		objpro21.pro21=10;
		objpro21.displaypro21(objpro21.pro21);
	}
}

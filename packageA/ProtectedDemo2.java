package packageA;

//import packageB.ProtectedDemo3;

public class ProtectedDemo2 
{
	protected int pro21;
	
	protected void displaypro21(int a)
	{
		System.out.println("Number is: "+a);
	}
	
	public static void main(String[] args) 
	{
		ProtectedDemo1 objpro11= new ProtectedDemo1();
		objpro11.pro11=10;
		objpro11.displaypro11(objpro11.pro11);
		
		/*
		ProtectedDemo3 objpro31= new ProtectedDemo3();
		objpro31.pro31=10;
		objpro31.displaypro31(20);
		*/
	}

}

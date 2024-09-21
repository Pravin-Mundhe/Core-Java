package packageA;

//import packageB.DefaultDemo3;

public class DefaultDemo2 
{
	int d21;	
	void displayd21(int a)
	{
		System.out.println("Number is: "+a);
	}
	
	public static void main(String[] args) 
	{
		DefaultDemo1 objd11= new DefaultDemo1();
		objd11.d11=10;
		objd11.displayd11(objd11.d11);
		
		/*
		DefaultDemo3 objd31= new DefaultDemo3();
		objd31.d31=10;
		objd31.displayd31(20);
		*/
	}

}

package packageA;

public class DefaultDemo1 
{
	int d11;	
	void displayd11(int a)
	{
		System.out.println("Number is: "+a);
	}
	
	public static void main(String[] args) 
	{		
		DefaultDemo2 objd21= new DefaultDemo2();
		objd21.d21=10;
		objd21.displayd21(objd21.d21);
	}

}

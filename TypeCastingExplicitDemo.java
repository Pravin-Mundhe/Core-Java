
public class TypeCastingExplicitDemo {

	public static void main(String[] args) 
	{
		double d = 20.21;  
		
		float f= (float)d; //converting double to float
		long l = (long)f;  //converting double to long  		
		int i = (int)l;  //converting long to int
		
		System.out.println("Double value before conversion is : "+d);	
		System.out.println("After converting to float : "+f); 	
		System.out.println("After converting to long : "+l); 		
		System.out.println("After converting to int : "+i);  

	}

}



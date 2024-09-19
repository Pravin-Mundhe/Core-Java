
public class TypeCastingAutomaticDemo {

	public static void main(String[] args) 
	{
		byte b=5;
		short s=b;	//automatically converts byte to short  
		System.out.println("Byte to short is :"+s);		
		
		int x=10;
		long l=x;
		float f=l;
		System.out.println("Integer value before converting is :"+x);	
		System.out.println("After converting to Long :"+l);	
		System.out.println("After converting to Float :"+f);	

		/*long l1=100;
		int x1=l1;*/

	}

}

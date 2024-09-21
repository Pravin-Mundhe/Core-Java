package wrapperdemo;

public class AutoboxingDemo {
	public static void main(String[] args) 
	{
		int i=10;  
		Integer j=Integer.valueOf(i);	//converting int into Integer explicitly  
		Integer k=i;	//internally, compiler will write Integer.valueOf(a)   		
		
		System.out.println("Value after Autoboxing is "+j); 
		System.out.println(k); 
		
		int ivalue=j;  
		System.out.println(ivalue); 
		
	}

}

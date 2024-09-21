package wrapperdemo;

public class WrapperClassDemo 
{
	public static void main(String[] args) 
	{
		byte b=100;  
		short s=200;  
		int i=300;  
		long l=400;  
		float f=500.0F;  
		double d=600.0D;  
		char c='i';  
		boolean bl=true;  
		  
		//Autoboxing: Converting primitives into objects  
		Byte bobj=b;  
		Short sobj=s;  
		Integer iobj=i;  
		Long lobj=l;  
		Float fobj=f;  
		Double dobj=d;  
		Character cobj=c;  
		Boolean blobj=bl;  
		  
		/*
		System.out.println("Primitive values after converting to object values");  
		System.out.println("Byte object: "+bobj);  
		System.out.println("Short object: "+sobj);  
		System.out.println("Integer object: "+iobj);  
		System.out.println("Long object: "+lobj);  
		System.out.println("Float object: "+fobj);  
		System.out.println("Double object: "+dobj);  
		System.out.println("Character object: "+cobj);  
		System.out.println("Boolean object: "+blobj);  
		*/
		  
		//Unboxing: Converting Objects to Primitives  
		byte bvalue=bobj;  
		short svalue=sobj;  
		int ivalue=iobj;  
		long lvalue=lobj;  
		float fvalue=fobj;  
		double dvalue=dobj;  
		char cvalue=cobj;  
		boolean blvalue=blobj;  
				
		System.out.println("\nObject values after converting to primitive values");  
		System.out.println("byte value: "+bvalue);  
		System.out.println("short value: "+svalue);  
		System.out.println("int value: "+ivalue);  
		System.out.println("long value: "+lvalue);  
		System.out.println("float value: "+fvalue);  
		System.out.println("double value: "+dvalue);  
		System.out.println("char value: "+cvalue);  
		System.out.println("boolean value: "+blvalue);  
		
	}

}

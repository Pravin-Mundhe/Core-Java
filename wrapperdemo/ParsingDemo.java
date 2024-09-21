package wrapperdemo;

public class ParsingDemo 
{
	public static void main(String[] args) 
	{		
		byte b = Byte.parseByte("10");
		short s = Short.parseShort("20");
		int i1 = Integer.parseInt("30");
		float f = Float.parseFloat("40.5");
	    double d = Double.parseDouble("50.3");
	    long l = Long.parseLong("60");	    
	    
	    System.out.println("After Parsing, values are");
	    System.out.println("Byte value is "+b);
	    System.out.println("Short value is "+s);
	    System.out.println("Integer value is "+i1);
	    System.out.println("Float value is "+f);
	    System.out.println("Double value is "+d);
	    System.out.println("Long value is "+l);
	   
	    /*
	    int i2 = Integer.parseInt("486",16);	//here, 486 will be considered as hexadecimal
	    System.out.println(i2);
	    */
	    /*
	    int i3 = Integer.parseInt("48z",16);	//here, 48z will be considered as hexadecimal
	    System.out.println(i3);
		*/
	    /*
	    int i3 = Integer.parseInt("1014",2);	//number is binary, but 4 is present
	     // this is called as unchecked exception or runtime exception, 
	     // user did not check the exception or user did not know about the exception
	    System.out.println(i3);
		*/
	}

}

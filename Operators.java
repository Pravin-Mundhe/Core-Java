
public class Operators
{
	public static void main(String[] args) 
	{				
		int num1=20; //Assignment operator
		int num2=10;
		
		System.out.println("num1 is "+ num1);
		System.out.println("num2 is "+ num2);
		System.out.println("\nArithmetic operators");
		System.out.println("num1 + num2 is "+ (num1+num2));
		System.out.println("num1 - num2 is "+ (num1-num2));
		System.out.println("num1 * num2 is "+ (num1*num2));
		System.out.println("num1 / num2 is "+ (num1/num2));
		System.out.println("num1 % num2 is "+ (num1%num2)+"\n");
		
		System.out.println("Unary operators");
		System.out.println("+num1 is "+ +num1);
		System.out.println("-num1 is "+ -num1);
		System.out.println("num1++ is "+ num1++);	//post increment
		System.out.println("num1-- is "+ num1--);
		System.out.println("++num2 is "+ ++num2);	//pre increment
		System.out.println("--num2 is "+ --num2 +"\n");
		
		System.out.println("Bitwise/ Logical operators");
		System.out.println("3 & 1 is "+ (3&1));
		System.out.println("num1 & num2 is "+ (num1&num2));
		System.out.println("num1 | num2 is "+ (num1|num2));
		System.out.println("num1 ^ num2 is "+ (num1^num2));
		System.out.println("~(+1) is "+ ~(1));
		System.out.println("~num1 is "+ ~num1 +"\n");		
		
		System.out.println("\nBit-Shift operators");
		int r=2;		
		System.out.println("r<<1 is " + (r<<1));
		System.out.println("r>>1 is " + (r>>1));
		
		System.out.println("\nBoolean operators");
		boolean b=false;
		System.out.println("Complement of b is "+ !b);
		
		/*int a=11;
		int b=12;
		int c=4;
		System.out.println(10*(5+2)-(8/4)+b++/c+a);		*/
		
		
	}
}

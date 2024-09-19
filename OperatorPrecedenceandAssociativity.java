
public class OperatorPrecedenceandAssociativity 
{

	public static void main(String[] args) 
	{		
		System.out.println("Evaluation of 4 / 2 + 8 * 4 - ( 5 + 2 ) % 3 is "+ (4 / 2 + 8 * 4 - ( 5 + 2 ) % 3));
		int a=4;
		int b=6;
		int c=2;
		System.out.println("a=4, b=6, c=2");		
		System.out.println("Evaluation of --a-b+c is "+ (--a-b+c));
		System.out.println("Current value of a is "+ a+", b=6, c=2");
		System.out.println("Evaluation of a+++b/c is "+ (a+++b/c));
		System.out.println("Current value of a is "+ a+", b=6, c=2");
		System.out.println("Evaluation of a--+b*c is "+ (a--+b*c));
		System.out.println("Current value of a is "+ a);
		
		/*int a=4;
		int b=6;
		int c=2;
		System.out.println(10*(5+2)-(8/4)+b++/c+a);*/
	}

}

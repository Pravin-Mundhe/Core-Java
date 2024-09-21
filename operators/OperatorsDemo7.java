package operators;

public class OperatorsDemo7 
{
	public static void main(String[] args) 
	{
		int i=10;
		double r=10;		
		
		System.out.println("20>>2= "+(20>>2));	//5
		System.out.println("10^5= "+(10^5));	//15		
		
		// r+=(2*5+(++i)-(20>>2)*(10^5));	
		
		//Highest precedence: ()
		//r+=(2*5+(11)-(20>>2)*(10^5));
		//r+=(2*5+11-5*(10^5));
		//r+=(2*5+11-5*15);
		
		//Highest precedence: *, L->R
		//r+=(10+11-5*15);
		//r+=(10+11-75);
		
		//Highest precedence: +, -, L->R
		//r+=(21-75);
		//r+=-54;	//r=r-54;
		//r=-44.0		
		
		r+=(2*5+(++i)-(20>>2)*(10^5));			
		System.out.println(r);	
		
	}
}

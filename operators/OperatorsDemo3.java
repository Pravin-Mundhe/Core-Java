package operators;

public class OperatorsDemo3 
{
	public static void main(String[] args) 
	{
		int i=10;
		/*
		System.out.println(i<<1);	//20
		System.out.println(i>>1);	//5
		
		System.out.println(i<<2);	//40
		System.out.println(i>>2);	//2
		*/
		/*
		System.out.println(40<<2);	//160
		System.out.println(50<<2);	//200

		System.out.println(40>>2);	//10
		System.out.println(50>>2);	//12
		*/
		
		System.out.println((40<<2)-(40>>2)+(50<<2)-(50>>2));//160-10+200-12=338
		
		System.out.println(40<<5-3>>1+1);//40<<2>>2 -> 160>>2 -> 40	
			
	}
}

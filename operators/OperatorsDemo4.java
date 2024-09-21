package operators;

public class OperatorsDemo4 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=14;
		
		System.out.println(a&b);	//10
		System.out.println(a|b);	//14
		System.out.println(a^b);	//4
		
		/*
		System.out.println(10&24);	//8
		System.out.println(6^3);	//5
		System.out.println(8|5);	//13
		
		System.out.println(10&14+10|6^5-2);	//10&24|6^3	-> 13		
		*/
		
		/*		
		System.out.println(24&6);	//0
		System.out.println(10^0);	//10
		System.out.println(10|5);	//15
		
		System.out.println(10^14+10&6|7-2);	//10^24&6|5 -> 15
		*/			
	}
}

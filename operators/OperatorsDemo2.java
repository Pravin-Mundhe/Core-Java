package operators;

public class OperatorsDemo2 
{
	public static void main(String[] args) 
	{
		int i=10,j=10,k=10;	
		
		System.out.println(i%i);
		System.out.println(i/i);
		System.out.println(i*i);
		System.out.println(i+i);
		System.out.println(i-i);
		
		/*
		System.out.println(10%4);	//2
		System.out.println(20/10);	//2
		System.out.println(2*2);	//4
		
		System.out.println(20/10*10%4);	//2*10%4 -> 20%4=0 
		
		System.out.println(20*10/5%3);	//200/5%3 -> 40%3=1
		*/
		
		/*
		System.out.println(20-10+10-3);	//17
		
		System.out.println(20-10-10+3);	//3
		*/
		
		/*
		System.out.println(15-10/10+3%4*20);	//74
		
		System.out.println(20-10/10-3%4*20);	//-41
		
		System.out.println(15-10/10-3%4*20);	//-46
		*/
		/*
		i=14;
		j=11;
		k=20;
		System.out.println((++i)-10/(--j)-3%4*(k++));	//-46
		*/
	}

}

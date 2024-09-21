package operators;

public class OperatorsDemo1 
{
	public static void main(String[] args) 
	{		
		int i=10,j=10,k=10;		
		
		System.out.println(i++);	//10
		System.out.println(++i);	//12
		System.out.println(i++);	//12
		System.out.println(i);		//13
		
		/*
		i=10;
		System.out.println((i++)+(++i)+(i++));	//12+12+10		
		
		i=10;
		System.out.println((i++)+(++j)+(k++));	//10+11+10
		*/
		/*
		i=10;		
		
		System.out.println(i--);	//10
		System.out.println(--i);	//8
		System.out.println(i--);	//8
		System.out.println(i);		//7
		*/
		/*
		i=10;
		System.out.println((i--)+(--i)+(i--));	//8+8+10		
		
		i=10;
		j=10;
		k=10;
		System.out.println((i--)+(--j)+(k--));	//10+9+10
		*/
		/*
		i=10;
		j=10;
		k=10;
		System.out.println((++i)+(--j)+(k++));	//11+9+10
		*/
		/*
		System.out.println(~(+10)+~(-10)+~(+10));		//-11+9-11
		
		System.out.println(!true);
		System.out.println(!false);
		*/
	}

}

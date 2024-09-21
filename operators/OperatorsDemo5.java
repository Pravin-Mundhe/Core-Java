package operators;

public class OperatorsDemo5 
{
	public static void main(String[] args) 
	{
		int i=10,j=20,k=10;	
		
		if ((i < j) && (i == k)) 
		{            
            System.out.println("The sum is: " + (i+j+k));
        }
        else
            System.out.println("Conditions are not satisfied");
		
		if ((i > j) || (i == k)) 
		{            
            System.out.println("The multiplication is: " + (i*j*k));
        }
        else
            System.out.println("Conditions are not satisfied");
		
		/*
		if(!(i>j))
		{
			System.out.println("i is less than j");
		}
		else
		{
			System.out.println("i is greater than j");
		}
		
		if(!(i==k))
		{
			System.out.println("i is not equals to k");
		}
		else
		{
			System.out.println("i is equals to k");
		}
		*/
	}

}

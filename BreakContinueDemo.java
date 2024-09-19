
public class BreakContinueDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("Output for break:");	
		int i;
		for(i=1;i<5;i++) 
		{
			if(i==3)
				//break;
			System.out.println("Current value of i is "+i);			
		}
		
		/*System.out.println();	
		System.out.println("Output for continue:");		
		
		for(i=1;i<5;i++) 
		{
			if(i==3)
				continue;
			System.out.println("Current value of i is "+i);			
		}
		
		
		
		int i,j;
		for(i=1;i<5;i++) 
		{
			System.out.println("For i = "+i);
			for(j=1;j<5;j++) 
			{
				if(j==3)
					continue;//break;//
				System.out.println("          j = "+j);		
			}
		}	
		*/
	}

}

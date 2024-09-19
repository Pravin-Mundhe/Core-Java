
public class LoopingDemo 
{
	public static void main(String[] args) 
	{
		int i=1;
		/*for(;i<5;) // to increment with 2, i=i+2
		{
			System.out.println("Current value of i is "+i);
			i++;
		}
		
		System.out.println("Enhanced for loop");
		int a[]= {1,2,3,4,5};
		
		for (int k : a)
		{
			System.out.println("Count of k is "+k);
		}*/
		
		int j=1;
		System.out.println("output of While loop");
		while(j<1) //check for j<1
		{
			System.out.println("Current value of i is "+j);
			j++;
		} //check for j<1
		
		System.out.println("output of Do-while loop");
		int k=1;
		do
		{
			System.out.println("Current value of i is "+k);
			k++;
		}while(k<1);	//check for k<1 
		
	}
}

package arrayDemos;

public class OneDArrayDemo2 
{
	public static void main(String[] args) 
	{		
		int[] a={10,20,30,40,50};				
		
		for(int i:a)	//Here, explicit declaration of i is compulsory
			System.out.println(i);
		
		int i,sum=0;
		for(i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum of array elements is: "+sum);	
	}

}

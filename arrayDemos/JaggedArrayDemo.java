package arrayDemos;
public class JaggedArrayDemo 
{
	public static void main(String[] args) 
	{
		int[][] a=  {
						{1,2,3},
						{4,5},
						{6,7,8,9}
               		};		
		
		System.out.println("Length of a[][] is "+a.length);	
		
		//System.out.println("a[1][2] is: "+a[1][2]);
		
		int count = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)//for 2nd row, a[0].length=2

                count++;
		System.out.println("Number of elements in jagged array are: "+count);
		/*
		System.out.print("\nDisplaying a[][] using normal for loop");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println();
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
		}		
		*/		
		/*
		System.out.print("\nDisplaying a[][] using enhanced for loop");
		for(int[] i:a)	//extract each 1D array
		{
			System.out.println();
			for(int j: i)	//then, print element from first to last
				System.out.print(j+" ");
		}
		*/
	}

}

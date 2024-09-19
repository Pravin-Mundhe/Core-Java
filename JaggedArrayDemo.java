
public class JaggedArrayDemo 
{
	public static void main(String[] args) 
	{
		int[][] a=  {
						{1,2,3},
						{3,4},
						{3,4,5,6}
               		}; 
		System.out.println("a[0][2] is: "+a[0][2]);
		System.out.println("a[1][1] is: "+a[1][1]);
		System.out.println("a[2][3] is: "+a[2][3]);
		
//		System.out.println("a[1][2] is: "+a[1][2]);
		int count = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                count++;
		System.out.println("Number of elements in jagged array are: "+count);
	}

}

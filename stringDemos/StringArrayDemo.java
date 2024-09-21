package stringDemos;
public class StringArrayDemo 
{
	public static void main(String[] args) 
	{
		String[] str2= {"india","japan","America","100"};
		System.out.println(str2[1]);
		System.out.println(str2[3]);
		
		String[][] str3= {
				{"india", "shrilanka"},
				{"delhi", "colombo"}
		};
		
		System.out.println(str3[0][0]+":"+str3[1][0]);

	}

}

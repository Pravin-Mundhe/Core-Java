
public class StringConcatenationDemo 
{
	public static void main(String[] args) 
	{
		String str="John";
		str.concat("123");
		System.out.println("\nConcatenation is: "+str);
		
		String str1=str.concat("123");
		System.out.println("\nConcatenation is: "+str1);
		
	}

}

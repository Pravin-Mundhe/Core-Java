
public class StringMethodsDemo 
{
	public static void main(String[] args) 
	{
		String str4="john";
		String str5="John";
		String str6="  ";
		
		System.out.println("str4 is: "+str4);
		System.out.println("str5 is: "+str5);
		System.out.println("str6 is: "+str6);
		
		System.out.println("\nstr4[2] is: "+str4.charAt(2));
		
		System.out.println("\nLength of str4 is: "+str4.length());
		
		System.out.println("\nsubstring of str4 from index 1 is: "+str4.substring(1));
		
		System.out.println("\nis str4 empty?: "+str4.isEmpty());
		System.out.println("is str6 empty?: "+str6.isEmpty());
		System.out.println("is str6 empty?: "+str6.isBlank());
		
		System.out.println("\nAre strings equal? "+str4.equals(str5));
		System.out.println("Are strings equal? "+str4.equalsIgnoreCase(str5));		
		
		System.out.println("\nis oh present in str4?: "+str4.contains("oh"));
				
		System.out.println("\nReplacing o in john with e: "+str4.replace('o', 'e'));
		
		System.out.println("\nstr4 in uppercase is: "+str4.toUpperCase());
		
		System.out.println(str4.toString()); // It returns object itself
	}

}

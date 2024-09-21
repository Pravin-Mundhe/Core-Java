package stringDemos;


public class StringMethodsDemo 
{
	public static void main(String[] args) 
	{
		String str4="john";
		String str5="JoHn";
		String str6="  ";
		
		System.out.println("str4 is: "+str4);
		System.out.println("str5 is: "+str5);
		System.out.println("str6 is: "+str6);
		
		System.out.println("\nLength of str4 is: "+str4.length());//4
		System.out.println("\nLength of str6 is: "+str6.length());//2
				
		System.out.println("\nstr4[2] is: "+str4.charAt(2));//h
		
		System.out.println("\nis str4 empty?: "+str4.isEmpty());//false
		System.out.println("is str6 empty?: "+str6.isEmpty());//false
		System.out.println("is str6 blank?: "+str6.isBlank());//true
		
		System.out.println("\nAre str4 and str5 equal? "+str4.equals(str5));//false
		System.out.println("Are str4 and str5 equal(ignore case)? "+str4.equalsIgnoreCase(str5));//true
		
		//Unicode values are considered in case of compareTo function.
		//a:U+0061(97), A: u+0041(65)
		//h:U+0068(104), H: u+0048(72)
		//Value returned is difference between decimal value corresponding to Unicode value
		System.out.println("\nCompare \"john\" and \"joHn\"? "+"john".compareTo("joHn"));//32
		System.out.println("\nCompare \"joHn\" and \"john\"? "+"joHn".compareTo("john"));//-32
		System.out.println("\nCompare \"joHn\" and \"john\" (ignore case)? "+"joHn".compareToIgnoreCase("john"));//0
		System.out.println("\nCompare \"ajohn\" and \"john\" (ignore case)? "+"ajohn".compareTo("john"));//-9
		
		System.out.println("Index of h in john is "+str4.indexOf('h'));//2
		System.out.println("Index of h in john is "+str4.indexOf('h',1));//2
		System.out.println("Index of h in john is "+str4.indexOf("oh"));//1
		System.out.println("Index of h in john is "+str4.indexOf("oh",1));//1
		
		
		System.out.println("john".replace('j', 'n'));//jonn
		System.out.println("john".replace("hn", "nh"));//jonh
		
		System.out.println("str5 in uppercase is: "+str5.toUpperCase());//JOHN
		System.out.println("str5 in lowercase is: "+str5.toLowerCase());//john		
		
		System.out.println("\nSubstring of str4 from index 1 is: "+str4.substring(1));//ohn	
		System.out.println("\nSubstring of str4 from index 1 to 3 is: "+str4.substring(1,3));//oh
		
		System.out.println("\nis hn present in str4?: "+str4.contains("hn"));//true	
		
		System.out.println(String.join("/", "25","06","2021"));//25/06/2021
		System.out.println(String.join("-", "25","06","2021"));//25-06-2021
		
		String S="India	is my country";
		String[] S1=S.split("\\s");//\s: whitespace character, \t: Tab character
		for(String S2:S1)
			System.out.println(S2);
		
		System.out.println(str4.toString()); // It returns object itself
		
	}

}

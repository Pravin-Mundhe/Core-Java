package stringDemos;


public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb=new StringBuffer("Hello");
				
		System.out.println("\nCapacity of sb1 is: "+sb1.capacity());//16
		
		System.out.println("\n"+sb);//Hello
		sb.append(" World");	
		
		System.out.println(sb);//Hello World			
		
		sb.insert(11,"123");
		System.out.println(sb);//Hello World123
		
		System.out.println(sb.charAt(2));//l
		sb.setCharAt(2,'n');
		System.out.println(sb);//Henlo World123
		sb.setCharAt(2,'l');
		System.out.println(sb);//Hello World123
		
		char[] dst= {'a','b','c'};
		sb.getChars(0, 2, dst, 0);
		System.out.println(dst);//Hec
			
		System.out.println(sb.reverse());//321dlroW olleH
		System.out.println(sb.reverse());//Hello World123
		
		System.out.println(sb.deleteCharAt(11));//Hello World23
		System.out.println(sb.delete(11,13));//Hello World
		
		System.out.println(sb.replace(1,5,"HHHH"));//HHHHH World
	}

}

package arrayDemos;

import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList alist=new ArrayList();
		
		alist.add("abc");
		
		alist.add("10");
		
		alist.add(20);
		
		alist.add(false);
		
		System.out.println(alist);
		
		alist.add(2,50);
		
		System.out.println(alist);
			
		
		System.out.println(alist.get(0));
		
		System.out.println(alist.get(3));
		
		alist.set(2, "80");
		System.out.println(alist);
		
		System.out.println(alist.isEmpty());
		
		System.out.println(alist.size());
		
		System.out.println(alist.indexOf(10));
		System.out.println(alist.indexOf("10"));
		System.out.println(alist.indexOf(20));
		System.out.println(alist);
		
		System.out.println(alist.indexOf("abc"));
		System.out.println(alist.indexOf(false));
		System.out.println(alist);
		
		System.out.println(alist.remove(1));
		System.out.println(alist);
		
		System.out.println(alist.remove(false));
		System.out.println(alist);
		
		alist.clear();
		System.out.println(alist);
			
	}

}

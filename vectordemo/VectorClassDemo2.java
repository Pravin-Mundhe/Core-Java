package vectordemo;

import java.util.Vector;

public class VectorClassDemo2 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v1= new Vector<Integer>(5);
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		v1.add(6);
		
		System.out.println(v1);
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		System.out.println("Element at index 1 is "+v1.elementAt(1));
		System.out.println("Element at index 1 is "+v1.get(1));
		System.out.println("Does Vector contain element 15? "+v1.contains(15));
		System.out.println("Is vector empty? "+v1.isEmpty());
		System.out.println("Replace element at index 3 with 20 "+v1.set(3, 20));
		System.out.println(v1);
		System.out.println("Remove element at index 4 "+v1.remove(4));//It adjusts the elements also to fill the frees spaces
		System.out.println(v1);
		Object[] a=v1.toArray();//datatype will remain same and is referred by Object
		System.out.println("Array representation is ");
        for (int i = 0; i < a.length; i++)
        	System.out.print(a[i]+" ");
        
        Vector<Integer> v2= new Vector<Integer>(5);
        v2.add(50);
		System.out.println("\n"+v2);
		System.out.println("Are v1 and v2 equal?"+v2.equals(v1));
	}
}

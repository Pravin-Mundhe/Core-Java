package vectordemo;

import java.util.Vector;

public class VectorClassDemo1 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v1= new Vector<Integer>(); // default size=0, capacity=10
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		
		System.out.println(v1);
		
		Vector<String> v2= new Vector<String>(2);// to store string values
		v2.add("hello");
		v2.add("world");		
		
		System.out.println(v2);
		
		Vector v3= new Vector();	//to take mixed input
		v3.add(1);
		v3.add("hello");
		
		System.out.println(v3);
		
		Vector<Double> v4= new Vector<Double>(2);	//to take double values
		v4.add(4.6);
		v4.add(110.54);
		
		System.out.println(v4);
	}
}

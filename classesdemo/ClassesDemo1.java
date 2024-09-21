package pravin.classesdemo;

public class ClassesDemo1 
{
	int length=10;	
	int width=20;
	
	public int area_rectangle(int l, int w)
	{		
		return l*w;
	}	
	public static void main(String[] args) 
	{
		ClassesDemo1 obj;
		obj= new ClassesDemo1(); // or ClassesDemo1 obj= new ClassesDemo1();
		
		System.out.println("value of length is: "+obj.length);
		System.out.println("value of width is: "+obj.width);	
		
		System.out.println("Area of rectangle is: " + obj.area_rectangle(obj.length, obj.width));
	}

}


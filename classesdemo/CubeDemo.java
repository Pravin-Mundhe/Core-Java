package pravin.classesdemo;

public class CubeDemo 
{
	int length;	
	int width;
	int height;
	
	CubeDemo() //default constructor
	{
		this.length=20;			
		this.width=20;
		this.height=20;	
	}
	
	CubeDemo(int length, int width, int height) 
	{
		this.length=length;			
		this.width=width;
		this.height=height;	
	}
	
	CubeDemo(int length, int width) 
	{
		this.length=length;			
		this.width=width;
		this.height=40;	
	}
	
	CubeDemo(int value) 
	{
		this.length=value;			
		this.width=value;
		this.height=value;	
	}
	
	public int volume()
	{
		return length*width*height;
	}
	
	public static void main(String[] args) 
	{
		int v;
		
		CubeDemo obj1=new CubeDemo();
		v=obj1.volume();
		System.out.println("Cube volume with default constructor is: "+v);	
		
		CubeDemo obj2=new CubeDemo(10,20,30);
		v=obj2.volume();
		System.out.println("Cube volume with constructor having 3 parameters is: "+v);	
		
		CubeDemo obj3=new CubeDemo(10,20);
		v=obj3.volume();
		System.out.println("Cube volume with constructor having 2 parameters is: "+v);	
		
		CubeDemo obj4=new CubeDemo(10);
		v=obj4.volume();
		System.out.println("Cube volume with constructor having 1 parameter is: "+v);
	
	}

}

package garbageCollection;
//User can the make the object null which makes it eligible for 
//the garbage collection. Then, it can request the JVM to invoke 
//the garbage collection by calling System.gc() or 
//Runtime.getRuntime().gc() 
public class GarbageDemo1 
{
	String name;
	
	GarbageDemo1(String name)
	{		
		this.name = name;
		System.out.println("Hello");
	}	
	/*
	protected void finalize()
    {        
        System.out.println(name+" has been successfully garbage collected");
    }
	*/
	public static void main(String[] args) 
	{
		GarbageDemo1 obj1=new GarbageDemo1("Obj1");	//passing the object name as string
		
		obj1=null;	//making the object reference null
		
		System.gc();
		
		GarbageDemo1 obj2=new GarbageDemo1("Obj2");
		
		obj2=null;	
		
		System.gc();	
	}
	
	protected void finalize()
    {        
        System.out.println(name+" has been successfully garbage collected");
    }
	
}

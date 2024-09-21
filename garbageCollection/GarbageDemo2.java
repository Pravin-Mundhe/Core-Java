package garbageCollection;

public class GarbageDemo2 
{
	String name;
	
	GarbageDemo2(String name)
	{		
		this.name = name;
		System.out.println("Hello");
	}	
	
	public static void main(String[] args) 
	{
		GarbageDemo2 obj1=new GarbageDemo2("Obj1");//passing the object name as string
		
		obj1=null;	//making the object reference null
				
		Runtime.getRuntime().gc();
		
		GarbageDemo2 obj2=new GarbageDemo2("Obj2");
		
		obj2=null;			
		Runtime.getRuntime().gc();		
	}
	protected void finalize()
    {        
        System.out.println(name+" has been successfully garbage collected");
    }
}

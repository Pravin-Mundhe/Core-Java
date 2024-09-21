package garbageCollection;

public class GarbageDemo3 
{
	String name;
	
	GarbageDemo3(String name)
	{		
		this.name = name;
		System.out.println("Hello");
	}	
	
	public static void main(String[] args) 
	{
		GarbageDemo3 obj1=new GarbageDemo3("Obj1");
		GarbageDemo3 obj2=new GarbageDemo3("Obj2");		
		
		obj1=obj2;//now the first object referred by obj1 
					//is available for garbage collection  	
						
		System.gc();				
	}
	
	protected void finalize()
    {        
        System.out.println(name+" has been successfully garbage collected");
    }	
}

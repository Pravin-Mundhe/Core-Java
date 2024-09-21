package arrayDemos;

public class OneDArrayDemo3 
{
	void display(int[] a)
	{
		for(int i:a)
			System.out.println(i);		
	}
	/*
	int[] show()
	{
		int[] b={100,200,300,400,500};
		return b;	//returning array from the method
	}
	*/
	public static void main(String[] args) 
	{		
		OneDArrayDemo3 obj= new OneDArrayDemo3();	
		
		int[] a={10,20,30,40,50};
		
		System.out.println("Passing array to a method");
		obj.display(a);		//passing array to a method
		
		/*
		System.out.println();
		
		System.out.println("Returning array from the method");
		int[] b=obj.show();		
		
		for(int i:b)
			System.out.println(i);	
		*/
	}

}

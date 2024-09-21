package pravin.classesdemo;

public class ThisKeywordDemo4 
{   
	void display()
	{	    
		this.show();	// calling function show()	    
	    System.out.println("Inside display function");
	}
	     
	void show() 
	{
	    System.out.println("Inside show function");
	}	     
	 
	public static void main(String args[]) 
	{
		ThisKeywordDemo4 obj = new ThisKeywordDemo4();
	    obj.display();
	}
}

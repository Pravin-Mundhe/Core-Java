package pravin.classesdemo;

public class ThisKeywordDemo3 
{
	int length;	    
   
	ThisKeywordDemo3()
    {
    	length=20;
    }
	
    // Method that receives 'this' keyword as parameter
    void display(ThisKeywordDemo3 obj)
    {
    	System.out.println("length = " + length);
    }
      
    void get()
    {
        display(this); //returns current object
    }
 
    public static void main(String[] args)
    {
    	ThisKeywordDemo3 obj = new ThisKeywordDemo3();
        obj.get();
    }
	

}

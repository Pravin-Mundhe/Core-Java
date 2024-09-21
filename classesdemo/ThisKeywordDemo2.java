package pravin.classesdemo;

public class ThisKeywordDemo2 
{
	int length;	
	
	ThisKeywordDemo2()
	{
		length=20;
	}	
	
	ThisKeywordDemo2 get()//returns current class object
    {
        return this;
    }     
    
    void display()
    {
        System.out.println("length = " + length);
    }
 
    public static void main(String[] args)
    {
    	ThisKeywordDemo2 obj = new ThisKeywordDemo2();
        obj.get().display();
    }

}

package pravin.classesdemo;

public class ThisKeywordDemo1 
{
	int length;	
	
	ThisKeywordDemo1()
	{
		this(10);
        System.out.println("Inside default constructor \n");
	}
	
	ThisKeywordDemo1(int length)
    {
        this.length = length;        
        System.out.println("Inside parameterized constructor");
    }
	
	public static void main(String[] args) 
	{
		ThisKeywordDemo1 obj = new ThisKeywordDemo1();
	}

}

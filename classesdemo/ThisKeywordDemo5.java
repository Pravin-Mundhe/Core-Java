package pravin.classesdemo;

class second
{
	ThisKeywordDemo5 obj2;	
	//ThisKeywordDemo5 obj3=new ThisKeywordDemo5();
    second(ThisKeywordDemo5 obj2)	// object as a parameter
    {
        this.obj2 = obj2;     
        obj2.display();
        System.out.println("This constructor belongs to Second class ");
    }     
}
 
class ThisKeywordDemo5
{
    int x = 10;
    //ThisKeywordDemo5 obj3=new ThisKeywordDemo5();	
    ThisKeywordDemo5()
    {
    	System.out.println("This constructor belongs to Main class ");
    	second obj1 = new second(this);  //this as an argument in the constructor call
    }     
    
    void display()
    {
        System.out.println("Value of x : " + x);
    }
     
    public static void main(String[] args) 
    {
    	ThisKeywordDemo5 obj = new ThisKeywordDemo5();
    }
}

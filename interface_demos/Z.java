package interface_demos;

class Z implements X, X.ABC
{
	public void show()
	{
		System.out.println("Hello");
	}	
	public int isEven(int i)
	{
		if(i%2==0)
			return 1;
		else return 0;
	}
	public static void main(String[] args) 
	{
		Z obj1=new Z();
		obj1.show();
		
		ABC obj=new Z();		
		int r=obj.isEven(10);
		if(r==1)
			System.out.println("Even");
		else 
			System.out.println("Odd");
		
		//obj.show();		
	}
}

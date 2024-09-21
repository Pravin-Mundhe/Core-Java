package inheritance;

public class BDemo 
{
	public static void main(String[] args) 
	{		
		BoxHeight box1=new BoxHeight(10,20,30);
		Box BX=new Box();
		
		int vol=box1.volume();
		
		System.out.println("Volume is:"+ vol);
		
		BX=box1;
		
		vol=BX.volume();
		
		System.out.println("Volume is:"+ vol);
		//System.out.println("Volume is:"+ BX.h);//error:h belongs to subclass

	}

}

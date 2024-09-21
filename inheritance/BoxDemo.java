package inheritance;

public class BoxDemo 
{
	public static void main(String[] args) 
	{		
		BoxHeight box1=new BoxHeight(10,20,30);
		
		int vol=box1.volume();
		
		System.out.println("Volume is:"+ vol);

	}

}

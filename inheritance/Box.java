package inheritance;

public class Box 
{
	int w;
	int d;
	Box()
	{
		w=d=0;
	}
	Box(int w, int d) 
	{		
		this.w = w;
		this.d = d;
	}	
	int volume()
	{
		return w*d;
	}
}

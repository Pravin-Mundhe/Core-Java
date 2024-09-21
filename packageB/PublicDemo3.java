package packageB;

import packageA.PublicDemo2;

public class PublicDemo3  
{
	public int num31;	
	public void display31(int a)
	{
		System.out.println("Number is: "+a);
	}
	
	public static void main(String[] args) 
	{	
		PublicDemo3 obj31=new PublicDemo3();
		obj31.num31=20;
		obj31.display31(obj31.num31);			
		
		/*
		PublicDemo2 obj22=new PublicDemo2();
		obj22.num21=20;
		obj22.display21(obj22.num21);
		*/		
	}

}

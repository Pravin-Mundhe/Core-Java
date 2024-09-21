package inheritance;

public class Finvar 
{
	 final double pi=3.14;//final variable  
	 void change()
	 {  
		 //pi=4.14;  
	 }  
	 public static void main(String args[])
	 {  
		 Finvar obj=new  Finvar();  
		 obj.change();  
	 }
}

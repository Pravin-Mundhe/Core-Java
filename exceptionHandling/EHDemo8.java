package exceptionHandling;

public class EHDemo8 
{			
		static void test() 
		{
			try 
			{
				System.out.println("in test()");
				throw new RuntimeException();
			} 
			catch (Exception e)//if you comment this, last SOP will be unreachable, hence compiler will give error "code unreachable" 
			{
				System.out.println("Exception caught");
			}			
			finally 
			{
				System.out.println("finally_test");
			}
			System.out.println("hello");
		}		
		static void show() 
		{
			try 
			{
				System.out.println("in show()");
				return;
			}			
			finally 
			{
				System.out.println("finally_show");
			}			
		}			
		public static void main(String args[]) 
		{			
			try 
			{
				test();
			} 
			catch (Exception e) 
			{
				System.out.println("Exception caught");
			}
			show();			
		}		
}

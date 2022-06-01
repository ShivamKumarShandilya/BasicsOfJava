package Unit03;

public class Basic_Instruction01 {

	public static void main(String[] args) {
		try 
		{
			int b=0;
			
			int a=100/b;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		//rest of the code!!
		 System.out.println("Done!!");

	}

}

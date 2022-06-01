package Unit03;

public class Basic_Instruction03 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		try
		{
			for(int i=0;i<8;i++)
			{
				System.out.println(arr[i]+"");
			}	
		}
		catch(Exception e)
		{
			System.out.println("Out of index");
		}
	}

}

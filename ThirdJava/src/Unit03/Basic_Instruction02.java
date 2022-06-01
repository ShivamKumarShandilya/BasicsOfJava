package Unit03;

public class Basic_Instruction02 {
    static void stack(int a)
    {
    	while(a>0)
    	{
    		stack(a++);
    	}
    	
    }
	public static void main(String[] args) {
		int a=2;
		stack(a);

	}

}

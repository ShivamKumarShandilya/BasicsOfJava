package unit01;
import java.util.Scanner;
public class p4_task5_SwitchCaseFlow {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		int day;
		System.out.println("Enter day : ");
		day = input.nextInt();
		
		p4_task5_SwitchCaseFlow obj = new p4_task5_SwitchCaseFlow();
		obj.switchTest(day);
		
		input.close();

	}

	public void switchTest(int day) {
		
		switch(day) {
		case 1: System.out.println("day 1 , Monday :)"); break;
		case 2: System.out.println("day 2 , Tuesday :)"); break;
		case 3: System.out.println("day 3 , Wednesday :)"); break;
		case 4: System.out.println("day 4 , Thursday :)"); break;
		case 5: System.out.println("day 5 , Friday :)"); break;
		case 6: System.out.println("day 6 , Saturday :)"); break;
		case 7: System.out.println("day 7 , Sunday :)"); break;
		default : System.out.println("Invalid day!");
		}
		
	}
}



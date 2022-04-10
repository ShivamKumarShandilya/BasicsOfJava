package unit01;

import java.util.Scanner;

public class P7_SwitchStatement {

	public static void main(String[] args) {
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		Scanner myObj = new Scanner(System.in);
		int num;
		System.out.println("Enter Your Choice: ");
		num=myObj.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("Current Year: 2022");
			break;
		case 2: 
			System.out.println("Current Month: April");
			break;
		case 3:
			System.out.println("Current day: Thursday");
			break;
		default:
			System.out.println("Not applicable");
 		}
	}

}

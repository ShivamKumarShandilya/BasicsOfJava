package unit01;

import java.util.Scanner;

public class p4_task02_ifElseControl {
	public static void main(String[] args) {
		
		p4_task02_ifElseControl obj = new p4_task02_ifElseControl();
				
				obj.flowControl();
			}
			
			void flowControl() {
				boolean pass = true;
				
				// if else conditions
				if(pass) 
					System.out.println("You have successfully passed :)");
				else
					System.out.println("Try again :)");
				
				
				// creating scanner object
				Scanner input = new Scanner(System.in);
				
				// if else ladder
				float cgpa;
				System.out.println("Enter CGPA secured : ");
				cgpa = input.nextFloat();
				
				if(cgpa >= 9.0f && cgpa < 10.0f)
					System.out.println("Excellent !");
				else if(cgpa >= 8.5f && cgpa < 9.0f)
					System.out.println("Very good !");
				else if(cgpa >= 7.0f && cgpa < 8.5f)
					System.out.println("Good !");
				else
					System.out.println("Average !");
				
				if(cgpa > 10.f)
					System.out.println("Bad!");
				
				
				input.close();
				
				
				
			}
			
}

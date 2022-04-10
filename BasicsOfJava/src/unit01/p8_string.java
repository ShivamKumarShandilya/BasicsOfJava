package unit01;

public class p8_string {

	public static void main(String[] args) {
		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s2);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		int j = s.length()-1;
		Boolean b = true;
		for(int i = 0 ;i<=j; i++)
		{
			if(s.charAt(i)!= s.charAt(j))
			{
				b = false;
				break;
				
			}j--;
		}
		if(b) {
			System.out.println("string is pallindrome");
		}
		System.out.println("not pallindrome");
		
		
		
		

	}

	void reverseOfAString(String s) {
		String st1=" ";
		for(int i =0 ; i<s.length() ;i++)
		{
			char ch = s.charAt(i);
			st1 = ch+st1;
			
		}System.out.println("reverse "+st1);
	}
	
	
	void stringEqualOrNot(String s1,String s2) {
		if(s1.equals(s2))
		{
			System.out.println("s1 = s2 ");
		}
		else {
			System.out.println("s1 not equal to s2");
		}	
		}
		
}


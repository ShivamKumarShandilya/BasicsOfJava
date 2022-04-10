package unit01;

public class p8_string {

	public static void main(String[] args) {
		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		

	}

	void reverseOfAString(String s) {
		string a1 = "";
		for(int i=0;i<s.lenght();i++)
		{
			char ch = s.charAt(i);
			a1 = ch + a1;
 		}
		System.out.println("Reverse string is; ");
		
	}
	
	void stringEqualOrNot(String s1,String s2) {
		
		
	}
}


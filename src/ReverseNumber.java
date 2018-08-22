
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 52345;
		int reverse = 0;
		int i=input;
		
		while(i!=0)
		{
			reverse = reverse*10+i%10;
			i = i/10;
		}
		
		
		if(input == reverse)
		{
			System.out.println("PALINDROME!");
		}
		else
		{
			System.out.println("INPUT "+input);
			System.out.println("REVERSE "+reverse);
			System.out.println("NOT A PALINDROME!");
		}
	}

}

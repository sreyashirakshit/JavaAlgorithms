
public class PalindromeVariation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "abacaab";
		int n = input.length();
		int no_of_chars = 0;
		
		for(int i=0;i<n/2;i++)
		{
		    
			if(input.charAt(i) != input.charAt(n-1-i))
			{
				
			   no_of_chars++;
			}
				
		}
				
		System.out.println("Minimum characters needed "+no_of_chars);
		
	}

}

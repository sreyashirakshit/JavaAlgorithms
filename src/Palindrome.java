
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 12321;
		String ipStr = String.valueOf(input);
		int length = ipStr.length();
		boolean isPalindrome= true;
		
		for(int i=0;i<(length-1)/2;i++)
		{
			if(ipStr.charAt(i) != ipStr.charAt(ipStr.length()-i-1))
			{ 
				
				System.out.println(ipStr.charAt(i)+" "+ipStr.charAt(ipStr.length()-i-1));
				isPalindrome = false;
				break;
			}
				
		}
		
		if(isPalindrome)
		 System.out.println("Input is palindrome "+input);
		else
			 System.out.println("Input is NOT palindrome "+input);

	}

}

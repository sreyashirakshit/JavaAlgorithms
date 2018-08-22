package LinkedList;

public class Reverse_UsignRecursion {

	static String reverse = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "surface";
		
		System.out.println(reverse(input));

	}
	
	public static String reverse(String text)
	{
		
		if(text.length() == 0)
		 return reverse;
		else
		{
		 reverse += text.charAt(text.length()-1)+ reverse(text.substring(0, text.length()-1));
		return reverse;
		}
	}

}

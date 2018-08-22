import java.util.HashSet;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "ghiatag";
		char charval;
		HashSet<Character> hs = new HashSet<>();
		
		for(int i =0;i<str.toCharArray().length;i++)
		{
			charval = str.charAt(i);
			
			if(!hs.contains(charval))
			{
				System.out.print(charval);
			}
			
			hs.add(charval);
		}

	}

}

import java.util.List;
import java.util.*;

public class ReverseWords_In_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Hello World";
		StringTokenizer str = new StringTokenizer(input);
		List<String> list = new ArrayList<>();
		
		
		while(str.hasMoreTokens())
		{
			list.add(str.nextToken());
			
		}
		
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		
	}
	

}

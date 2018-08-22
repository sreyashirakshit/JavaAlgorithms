import java.util.*;
import java.util.Map.Entry;

public class NumberOfOccurances_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "ABBCADEHID";
		
		char[] ipChar = input.toCharArray();
		int count;
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0;i<ipChar.length;i++)
		{
			count=1;
			
			if(hm.containsKey(ipChar[i]))
			{
				count = hm.get(ipChar[i]);
				count++;
			}
			
			hm.put(ipChar[i], count);
		}
		
		for(Entry<Character,Integer> entry: hm.entrySet())
		{
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		

	}

}

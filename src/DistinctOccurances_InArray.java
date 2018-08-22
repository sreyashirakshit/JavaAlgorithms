import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DistinctOccurances_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {15,3,4,15,6,91,15,3};
		getDistinctValues(a);
	}
	
	public static void getDistinctValues(int[] a)
	{
		Map<Integer,Character> hm = new HashMap<>();
		char chk = 'D';
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]) && chk=='D')
			{
				hm.put(a[i],'X');
			}
			else
			{
				hm.put(a[i],'D');
			}
		}
		
		for(Entry<Integer,Character> entry: hm.entrySet())
		{
			if(entry.getValue().equals('D'))
				System.out.print(entry.getKey()+" ");
		}
	}

}


import java.util.*;
	import java.util.Map.Entry;

	public class MaximumOccurances_InArray 
	{
		
		public static void main(String[] args)
		{
			int a[] = {4,2,2,4,6,7,2};
			
			maxOccur(a);
		}

		public static void maxOccur(int[] a)
		{
			Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
			int max=0;
			
			for(int i=0;i<a.length;i++)
			{
				if(hm.containsKey(a[i]))
				{
					int val = hm.get(a[i]);
				//	System.out.println("oldval "+val);
					int newval = val+1;
					if(max<newval)
					  max = newval;
					hm.put(a[i],newval);
				//	System.out.println(a[i]+" "+newval);
				}
				else
				{
					hm.put(a[i],1);
				}
				
			}
			
			for(Entry<Integer,Integer> entry: hm.entrySet())
			{
				if(entry.getValue().equals(max))
				{
					System.out.println(entry.getKey()+" , " + entry.getValue());
				}
			}
		}
	}



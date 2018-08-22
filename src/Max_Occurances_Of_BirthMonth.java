import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Max_Occurances_Of_BirthMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[] = {"23-Oct-2019","11-May-1979","3-Oct-2000"};
		verifyMonth(a);
	}

public static void verifyMonth(String[] a)
{
	String subStr = "";
	int startIdx=0,endIdx=0,max=1;
	Map<String,Integer> hm = new HashMap<>();
	
	for(int i=0;i<a.length;i++)
	{
	   
		startIdx = a[i].indexOf("-");
		endIdx = a[i].indexOf("-",startIdx+1);
		subStr = (a[i].substring(startIdx+1,endIdx));
		
		if(hm.containsKey(subStr))
		{
			
			int val = hm.get(subStr)+1;
			if(max < val)
				max= max+1;
			hm.replace(subStr,hm.get(subStr), val);
		}
		else
		{
			hm.put(subStr, 1);
		}
	}
	
		for(Entry<String,Integer> entry: hm.entrySet())
		{
	   	if(entry.getValue() == max)
			{
			
				System.out.println("Max. occurred birthmonth "+entry.getKey()+" " + entry.getValue());
			}
		}
	}
	

}

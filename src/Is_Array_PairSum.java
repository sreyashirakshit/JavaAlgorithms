import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Is_Array_PairSum {
	

	public static void main(String[] args)
	{
		
		int[] a = {3, 1, 8, 13, 4,8};
		int sum = 16;
		
		sumPair(a, sum);
		
	}
	
	public static void sumPair(int[] a, int sum)
	{
	    HashSet<Integer> hs = new HashSet<>();
		int temp = 0; 
		
		for(int i=0;i<a.length;i++)
		{
			temp = sum - a[i];
			
			if(temp>0 && hs.contains(temp)) 
			{
				System.out.println("Pair of numbers are "+ a[i]+" and "+temp);
			}
	
			hs.add(a[i]);
		}
		
       
	}
	}

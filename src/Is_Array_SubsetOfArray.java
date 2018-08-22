import java.util.HashSet;

public class Is_Array_SubsetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int  a[] = {11,15,1,11,21};
	int b[] = {31,12};
	
	int s1 = a.length;
	int s2 = b.length;
	
	boolean result = isSubset(a,b,s1,s2);
	
	if(result)
		System.out.println("B is subset of A");
	else
		System.out.println("B is NOT a subset of A");

	}
	
	public static boolean isSubset(int[] a, int[] b, int s1, int s2)
	{
		HashSet<Integer> hm1 = new HashSet<>();
		
		for(int i=0;i<s1;i++)
		{
			if(!hm1.contains(a[i]))
				hm1.add(a[i]);
			System.out.println(hm1);
				
		}
		
		for(int j=0;j<s2;j++)
		{
			if(!hm1.contains(b[j]))
				return false;
				
		}
		
		return true;
	}

}

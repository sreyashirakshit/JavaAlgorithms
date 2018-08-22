import java.util.HashMap;

public class EqualSums {
	
	 class pair
	{
		int f;
		int s;
		
		pair(int first, int second)
		{
			this.f=first;
			this.s = second;
		}
	};

	public static void main(String[] args) {
		int[] a = {9,1,2,6,10,5,7,13,14};
		EqualSums testCls = new EqualSums();
		testCls.findEqualSums(a);
	}
		// TODO Auto-generated method stub

		
	public void findEqualSums(int[] a)
	{
		HashMap<Integer,pair> hm = new HashMap<>();
		int sum = 0;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				sum = a[i]+a[j];
				
				if(hm.containsKey(sum))
				{
					pair p = hm.get(sum);
					System.out.println("2 pairs with same sum of "+sum+"are: {"+a[p.f]+","+a[p.s]+"} and {"+a[i]+","+a[j]+"}");
				}
				else
				{
					pair newPair = new pair(i,j);
					hm.put(sum,newPair);
				}
			}
		}
	}
	
	}


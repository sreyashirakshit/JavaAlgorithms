import java.util.HashMap;

public class Common_Between_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		int[] a = {1,3,7,9};
		int[] b = {12,3,9,11};
		
		if(a.length <b.length)
			commonNum(a,b);
		else
			commonNum(b,a);

	}

	public static void commonNum(int[] x, int[] y)
	{
		HashMap<Integer,Integer> hs = new HashMap<>();
		
		for(int cnt=0;cnt<y.length;cnt++)
		{
			hs.put(y[cnt],0);
		}
		
		for(int cnt1=0;cnt1<x.length;cnt1++)
		{
			int num = 0;
			
			if(hs.containsKey(x[cnt1]))
			{
				num = hs.get(x[cnt1]);
				hs.put(x[cnt1], ++num);
				
				
				if(num == 1)
					System.out.print(x[cnt1]+" ");
			}
	
				
		}
	}
}

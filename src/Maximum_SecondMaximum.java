import java.util.*;

public class Maximum_SecondMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {25,25,7,15,13,2,9};
		
		Compute(a);

	}

	public static void Compute(int[] a)
	{
		int max = 0, secondmax=0;
	//	
	//HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max && a[i]>secondmax)
			{
				secondmax = max;
				max = a[i];
			}
			
			if(a[i]<max && a[i]>secondmax)
			{
				secondmax = a[i];
			}
			
			
		}
		
		System.out.println(max+"  "+secondmax);
		
		
		
	}
}


public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {4,-1,6,-10,6,1};
		
		int tempsum = 0;
		int maxsum = 0;
		int tempidx =0;
		int[] result = new int[3];
		
		for(int i=0;i<a.length;i++)
		{
			tempsum = tempsum + a[i];
			
			if(tempsum > maxsum)
			{
				maxsum = tempsum;
				result[0]=tempidx; //start index
				result[1] =i; // end index
				result[2]=maxsum;		// sum		
			}
			
			if(tempsum<0)
			{
				tempsum =0;
				tempidx = i+1;
			}
				
		
		}
		
		for(int j=0;j<result.length;j++)
				System.out.print(result[j]+" ");
	}

}

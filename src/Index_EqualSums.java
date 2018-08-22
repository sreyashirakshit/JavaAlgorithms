
public class Index_EqualSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {1,3,5,6,3};
		
		System.out.println("Middle index"+ num[equalSums(num)] );
		
		}
	

	public static int equalSums(int[] input)
	{
	int startIdx = 0;
	int endIdx = input.length - 1;
	int startSum = 0;
	int endSum = 0;
	
	while(true)
	{
		if(startSum < endSum)
		startSum += input[startIdx++];
		
		if(startSum > endSum)
		endSum += input[endIdx--];
		
		if(startSum == endSum)
			break;
		if(startIdx > endIdx)
		{ 
			System.out.println("Invalid array");
		}	
		
	}	
    
	return endIdx;
}

}
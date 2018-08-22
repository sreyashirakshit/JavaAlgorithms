
public class Fibonacci {

 static int numOfNum = 5; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = 1;
		int next = 2;
		
		System.out.print(start+" "+next+" ");
		calculate(start,next);

	}
	
	public static void calculate(int start, int end)
	{
		
		int sum = start+end;
		System.out.print(sum+" ");
		numOfNum--;
		
		while(numOfNum-2>0)
		{
           calculate(end,sum);
          
		}
		 
	}

}

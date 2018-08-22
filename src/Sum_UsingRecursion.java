
public class Sum_UsingRecursion {
	int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      Sum_UsingRecursion cal = new Sum_UsingRecursion();
      System.out.println(cal.sumOfDigits(123));
      
	}
	
	public int sumOfDigits(int n)
	{
		if(n==0)
			return sum;
		else
		{
		sum += n%10;
		sumOfDigits(n/10);
		return sum;
		}
		
	}

}

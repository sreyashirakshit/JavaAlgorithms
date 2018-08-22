
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 372;
	
        if(checkArmStrong(input) == input)
        	System.out.println(input+" is Armstrong number");
        else
        	System.out.println(input+" is not Armstrong number");
	}
	
	public static int checkArmStrong(int num)
	{
		int sumOfCubeOfDigits=0;
		int remainder=0;
		
		
		while(num > 0)
		{
		   remainder = num%10; 
           sumOfCubeOfDigits+=remainder*remainder*remainder;
           num/=10;
        
           System.out.println("Remiander "+remainder+" and quotient "+num);
		}
		
				
       return  sumOfCubeOfDigits;
	}

}

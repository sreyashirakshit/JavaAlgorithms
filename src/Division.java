
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 8,b = 2;
		int dividend, divisor;
		int quotient=0, remainder=0;
		
		if(a>b)
		{
			dividend = a;
			divisor = b;
		}
		else
		{
			dividend = b;
			divisor = a;
		}
		
		while(dividend>=divisor)
		{
			remainder = dividend - divisor;
			quotient = quotient+1;
			dividend = remainder;
			
		}
		System.out.println("Quotient="+quotient+" remainder="+remainder);

	}

}

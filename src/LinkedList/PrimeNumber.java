package LinkedList;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int n = 71;
	boolean prime = true;
	
	for(int i=2;i<n;i++)
	{
		if(n%i == 0)
		{
			prime=false;
				break;
		}
	}
	
	if(prime)
		System.out.println(n+ " is a prime number");
	else
		System.out.println(n+ " is NOT a prime number");

	}

}

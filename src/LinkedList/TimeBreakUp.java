package LinkedList;

public class TimeBreakUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 86500;
		
		int q = number/86400;
		
		int days = 0,hrs = 0,min = 0,sec = 0;
		
		if(q>0)
		{
			days = q;
			number = number%86400;
			q=number/3600;
			
			hrs = q;
			number=number%3600;
			q=number/60;

			min = q;
			number=number%60;
				
			sec= number;
	   }
		
		System.out.println("Time :"+days+" "+hrs+" "+min+" "+sec);
			
		}
			

}

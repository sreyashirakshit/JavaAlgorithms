import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Reverse_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "The dog";
		StringTokenizer str = new StringTokenizer(input);
		
		
		
		while(str.hasMoreTokens())
		{
		   reverse(str.nextToken());
			
		}
		
		
	}
	
	public static void reverse(String str)
	{
		char[] a = str.toCharArray();
		char temp;
		
		for(int i=0;i<a.length/2;i++)
		{
			temp = a[a.length-1-i];
			a[a.length-1-i]=a[i];
			a[i]=temp;
			
			
		}
		
		for(int j=0;j<a.length;j++)
			System.out.print(a[j]);
		
		System.out.print(" ");
	}

}

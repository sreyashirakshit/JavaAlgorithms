import java.util.HashMap;
import java.util.Map.Entry;

public class Char_Occurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "ABBBCDAAE";
		
		int length = a.length();
	//	char currChar, prevChar;
		int count=1;
		
		
		for(int i=1;i<length;i++)
		{ 
			
			
			   if(a.charAt(i) == a.charAt(i-1))
               {
            	  count++;
            
            	  if(i==length-1)
            	  {
          
            		  System.out.print(" "+a.charAt(i-1)+count);
            	  }
               }
			   else
			   {
				     System.out.print(" " +a.charAt(i-1)+count);
				   		   
				     count=1;
				     if(i==length-1)
	            	  {
	            		System.out.print(" "+a.charAt(i)+ count);
	            	  }
			   }

		}
			
			
			
		
		//for(Entry<Character,Integer> e: hm.entrySet())
		//{
		//	System.out.print(e.getKey()+" "+e.getValue());
		//}
	}

}

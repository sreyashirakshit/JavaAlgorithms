import java.io.*;
import java.util.*;

public class WordCount_in_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File(".//WordCount.txt");
		FileReader freader = null;
		BufferedReader breader = null;
		try {
			freader = new FileReader(f);
			breader = new BufferedReader(freader);
			
			String line = null;
			
			HashMap<String,Integer> hm = new HashMap<>();
			
			while((line = breader.readLine()) != null)
			{
				StringTokenizer strToken = new StringTokenizer(line);
				
				while(strToken.hasMoreTokens())
				{
					String val = strToken.nextToken();
					int currval = 1;
					if(hm.containsKey(val))
						{
							currval = hm.get(val);
							hm.put(val, currval+1);
							
						}
					else
					{
						hm.put(val, 1);
					}
				}
			}
			
			System.out.println(hm);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			if(freader != null)
				freader.close();
			
			if(breader != null)
				breader.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}

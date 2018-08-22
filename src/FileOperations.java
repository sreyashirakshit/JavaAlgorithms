import java.io.*;

public class FileOperations 
{
	public static void main(String[] args)
	{
		
		File p = new File("./Sreyatest.txt");
		FileWriter fWriter = null;
		BufferedWriter bWriter = null;
		try
		{
			
			fWriter = new FileWriter(p);
		    bWriter  = new BufferedWriter(fWriter);
		   	bWriter.write("Hi!!");
			bWriter.newLine();
			bWriter.write("This is Sreya!");
			bWriter.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if (fWriter !=null)
					fWriter.close();
				
				if (bWriter !=null)
					bWriter.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}	
		}
		
		FileReader ifReader = null;
		BufferedReader ibReader = null;
		
		try
		{
			ifReader = new FileReader(p);
			ibReader = new BufferedReader(ifReader);
			String line = null;
			while((line = ibReader.readLine())!= null)
			{
				System.out.println(line);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try 
			{
				if (ifReader !=null)
					ifReader.close();
				
				if (ibReader !=null)
					ibReader.close();

			}
			catch(IOException e)
			{
				e.printStackTrace();
			}	
		}
	}

}

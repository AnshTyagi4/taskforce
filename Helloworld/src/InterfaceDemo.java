
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class InterfaceDemo
{
	public static void main(String args[]) throws Exception
	{
	
		int i = 15;
		BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
	
		try
		{
			int j = Integer.parseInt(n.readLine());
			int k = i/j;
			System.out.println(k);
		}
		catch(IOException e)
		{
			System.out.println("wrong bro");
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divide a number by  zero" + e);
		}
		catch(Exception e)
		{
			System.out.println("default error" + e);
		}
		finally
		{
			System.out.println("bye");
		}
	}
	
}
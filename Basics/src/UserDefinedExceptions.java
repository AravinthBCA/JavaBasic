// A Class that represents use-defined expception
class MyException extends Exception   // MyException is user class Extends Exception
{
	public MyException(String s)
	{
		// Call constructor of parent Exception
		super(s);           //super() it access the parent class constructor
	}
}

// A Class that uses above MyException
public class UserDefinedExceptions
{
	// Driver Program
	public static void main (String args[]) 
	{
		try
		{
			// Throw an object of user defined exception
			throw new MyException("GeeksGeeks");
		}
		catch (MyException ex)
		{
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}
}

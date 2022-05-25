package exception;

public class CustomerAccountException extends Exception {

	public CustomerAccountException(String notification) 
	{
		super(notification);
	}
}

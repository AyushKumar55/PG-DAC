package custom_exceptions;

@SuppressWarnings("serial")
public class CustomException extends  Exception{
	
	@SuppressWarnings("unused")
	private String message;

	public CustomException(String message) {
		super(message);
	}
	

}

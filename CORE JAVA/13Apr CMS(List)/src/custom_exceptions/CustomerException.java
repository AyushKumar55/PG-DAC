package custom_exceptions;

@SuppressWarnings("serial")
	public class CustomerException extends Exception {
		public CustomerException(String Msg) {
			super(Msg);
		}
	}

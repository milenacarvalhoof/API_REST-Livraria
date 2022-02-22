package gft.livraria.exception;

public class LivrariaException extends RuntimeException{

	private static final long serialVersionUID = -7491873932486289748L;
	
	private String message;

	public LivrariaException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}

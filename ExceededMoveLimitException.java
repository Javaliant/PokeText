/* Author: Luigi Vincent */

public class ExceededMoveLimitException extends RuntimeException {
	public ExceededMoveLimitException(){
        super();
    }

    public ExceededMoveLimitException(String message){
        super(message);
    }
}
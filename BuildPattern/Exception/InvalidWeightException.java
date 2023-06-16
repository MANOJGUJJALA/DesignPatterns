package BuildPattern.Exception;

public class InvalidWeightException extends RuntimeException{

    public InvalidWeightException() {
        super();
    }

    public InvalidWeightException(String message) {
        super(message);
    }

    public InvalidWeightException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidWeightException(Throwable cause) {
        super(cause);
    }

    protected InvalidWeightException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

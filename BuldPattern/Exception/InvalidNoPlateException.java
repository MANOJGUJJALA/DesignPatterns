package BuldPattern.Exception;

public class InvalidNoPlateException extends RuntimeException{
    public InvalidNoPlateException() {
        super();
    }

    public InvalidNoPlateException(String message) {
        super(message);
    }

    public InvalidNoPlateException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNoPlateException(Throwable cause) {
        super(cause);
    }

    protected InvalidNoPlateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

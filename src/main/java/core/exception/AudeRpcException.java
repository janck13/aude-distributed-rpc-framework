package core.exception;

/**
 * Created by lrkin on 2016/11/19.
 */
public class AudeRpcException extends RuntimeException {
    public AudeRpcException() {
    }

    public AudeRpcException(String message) {
        super(message);
    }

    public AudeRpcException(String message, Throwable cause) {
        super(message, cause);
    }

    public AudeRpcException(Throwable cause) {
        super(cause);
    }

    public AudeRpcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

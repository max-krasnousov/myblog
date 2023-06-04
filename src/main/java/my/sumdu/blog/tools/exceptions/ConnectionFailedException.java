package my.sumdu.blog.tools.exceptions;

public class ConnectionFailedException extends Exception {
    public ConnectionFailedException(String errorMessage) {
        super(errorMessage);
    }

    public ConnectionFailedException(Throwable err) {
        super(err);
    }

    public ConnectionFailedException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}

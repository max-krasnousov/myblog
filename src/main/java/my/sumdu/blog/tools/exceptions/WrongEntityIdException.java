package my.sumdu.blog.tools.exceptions;

public class WrongEntityIdException extends Exception{
    public WrongEntityIdException(String errorMessage) {
        super(errorMessage);
    }

    public WrongEntityIdException(Throwable err) {
        super(err);
    }

    public WrongEntityIdException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}

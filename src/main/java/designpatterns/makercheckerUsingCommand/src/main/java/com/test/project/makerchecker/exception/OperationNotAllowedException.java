package designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.exception;

public class OperationNotAllowedException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public OperationNotAllowedException(String exception) {
        super(exception);
    }
}

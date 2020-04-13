package designpatterns.behavior.chainOfResponsibilty;


public abstract class LogHandler {

    private LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public LogHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void  display(String message, Log type);
}

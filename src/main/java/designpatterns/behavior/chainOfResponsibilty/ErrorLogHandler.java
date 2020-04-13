package designpatterns.behavior.chainOfResponsibilty;

public class ErrorLogHandler extends LogHandler {

    @Override
    public void display(String message,Log type) {
        if(type.equals(Log.ERROR)) {
            System.out.println(message);
        }
    }
    }


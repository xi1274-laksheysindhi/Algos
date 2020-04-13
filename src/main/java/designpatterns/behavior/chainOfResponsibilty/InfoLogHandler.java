package designpatterns.behavior.chainOfResponsibilty;

public class InfoLogHandler extends LogHandler {

    @Override
    public void display(String message, Log type) {
        if (type.equals(Log.INFO)) {
            System.out.println(message);
        } else {
            getNextHandler().display(message, type);
        }
    }
}


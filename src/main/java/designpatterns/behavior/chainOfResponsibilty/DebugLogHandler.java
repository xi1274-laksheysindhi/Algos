package designpatterns.behavior.chainOfResponsibilty;

public class DebugLogHandler extends LogHandler {

    @Override
    public void display(String message, Log type) {


        if (type.equals(Log.DEBUG)) {
            System.out.println(message);
        } else {
            getNextHandler().display(message, type);
        }
    }

}

package designpatterns.behavior.chainOfResponsibilty;

// For chain of responsibility
// We have implemented Log
// in this we have passed type as Log.ERROR
// So our flow will start from debug log if type is not of debug it will pass to next handler that is info
// it is not of info type so control will go to type ERROR and perform task.
public class ExecutorClass {

    public static void main(String[] args) {

        LogHandler debug = new DebugLogHandler();
        LogHandler error = new ErrorLogHandler();
        LogHandler info = new InfoLogHandler();

        debug.setNextHandler(info);
        info.setNextHandler(error);
        debug.display("Error message", Log.ERROR);
    }
}

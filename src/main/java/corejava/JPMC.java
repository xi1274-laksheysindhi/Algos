package corejava;

public class JPMC {

    private static JPMC INSTANCE;

    private JPMC() {

    }
//
//    public static JPMC getInstance() {
//
//        if(INSTANCE == null) {
//            synchronized(INSTANCE) {
//                INSTANCE = new JPMC();
//            }
//        }
//        return INSTANCE;
//    }


    public class JPMCInner {
        private JPMC INSTANCE = new JPMC();
    }


}

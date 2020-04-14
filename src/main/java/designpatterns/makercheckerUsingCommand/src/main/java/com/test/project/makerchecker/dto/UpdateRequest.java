package designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.dto;

public class UpdateRequest {

    private long transactionId;
    private String activeUser;
    private long previousTransactionId;

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(String activeUser) {
        this.activeUser = activeUser;
    }

    public long getPreviousTransactionId() {
        return previousTransactionId;
    }

    public void setPreviousTransactionId(long previousTransactionId) {
        this.previousTransactionId = previousTransactionId;
    }
}

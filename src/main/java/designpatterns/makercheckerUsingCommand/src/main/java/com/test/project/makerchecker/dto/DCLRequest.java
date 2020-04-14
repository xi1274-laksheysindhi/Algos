package designpatterns.makercheckerUsingCommand.src.main.java.com.test.project.makerchecker.dto;

import java.util.List;

public class DCLRequest {

    List<Long> requestIds;

    String activeUser;

    public String getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(String activeUser) {
        this.activeUser = activeUser;
    }

    public List<Long> getRequestIds() {
        return requestIds;
    }

    public void setRequestIds(List<Long> requestIds) {
        this.requestIds = requestIds;
    }
}
